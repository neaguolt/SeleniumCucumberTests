package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class RegistrationPage extends BrowserDriver {
    public static String registration_heading_xpath = "/html/body/center/h1";

    public RegistrationPage(String browser) {
        // Call the parent class (BrowserDriver) constructor
        super(browser);
    }
    public static String visibility_registration_heading() {
        return driver.findElement(By.xpath
                (registration_heading_xpath)).getText();
    }
}
