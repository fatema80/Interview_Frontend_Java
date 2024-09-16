import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.staticResources.GlobalStatic;
import utilities.ScreenShotUtility;

import java.io.IOException;

@Listeners({utilities.ExternalReports.class})
public class SampleTest extends Base {
    @BeforeMethod
    public void setUp() throws IOException {
        launch();


    }

    @Test
    public void testcase1() throws IOException {

        GlobalStatic.generateId(01);
        ScreenShotUtility.takeScreenShot("Homepage");



    }

    @AfterMethod
    public void tearDown(){
        GlobalStatic.driver.close();
    }}






