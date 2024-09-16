package resources.staticResources;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class GlobalStatic {

    public static int testcaseId;

    public static WebDriver driver;

    public static Properties prop;

    public static  void generateId(int id){
        testcaseId=id;
    }

}