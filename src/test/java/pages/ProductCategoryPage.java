package pages;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class ProductCategoryPage {
    public static String productcategory_heading_xpath = "//*[@id=\"ShoeType\"]";

    public static void visibility_productcategory() {
         driver.findElement(By.xpath(productcategory_heading_xpath));
    }
}

