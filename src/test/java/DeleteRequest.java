import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;



    import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteRequest
    {
        @Test
        public void delete_Method()
        {
            baseURI="http://dummy.restapiexample.com/api";

            when()
                    .delete("/delete/719")
                    .then()
                    .statusCode(405)
                    .log().all();
        }

    }






