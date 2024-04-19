package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import lombok.Data;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


import java.io.FileNotFoundException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
@Component
@Data
@Configuration
@PropertySource("classpath:Constants.yml")
@ConfigurationPropertiesScan("StepDefinition")
public class Demo {
    private ValidatableResponse validatableResponse;

    String endpoint;
   // ReadYaml ryml;
    public  Demo(Properties properties)  {
        endpoint=properties.getProperty("oms.offer.request.host");



    }

    @Given("^I invoke get request to get the user details of employee id$")
    public void getRequest() {
        System.out.println("end point is "+endpoint);
        validatableResponse=given().contentType(ContentType.JSON).when().get(endpoint).then();
    }
    @Then("^the response will return status (\\d+) and id (\\d+) and salary \"([^\"]*)\" and name \"([^\"]*)\" and age \"([^\"]*)\" and message \"([^\"]*)\"$")
    public void verifyStatus(int statusCode, int id, String movie, String rating, String image, String imdb_url ){

        validatableResponse.assertThat().statusCode(statusCode);

        //validatableResponse.assertThat().body("data.id",equalTo(id));

        validatableResponse.assertThat().body("movie",equalTo(movie));

        //validatableResponse.assertThat().body("rating",equalTo(rating));

        validatableResponse.assertThat().body("image",equalTo(image));

        validatableResponse.assertThat().body("imdb_url",equalTo(imdb_url));

        System.out.println("Test Case is passed successfully");

    }

}
