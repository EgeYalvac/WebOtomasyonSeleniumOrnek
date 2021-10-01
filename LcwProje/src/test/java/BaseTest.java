import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)



public class BaseTest {

    WebDriver driver;
    Login login;

    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.lcwaikiki.com/tr-TR/TR/");
        login=new Login(driver);

    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }


}


