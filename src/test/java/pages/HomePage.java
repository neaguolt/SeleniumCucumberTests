package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class HomePage extends BrowserDriver {
    public static String hamburger_menu_xpath="/html/body/div/nav/div/input";
    public static String signIn_link_xpath="/html/body/div/nav/div/ul/a[2]/li";

    public HomePage(String browser) {
        super(browser);
    }

    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_singIn_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(signIn_link_xpath)).click();
    }

}
