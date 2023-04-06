package com.selenium.tutorial;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InteractingWithDropDowns {

    @Test
    public void checkCheckbox() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");

        Select select = new Select(driver.findElement(By.id("dropdown")));

        for (WebElement option: select.getOptions()) {
            System.out.println("Available options: " + option.getText());

        }

        System.out.println("Is multiselect: " + select.isMultiple());

        select.selectByValue("1");
        Thread.sleep(500);
        select.selectByVisibleText("Option 2");
        Thread.sleep(500);
        select.selectByIndex(2);
        Thread.sleep(500);

        driver.quit();

    }
}
