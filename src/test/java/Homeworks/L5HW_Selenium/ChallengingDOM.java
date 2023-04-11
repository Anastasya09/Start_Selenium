package Homeworks.L5HW_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class ChallengingDOM {

    private static WebDriver driver;

    @Test
    public void checkButtons() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/challenging_dom");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000L));


        WebElement button4 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button']")));
        button4.click();


        WebElement button5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button alert']")));
        button5.click();


        WebElement button6 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='button success']")));
        button6.click();

        driver.quit();


    }

}

