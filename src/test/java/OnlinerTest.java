import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class OnlinerTest extends WebDriverSettings {

    @Test
    public void onlinerSiteTest () throws InterruptedException {
        driver.get("https://www.onliner.by/");
                  driver.findElement(By.xpath("//a[contains(text(), 'Каталог')][1]")).click();

                 driver.findElement(By.xpath("//span[contains(text(), 'Электроника')] ")).click();

        driver.findElement(By.xpath("//*[text()=\"Телевизоры\"]")).click();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)", "");
        Thread.sleep(1000);
               driver.findElement(By.xpath("//span[contains(text(), 'LG')] ")).click();
Thread.sleep(1000);

                  Assert.assertFalse(driver.findElement(By.xpath("//span[contains(text(), 'телевизор LG')] "))
                          .getText().equals("Телевизор Samsung"));
        System.out.println("Телевизоры Samsung не найдены");
        }
    }
