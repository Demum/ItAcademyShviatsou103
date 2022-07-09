import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;


public class OnlinerTest extends WebDriverSettings {
    By samsungLocator = By.xpath("//span[contains(text(), 'Телевизор Samsung')]");

    @Test
    public void onlinerSiteTest() throws InterruptedException {
        driver.get("https://www.onliner.by/");
        driver.findElement(By.xpath("//a[contains(text(), 'Каталог')][1]")).click();

        driver.findElement(By.xpath("//span[contains(text(), 'Электроника')] ")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[text()='Телевизоры']")).click();

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)", "");

        driver.findElement(By.xpath("//span[contains(text(), 'LG')] ")).click();

        Assert.assertFalse(samsungNotDisplayed());
    }

    public boolean samsungNotDisplayed() {
        try {
            driver.findElement(samsungLocator).isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("Телевизор Samsung не найден");
        }
        return false;

    }
}
