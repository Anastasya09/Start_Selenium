package Homeworks.L5HW_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChallengingDOM2 {

    private static WebDriver driver;

    @Test
    public void checkButtons() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");

        WebElement button1 = driver.findElement(By.xpath("//a[@class='button']"));
        button1.click();
        Thread.sleep(5000);
        WebElement button2 = driver.findElement(By.xpath("//a[@class='button alert']"));
        button2.click();
        Thread.sleep(5000);
        WebElement button3 = driver.findElement(By.xpath("//a[@class='button success']"));
        button3.click();
        Thread.sleep(5000);

        driver.quit();

    }
}
