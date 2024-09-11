package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class RegistrationPage {
    public static String registration_heading_xpath = "/html/body/center/h1";

    public void visibility_registration_heading() {
        String getregistration = driver.findElement(By.xpath(registration_heading_xpath)).getText();

    }
}
