package Homeworks.L5HW_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;

public class Inputs {


    @Test
    public void testInputs() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/inputs");


        WebElement inputField = driver.findElement(By.tagName("input"));

        inputField.sendKeys("1234");

        assertEquals("1234", inputField.getAttribute("value"));


        inputField.sendKeys(Keys.ARROW_UP);

        assertEquals("1235", inputField.getAttribute("value"));


        inputField.sendKeys(Keys.ARROW_DOWN);

        assertEquals("1234", inputField.getAttribute("value"));

        driver.quit();

    }
}
