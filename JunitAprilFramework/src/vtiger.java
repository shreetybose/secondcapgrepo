import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class vtiger {
  private WebDriver driver;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:/Users/Windows-7/Downloads/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("http://localhost:100");
  }

  @Test
  public void loginlogout() throws Exception {
    
    try {
      assertEquals("vtiger CRM - Commercial Open Source CRM", driver.getTitle());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//font")).click();
    try {
      assertEquals("Key Modules", driver.findElement(By.xpath("//font")).getText());
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("admin");
    driver.findElement(By.name("login_theme")).click();
    new Select(driver.findElement(By.name("login_theme"))).selectByVisibleText("blue");
    driver.findElement(By.name("Login")).click();
    driver.findElement(By.linkText("Logout")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

 
}

