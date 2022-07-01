package demoblazegroup.carina.demo;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import demoblazegroup.carina.demo.api.GetTypicodeApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class APITypicodeTest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test(description = "Test for checking basic response from API")
    @MethodOwner(owner = "Carlos Cristaldo")
    public void getApiTest(){
        GetTypicodeApi getTypicodeApi = new GetTypicodeApi();
        getTypicodeApi.callAPIExpectSuccess();
        getTypicodeApi.validateResponseAgainstSchema("api/users/tipycode/_get/rsTypicode.schema");
    }
}
