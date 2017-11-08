package BasicWebPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass_ChromeSe3 {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","/Applications/selenium-java-3.5.3/chromedriver");
        driver = new ChromeDriver();
        String baseURL = "http://www.google.com";
        driver.get(baseURL);
    }
}
