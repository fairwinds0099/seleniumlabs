import org.openqa.selenium.WebDriver;

public class PageActions {
private WebDriver driver;
private DomainTab domainTab;
private DomainPage domainPage;

public PageActions(WebDriver driver){
  this.driver = driver;
}

public void connectUri(String uri) {
  driver.get(uri);
  domainTab  = new DomainTab(driver);
  domainPage =  new DomainPage(driver);
}

}
