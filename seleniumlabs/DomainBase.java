import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DomainBase {

  protected WebDriver driver;

  protected DomainBase(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
  }

  protected boolean isElementDisplayed(WebElement element) {
    try {
      return element.isDisplayed();
    } catch (WebDriverException e) {
      return false;
    }
  }

  protected void waitForClickable(WebElement element, Duration timeout) {
    WebDriverWait webDriverWait = new WebDriverWait(this.driver, timeout);
    webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
  }

  protected void selectCheckBox(WebElement ckeckElement) {
    if(!ckeckElement.isSelected()) {
      ckeckElement.click();
    }
  }
}
