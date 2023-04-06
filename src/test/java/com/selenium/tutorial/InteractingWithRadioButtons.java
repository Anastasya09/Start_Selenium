package com.selenium.tutorial;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class InteractingWithRadioButtons {

    @Test
    public void clickRadioButton() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/radiobutton");

//        List<WebElement> radiobuttons = driver.findElements(By.xpath("//input[@type='radio']"));
//        for (WebElement c: radiobuttons) {
//            c.click();
//            Thread.sleep(500);
//        }
//        for (WebElement c: radiobuttons) {
//            c.click();
//            Thread.sleep(500);
//        }
//        driver.findElement(By.xpath("//input[@value='option2']")).click();
        WebElement targetRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        targetRadioButton.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
