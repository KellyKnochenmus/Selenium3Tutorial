package BasicWebPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass_FireFoxSe3 {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/Applications/selenium-java-3.5.3/geckodriver");
        driver = new FirefoxDriver();
        String baseURL = "http://www.google.com";
        driver.get(baseURL);
    }
}
