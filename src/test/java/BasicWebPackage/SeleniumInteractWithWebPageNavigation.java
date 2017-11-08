package BasicWebPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SeleniumInteractWithWebPageNavigation {
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
        //get the Title of the webpage and print it
        String strTitle = driver.getTitle();
        System.out.println("Title of web page = '"+strTitle+"'");
        //get the Current URL of the webpage and print it
        String strCurrentURL = driver.getCurrentUrl();
        System.out.println("Current URL of web page = '"+strCurrentURL+"'");
        //Navigate to a specific URL and print the new current URL
        String strNewURL = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
        driver.navigate().to(strNewURL);
        strCurrentURL = driver.getCurrentUrl();
        System.out.println("Current URL of specific web page = '"+strCurrentURL+"'");
        //Wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Navigate "back" in the browser and print the new current URL
        driver.navigate().back();
        strCurrentURL = driver.getCurrentUrl();
        System.out.println("Current URL after Back = '"+strCurrentURL+"'");
        //Wait for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Navigate "forward" in the browser and print the new current URL
        driver.navigate().forward();
        strCurrentURL = driver.getCurrentUrl();
        System.out.println("Current URL after Forward = '"+strCurrentURL+"'");
        //Refresh the webpage
        driver.navigate().refresh();
    }

    @AfterTest
    public void tearDown() throws Exception {
        //driver.quit();
    }
}
