package getEmployeeInfoTest;

import employeeinfo.SingleEmployeeResources;
import org.testng.annotations.Test;

public class GetSingleEmployeeResources extends SingleEmployeeResources {

    @Test
    public void getSingleEmployeeProfileValidRequest(){
        getSingleEmployeeResources();
    }

    @Test
    public void getSingleEmployeeProfileInValidRequest(){
        callSingleEmployeeResourcesWithInValidRequest();
    }
}
