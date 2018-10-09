package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_DAY ="//div[@class=\"large_form\"]/div[6]/div/span/span/select[1]";
    public static final String XPATH_MONTH = "//div[@class=\"large_form\"]/div[6]/div/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[@class=\"large_form\"]/div[6]/div/span/span/select[3]";

    public static void main (String [] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(1);

        WebElement selectCombo1 = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(selectCombo1);
        selectMonth.selectByIndex(4);

        WebElement selectCombo2 = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectCombo2);
        selectYear.selectByIndex(23);
    }

}
