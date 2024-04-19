/*
package org.example;

import io.cucumber.core.backend.ObjectFactory;
import org.junit.Before;
import org.picocontainer.MutablePicoContainer;
import org.picocontainer.PicoBuilder;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class APIClass implements ObjectFactory {

   */
/* APIClass() {

        loadenvironmentvariables();
    }*//*


    MutablePicoContainer pico;
     Properties properties = new Properties();

    public void loadenvironmentvariables(){
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
            properties.load(APIClass.class.getResourceAsStream(propertiesFilePath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void start() {
        pico=new PicoBuilder()
                .withCaching()
                .withLifecycle()
                .build();
        loadenvironmentvariables();

        pico.start();

    }

    @Override
    public void stop() {

    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return false;
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        try {
            T instance = aClass.getDeclaredConstructor().newInstance();
            if (instance instanceof EnvironmentProperties) {
                ((EnvironmentProperties) instance).setEnvironmentProperties((properties));
            }
            return instance;
        } catch (Exception e) {
            System.err.println("Error creating instance: " + e.getMessage());
            return null;
        }
    }
}

*/
