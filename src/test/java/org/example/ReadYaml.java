package org.example;

import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class ReadYaml {
    Yaml yaml = new Yaml();
    Map<String, Object> yamlData;

    public void yamlReadData() throws FileNotFoundException {

        FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/Constants.yml");
         yamlData = yaml.load(inputStream);
    }
    public  String getYmlConfig(String data,String data1){
        Map<String, Object> employeeData = (Map<String, Object>) yamlData.get(data);
        return (String) employeeData.get(data1);
    }


    public  int getYmlintConfig(String data,String data1){
        Map<String, Object> employeeData = (Map<String, Object>) yamlData.get(data);

        int value=(int) employeeData.get(data1);
        System.out.println(value);
        return (int) employeeData.get(data1);
    }

}
