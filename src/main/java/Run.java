import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {


  public static void main(String[] args) {

    setEnv();
    WebDriver driver = new ChromeDriver();
    PageActions pageActions = new PageActions(driver);
    pageActions.connectUri("www.google.com");
  }

  private static void setEnv() {
    System.setProperty("webdriver.chrome.driver", "/Users/apple4u/Desktop/data_eng/machinelearning/model-in-product/sklearn-jpmml/seleniumlabs/src/main/resources/chromedriver");

  }

}
