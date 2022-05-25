import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {


  static WebDriver driver = new ChromeDriver();
  static PageActions pageActions = new PageActions(driver);

  public static void main(String[] args) {
   pageActions.connectUri("www.google.com");
  }

}
