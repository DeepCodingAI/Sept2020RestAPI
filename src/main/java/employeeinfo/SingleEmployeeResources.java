package employeeinfo;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class SingleEmployeeResources {

    String baseUrl = "http://info.venturepulse.org:8080/service-webapp";


    public void getSingleEmployeeResources(){
        Response response = given().when().get(baseUrl+"/api/SingleEmployeeResources/5ff7b9652fc21306c59859d6").then().statusCode(200).extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, statusLine);
        Assert.assertEquals(statusCode,200);
    }

    public void callSingleEmployeeResourcesWithInValidRequest(){
        Response response = given().when().get(baseUrl+"/api/SingleEmployeeResourcesBadRequest/590a4acd35522970c7956cdf").then().statusCode(404).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.statusCode();
        String body = response.getBody().prettyPrint();
        System.out.println(statusLine);
        Assert.assertEquals(statusLine,"HTTP/1.1 404 Not Found");
        Assert.assertEquals(statusCode,404);
    }

    public static int getSingleEmployeeWithValidRequest(String baseUrl,String path){
        Response response = get(baseUrl+ path);
        String statusLine = response.getStatusLine();
        int statusCode = response.statusCode();
        return statusCode;
    }

    public static int getSingleEmployeeWithInValidRequest(String baseUrl,String path){
        Response response = get(baseUrl+ path);
        String statusLine = response.getStatusLine();
        int statusCode = response.statusCode();
        return statusCode;
    }
}
