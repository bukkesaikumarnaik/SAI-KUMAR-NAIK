package BasicAnnotationsExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {

    WebDriver driver;
    @Test(groups="Chrome")
    public void LaunchChrome() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\naiks\\\\Downloads\\\\chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(groups="Chrome", dependsOnMethods="LaunchChrome")
    public void TryFacebook1() {
        System.out.println(Thread.currentThread().getId());
        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("12345");
        driver.findElement(By.id("loginbutton")).click();
       
    }
    
    @Test(groups="Firefox")
    public void LaunchFirefox() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\naiks\\Downloads\\geckodriver-v0.31.0-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    @Test(groups="Firefox", dependsOnMethods="LaunchFirefox")
    public void TryFacebook2() {
        System.out.println(Thread.currentThread().getId());
        driver.findElement(By.id("email")).sendKeys("ravi10thstudent@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("ravi28394");
        driver.findElement(By.id("loginbutton")).click();
        System.out.println(Thread.currentThread().getId());
    }
    
}