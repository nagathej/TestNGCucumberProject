/*
package org.example;


import io.cucumber.core.backend.ObjectFactory;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoBuilder;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;



public class ApiContainersClass  {
  static  Properties properties;
    static {

        System.out.println("load environemnt successfully");
        String environment=System.getProperty("envTarget");
        if(environment==null){
            environment="dev";
        }
        String propertiesFilePath = "/apitest-"+environment+".properties";
        System.out.println("environment choosen is: " + environment);
        System.out.println("environment properties file choosen is: " + propertiesFilePath);
         properties = new Properties();
        try {
            properties.load(ApiContainer.class.getResourceAsStream(propertiesFilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    */
/*private void loadEnvironmentProperties() throws IOException {
        // Load environment properties from a file or any other source
        // Example: environmentProperties.load(new FileInputStream("path/to/env.properties"));
        System.out.println("load environemnt successfully");
        String environment=System.getProperty("envTarget");
        if(environment==null){
            environment="dev";
        }
        String propertiesFilePath = "/apitest-"+environment+".properties";


        System.out.println("environment choosen is: " + environment);
        String propFileName = "/apitest-"+environment+".properties";
        System.out.println("environment properties file choosen is: " + propertiesFilePath);
        Properties properties = new Properties();
        System.out.println(ApiContainer.class.getResourceAsStream(propertiesFilePath));

        properties.load(ApiContainer.class.getResourceAsStream(propertiesFilePath));
        pico.addComponent(Properties.class, properties);

    }

    @Override
    public void start() {

        pico = new PicoBuilder()
                .withCaching()
                .withLifecycle()
                .build();
        try {
            loadEnvironmentProperties();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        pico.start();


    }

    public void stop() {
        pico.stop();
        pico.dispose();

    }

    public boolean addClass(Class<?> clazz) {
        addConstructorDependencies(clazz);
        return true;
    }

    private void addConstructorDependencies(Class<?> clazz) {
        for (Constructor<?> constructor : clazz.getConstructors()) {
            for (Class<?> paramClazz : constructor.getParameterTypes()) {
                addClass(paramClazz);
            }
        }
    }

    public <T> T getInstance(Class<T> aClass) {
        return pico.getComponent(aClass);
        }*//*

}
*/
