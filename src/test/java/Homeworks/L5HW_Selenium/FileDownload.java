package Homeworks.L5HW_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;



public class FileDownload {


    @Test
    public void checkFileDownload() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/download");

        String currentWindow = driver.getWindowHandle();

        driver.findElement(By.cssSelector("#content > div > a:nth-child(64)")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000L));
        WebElement exampleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("example")));


        for (String windowName : driver.getWindowHandles()) {
            if(!windowName.equals(currentWindow)) {
                driver.switchTo().window(windowName);
                break;
            }
        }
        driver.switchTo().window(currentWindow);

        driver.quit();


    }
}



