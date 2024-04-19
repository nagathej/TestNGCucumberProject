
package org.example;

import cucumber.runtime.Utils;
import io.cucumber.core.backend.ObjectFactory;
import lombok.Data;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
@Data
public class ApiContainer implements ObjectFactory {

    private MutablePicoContainer pico;
    private final Set<Class<?>> classes = new HashSet<>();

    @Override
    public void start() {
        System.out.println("Api container Started is called successfully");
        pico = new PicoBuilder()
                .withCaching()
                .withLifecycle()
                .build();
        try {
            customRegisters();

            for (Class<?> clazz : classes) {
                if (pico.getComponent(clazz) == null) {
                    pico.addComponent(clazz);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        pico.start();
    }

    private void customRegisters() throws IOException {
        String environment = System.getProperty("envTarget");
        if (environment == null) {
            environment = "dev";
        }
        System.out.println("environment choosen is: " + environment);
        String propFileName = switch (environment) {
            case "dev" -> "/apitest-dev.properties";
            case "local" -> "/apitest-local.properties";
            case "qa" -> "/apitest-qa.properties";
            case "acceptance" -> "/apitest-acceptance.properties";
            case "stage" -> "/apitest-stage.properties";
            case "perf" -> "/apitest-perf.properties";
            default -> throw new IOException(
                    "Wrong environment. 'envTarget' system variable should be set with these possible options: [local, dev, qa,acceptance].");
        };

        System.out.println("environment properties file choosen is: " + propFileName);
        Properties properties = new Properties();
        properties.load(ApiContainer.class.getResourceAsStream(propFileName));
        pico.addComponent(Properties.class, properties);
    }

    @Override
    public void stop() {
        pico.stop();
        pico.dispose();
    }

    @Override
    public <T> T getInstance(Class<T> type) {
        return pico.getComponent(type);
    }

    public boolean addClass(Class<?> clazz) {
        if(Utils.isInstantiable(clazz)&&classes.add(clazz)) {
            addConstructorDependencies(clazz);
        }
        return true;
    }

    private void addConstructorDependencies(Class<?> clazz) {
        for (Constructor<?> constructor : clazz.getConstructors()) {
            for (Class<?> paramClazz : constructor.getParameterTypes()) {
                addClass(paramClazz);
            }
        }
    }
}
