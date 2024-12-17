package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Clickable {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://new.skillfactory.ru/corporativnoye-obuchenye?_gl=1*ikhsjf*_gcl_aw*R0NMLjE3MzQxNDM5MzYuQ2owS0NRaUEwLS02QmhDQkFSSXNBRFlxeUxfclYwYW1uaXM4RjMxOE8yRzdKNUpUWVhUcjZhekZ0SlZpalJFME9kdmxBR1dHNzVRSzB0VWFBcU11RUFMd193Y0I.*_gcl_au*NjM3Njc4ODgyLjE3MzM3ODIwNjI.*_ga*MTIzMTc1MzM5NC4xNzMzNzgyMDYz*_ga_X08SF39ELF*MTczNDM3MzQzNy4xMy4xLjE3MzQzNzM4NjMuNTguMC4w");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#rec424366068 > div > div > div.t396__elem.tn-elem.tn-elem__4243660681647461206956 > a")).click();
            driver.findElement(By.cssSelector("#form425959013 > div.t-form__inputsbox > div.t-input-group.t-input-group_nm > div > input")).sendKeys("Имя");
            driver.findElement(By.cssSelector("#form425959013 > div.t-form__inputsbox > div.t-input-group.t-input-group_em > div > input")).sendKeys("Post@gmail.com");
            driver.findElement(By.id("input_1632129730988")).sendKeys("9999999999");
            driver.findElement(By.id("sb-1636624714337")).click();
            driver.findElement(By.cssSelector("#sb-1636624714337 > option:nth-child(2)")).click();
            driver.findElement(By.cssSelector("#form425959013 > div.t-form__inputsbox > div.tn-form__submit > button")).click();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}