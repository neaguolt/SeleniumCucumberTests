package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserDriver {
    public static WebDriver driver;
    public FirefoxOptions options;

    public BrowserDriver() {
        this.driver=driver;
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+
                "/src/test/resources/drivers/geckodriver");
        this.driver=new FirefoxDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }
    public void close(){
        this.driver.close();
    }

}
