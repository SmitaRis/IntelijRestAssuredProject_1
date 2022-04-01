import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

public class GetAllEmployeeRequest {

    @Test
    public void getMethod()
    {
        baseURI="http://dummy.restapiexample.com/api";
        given()
                .get("/employees")
                .then()
                //check the status code is 200 or not
                .statusCode(200)
                //check for the Employee name is present or not
                .body("data.employee_name",hasItems("Tiger Nixon","Brielle Williamson","Rhona Davidson","Colleen Hurst"))
                //check for employee salary
                .body("data.employee_salary",hasItems(320800,103600,342000,385750,198500))
                //check for employee age
                .body("data.employee_age",hasItems(61,64,59,41,40,21,23))
                //log all the details
                .log().all();



    }











}
