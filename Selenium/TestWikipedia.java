import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.time.Duration;

public class TestWikipedia {
    public static void main(String[] args) throws IOException , InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\User\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.wikipedia.org/");
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement language= wd.findElement(By.xpath("//select[@id='searchLanguage']"));
        language.click();
        WebElement srpski = wd.findElement(By.xpath("//option[contains(text(),'Српски / Srpski')]"));
        srpski.click();
        WebElement inputField = wd.findElement(By.xpath("//input[@id='searchInput']"));
        inputField.sendKeys("java");
        WebElement programskiJezik = wd.findElement(By.xpath("/html[1]/body[1]/div[3]/form[1]/fieldset[1]/div[1]/div[2]/div[1]/a[2]/div[1]/h3[1]/em[1]"));
        programskiJezik.click();
        WebElement naslov = wd.findElement(By.xpath("//h1[@id='firstHeading']"));
        if(naslov.getText().equals("Java (програмски језик)")){
            System.out.println("Test je prošao");
        }
        else {
            System.out.println("Test nije prošao");
        }
        wd.close();


    }
}
