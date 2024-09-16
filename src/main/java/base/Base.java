package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import resources.staticResources.GlobalStatic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public void loadProperties() throws IOException {
        FileInputStream file = new FileInputStream("C:\\Frontend\\frontend-framework1\\src\\main\\java\\config\\config.properties");
        GlobalStatic. prop = new Properties();
        GlobalStatic.prop.load(file);

    }

    public void specificBrowser(String browserName) {
        if (browserName.equals("Chrome") || browserName.equals("chrome"))
            GlobalStatic. driver= new ChromeDriver();

        if(browserName.equals("FireFox")||browserName.equals("firefox"))
            GlobalStatic.driver=new FirefoxDriver();
        if(browserName.equals("Edge")||browserName.equals("edge"))
            GlobalStatic. driver=new EdgeDriver();

    }
    public void launch() throws IOException {
        loadProperties();
        String br=GlobalStatic.prop.getProperty("browser");
        specificBrowser(br);
        GlobalStatic.driver.get("https://www.facebook.com/");
        GlobalStatic.driver.manage().window().maximize();

    }
}
