package getEmployeeInfoTest;

import employeeinfo.AllEmployeeResourcesAPI;
import org.testng.annotations.Test;

public class GetAllEmployeeProfile extends AllEmployeeResourcesAPI {

    @Test
    public void getAllEmployee(){
        getAllEmployeeResources();
    }
}
