package Homeworks.L5HW_Selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddRemoveElements {

        @Test
        public void checkAddRemoveElements() {

            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofMillis(500L));

            WebElement addElementButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='addElement()']")));
            addElementButton.click();

            WebElement deleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='addElement()']")));
            assertTrue(deleteButton.isDisplayed(), "Элемент 'Delete' не найден");

            deleteButton.click();

            WebElement removeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[onclick='addElement()']")));
            assertTrue(removeButton.isDisplayed(), "Элемент 'Delete' не исчез");

            driver.quit();
        }

}
