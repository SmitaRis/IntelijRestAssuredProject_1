import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class GetSingleEmployeeRequest {

    @Test
    public void getMethod()
    {
        baseURI="http://dummy.restapiexample.com/api";
        given()
                .get("/v1/employee/1")
                .then()
                //check the status code is 200 or not
                .statusCode(200)
                //check for the Employee name is present or not
                .body("data.employee_name",equalTo("Tiger Nixon"))
                //check for employee salary
                .body("data.employee_salary",equalTo(320800))
                //check for employee age
                .body("data.employee_age",equalTo(61))
                //check for profile image
                .body("data.profile_image",equalTo(""))
                //log all the details
                .log().all();



    }











}
