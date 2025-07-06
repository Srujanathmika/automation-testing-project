package hook;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import base.Baseclass;


public class Hook {

    @Before
    public void setup(){
        System.out.println("Opening Browser.....");
        Baseclass.initializebrowser();
    }
    @After
    public void teardown(){
        System.out.println("Closing Browser");
        Baseclass.quitBrowser();
    }
}
