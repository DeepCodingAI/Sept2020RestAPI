package employeeinfo;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class AllEmployeeResourcesAPI {

    String baseUrl = "http://info.venturepulse.org:8080/service-webapp";


    public void getAllEmployeeResources(){
        Response response = given().when().get(baseUrl+"/api/AllEmployeeResources").then().statusCode(200).extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode,200);
    }
}
