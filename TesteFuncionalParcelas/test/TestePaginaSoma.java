

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;


public class TestePaginaSoma {
    
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() throws MalformedURLException {
    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.firefox());
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void teste() {
    // Test name: teste
    // Step # | name | target | value
    // 1 | open | /SomarParcelas/ | 
    driver.get("http://localhost:8080/SomarParcelas/");
    // 2 | setWindowSize | 778x743 | 
    driver.manage().window().setSize(new Dimension(778, 743));
    // 3 | click | name=p1 | 
    driver.findElement(By.name("p1")).click();
    // 4 | type | name=p1 | 78
    driver.findElement(By.name("p1")).sendKeys("78");
    // 5 | click | name=p2 | 
    driver.findElement(By.name("p2")).click();
    // 6 | type | name=p2 | 89
    driver.findElement(By.name("p2")).sendKeys("89");
    // 7 | click | name=calcular | 
    driver.findElement(By.name("calcular")).click();
    // 8 | click | css=h1 | 
    driver.findElement(By.cssSelector("h1")).click();
    // 9 | verifyText | css=h1 | O resultado foi 167
    assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("O resultado foi 167"));
  }
}
