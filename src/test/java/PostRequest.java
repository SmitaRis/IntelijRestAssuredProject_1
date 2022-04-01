
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PostRequest {

    @Test
    void post_request(){
        //created json object to add field values in key and value format
        JSONObject req=new JSONObject();
        req.put("name","test");
        req.put("salary",123);
        req.put("age",23);
        //base URI
        baseURI="http://dummy.restapiexample.com/api";

        given()
                //adding the content type of request
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                //converting the req object to string type while passing in body
                .body(req.toJSONString())
                .when()
                //adding the end points
                .post("/v1/create")
                .then()
                //validating the status code
                .statusCode(200)
                //checking the response body for name
                .body("data.name",equalTo("test"))
                //checking the response body for salary
                .body("data.salary",equalTo(123))
                //checking the response body for age
                .body("data.age",equalTo(23))
                .log().all();





    }






}
