import Pages.CompareProducts;
import Utils.PropReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TestCompareProducts {
    @Test
    public void compare() throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver",

                PropReader.fetchProperty("WEBDRIVER.CHOME.PATH"));

        WebDriver driver = new ChromeDriver();
        CompareProducts compareProducts = new CompareProducts(driver);

        driver.get("https://gigatron.rs/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        compareProducts.chekProduct1();
        compareProducts.hover();
        Thread.sleep(5000);
        compareProducts.monitors();
        Thread.sleep(5000);
        compareProducts.checkMonitor1();
        Thread.sleep(5000);
        compareProducts.checkMonitor2();
        compareProducts.compare();
        Thread.sleep(5000);
        String h1 = driver.findElement(By.xpath("//*[@id=\"app-container\"]/div/h1")).getText();
        Assert.assertTrue(h1.contains("Upoređivanje proizvoda"));
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        driver.quit();


    }


}
