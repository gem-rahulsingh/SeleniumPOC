package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        // Setup Chrome WebDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();

        // Instantiate ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://www.example.com");

        System.out.println("Hello Tesssssssssssssssssssssssssssssssssst");
        // Perform operations on the website
        // ...

        // Close the browser
        driver.quit();
    }
}
