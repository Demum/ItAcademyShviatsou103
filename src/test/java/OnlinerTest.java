import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OnlinerTest extends WebDriverSettings {

    @Test
    public void onlinerSiteTest () {
        driver.get("https://catalog.onliner.by/tv");
String actualmessage= driver.findElement(By.xpath(" ")).getText();
        Assert.assertEquals(" ", actualmessage);

    }

}
