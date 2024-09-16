package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import resources.staticResources.GlobalStatic;

import java.io.File;
import java.io.IOException;


public class ScreenShotUtility {
    public static void takeScreenShot(String screenShotNsme) throws IOException {
        TakesScreenshot screenShot = (TakesScreenshot) GlobalStatic.driver;
        File source= screenShot.getScreenshotAs(OutputType.FILE);
        File destination= new File("C:/SavedScreenshot/"+GlobalStatic.testcaseId+"/"+screenShotNsme+".png");
        FileUtils.copyFile(source,destination);




    }


}
