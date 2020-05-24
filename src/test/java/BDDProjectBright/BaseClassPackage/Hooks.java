package BDDProjectBright.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    DriverFactory driverFactory = new DriverFactory(); //Create DriverFactory class object
    //now using DriverFactory object we will call openBrowser and tearDown method

    @Before
    public void setup() {
        driverFactory.openBrowser();
    }

    @After
    public void tearDown() {
        driverFactory.closeBrowser();
    }


}
