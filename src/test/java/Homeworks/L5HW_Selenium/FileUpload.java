package Homeworks.L5HW_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static org.junit.Assert.assertEquals;


public class FileUpload {

    @Test
    public void checkFileUpload() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");


        WebElement chooseFile = driver.findElement(By.id("file-upload"));

        File file = new File("C:/Users/Anastasia/Desktop/5.jpg");
        chooseFile.sendKeys(file.getAbsolutePath());


        WebElement uploadFile = driver.findElement(By.id("file-submit"));
        uploadFile.click();


        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(500L));
        WebElement uploadedMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploaded-files")));

        assertEquals(uploadedMessage.getText(), file.getName());


        driver.quit();
    }
}

