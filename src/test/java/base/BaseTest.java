package base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private WebDriver driver;

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mcms-webapp.apps.iscpocp-test.ocpdomain.local/mcms-webapp/");
        //to make the window maximize//
       // driver.manage().window().maximize(); //

        //To make the window size full screen//
        driver.manage().window().fullscreen();


        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setup();

    }
}
