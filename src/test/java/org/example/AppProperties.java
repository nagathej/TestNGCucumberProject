/*
package org.example;

import java.io.IOException;
import java.util.Properties;

public class AppProperties {

    private void customRegisters() throws IOException {

        String environment = System.getProperty("envTarget");
        System.out.println(environment);
        if (environment == null) {
            environment = "dev";
        }
        System.out.println("environment choosen is: " + environment);
        String propFileName = "";

        if (environment.equals("dev")) {
            propFileName = "/apitest-dev.properties";
        } else if (environment.equals("local")) {
            propFileName = "/apitest-local.properties";
        } else if (environment.equals("qa")) {
            propFileName = "/apitest-qa.properties";
        } else if (environment.equals("acceptance")) {
            propFileName = "/apitest-acceptance.properties";
        } else if (environment.equals("stage")) {
            propFileName = "/apitest-stage.properties";
        } else if (environment.equals("perf")) {
            propFileName = "/apitest-perf.properties";
        } else {
            throw new IOException("Wrong environment. 'envTarget' system variable should be set with these possible options: [local, dev, qa,acceptance].");
        }
        System.out.println("environment properties file choosen is: " + propFileName);
        Properties properties = new Properties();
        properties.load(CustomObjectFactory.class.getResourceAsStream(propFileName));

    }









    }
*/
