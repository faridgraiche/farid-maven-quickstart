package maven;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class AppTest {

    WebDriver driver;
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","/Users/farid/eclipse-workspace/mavenProject/src/driver/chromedriver 2");
        driver = new ChromeDriver();
        driver.get("https://www.statefarm.com/");
    }
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

}
