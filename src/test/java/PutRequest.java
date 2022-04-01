
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutRequest {

    @Test
    void put_request() {
        //created json object to add field values in key and value format
        JSONObject req = new JSONObject();
        req.put("name", "smita");
        req.put("salary", 5000);
        req.put("age", 27);
        //base URI
        baseURI = "http://dummy.restapiexample.com/api";

        given()
                //adding the content type of request
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                //converting the req object to string type while passing in body
                .body(req.toJSONString())
                .when()
                //adding the end points
                .put("/v1/update/21")
                .then()
                //validating the status code
                .statusCode(200)
                //checking the response body for name
                .body("data.name", equalTo("smita"))
                //checking the response body for salary
                .body("data.salary", equalTo(5000))
                //checking the response body for age
                .body("data.age", equalTo(27))
                .log().all();

    }

}
