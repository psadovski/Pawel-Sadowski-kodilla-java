package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String NAMEFIELD = "firstname";
    public static final String SURNAMEFIELD = "lastname";
    public static final String EMAILFIELD = "reg_email__";
    public static final String PASSWORDFIELD = "reg_passwd__";
    public static final String XPATH_WAIT_FOR_DAY = "//select[1]";
    public static final String XPATH_WAIT_FOR_MONTH = "//select[2]";
    public static final String XPATH_WAIT_FOR_YEAR = "//select[3]";
    public static final String XPATH_DAY_SELECT = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[1]";
    public static final String XPATH_MONTH_SELECT = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[2]";
    public static final String XPATH_YEAR_SELECT = "//div[contains(@class, \"large_form\")]/div/div/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement nameField = driver.findElement(By.name(NAMEFIELD));
        nameField.sendKeys("Test_name");

        WebElement surnameField = driver.findElement(By.name(SURNAMEFIELD));
        surnameField.sendKeys("Test_surname");

        WebElement emailField = driver.findElement(By.name(EMAILFIELD));
        emailField.sendKeys("test@test.com");

        WebElement passwordField = driver.findElement(By.name(PASSWORDFIELD));
        passwordField.sendKeys("TestTest");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_DAY)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_MONTH)).isDisplayed());
        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_YEAR)).isDisplayed());

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_DAY_SELECT));
        Select selectDay = new Select(selectDayCombo);
        selectDay.deselectByIndex(10);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_MONTH_SELECT));
        Select selectMonth = new Select(selectMonthCombo);
        selectMonth.deselectByIndex(10);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_YEAR_SELECT));
        Select selectYear = new Select(selectYearCombo);
        selectYear.deselectByIndex(14);

    }
}
