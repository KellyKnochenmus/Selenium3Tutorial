package BasicWebPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumInteractWithWebElements {
    //define WebDriver element
    WebDriver driver;
    //define String element for baseURL
    String baseURL;

    @BeforeTest //will run before each @Test method
    public void setUp() throws Exception {
        //Tells Se where to find the Chrome Driver
        System.setProperty("webdriver.chrome.driver","/Applications/selenium-java-3.5.3/chromedriver");
        //Initiates the ChromeDriver and starts the Chrome browser
        driver = new ChromeDriver();
        //sets the baseURL
        baseURL = "http://letskodeit.teachable.com/";
        //sets the implicit wait time
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximizes the browser
        driver.manage().window().maximize();
    }

    @Test
    public void test() {
        //navigate the browser to the baseURL website
        driver.get(baseURL);
        //find the Login link and click it
        driver.findElement(By.xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
        //find the username input field and clear it
        driver.findElement(By.id("user_email")).clear();
        //find the username input field and enter data into it
        driver.findElement(By.id("user_email")).sendKeys("test@email.com");
        //find the password input field and enter data into it
        driver.findElement(By.id("user_password")).sendKeys("test");
    }

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }

}
