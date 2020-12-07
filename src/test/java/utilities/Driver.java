package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver==null){

//

            WebDriverManager.chromedriver().setup(); // System.SetProperty nin karşılığı
            driver=new ChromeDriver();

        }

        return driver;
    }

    public static void quitDriver(){

        if (driver!=null){
            driver.quit();
            driver = null;
        }

    }
}
