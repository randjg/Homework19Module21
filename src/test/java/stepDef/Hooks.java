package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.bs.A;

public class Hooks extends BaseTest{

    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
