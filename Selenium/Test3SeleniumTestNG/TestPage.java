import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.time.Duration;

import static org.bouncycastle.crypto.tls.ContentType.alert;

public class TestPage {
    private WebDriver driver;
    public WebDriverWait wd;
    private Addbook addbook;
    private LoginPage loginPage;
    private DeleteBook deleteBook;
    private Alldelete alldelete;


    @BeforeClass

    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @AfterTest
    public void close() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.close();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");

    }


    @Test
    public void registrationPage(String firstName, String lastName, String userName, String password) throws InterruptedException {
        driver.get("https://demoqa.com/register");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/register";
        Assert.assertEquals(actualURL, expectedURL, "stranice se razlikuju");
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.registration("Jovan", "Janicijevic", "jovan", "Pass123@@");

    }

    @Test
    public void login() {
        driver.get("https://demoqa.com/login");
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://demoqa.com/login";
        Assert.assertEquals(actualURL, expectedURL, "stranice se razlikuju");
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertTrue(loginPage.getLogoutButton().isDisplayed());
        LoginPage loginPage1 = new LoginPage(driver);
        loginPage1.loginUser("jovan", "Pass123@@");
    }

    @Test
    public void book() throws InterruptedException {
        Addbook addbook = new Addbook(driver);

        driver.get("https://demoqa.com/books");
        LoginPage loginPage2 = new LoginPage(driver);
        loginPage2.loginUser("jovan", "Pass123@@");
        Thread.sleep(2000);

        addbook.buybook();

        Alert alert = new WebDriverWait((WebDriver) wd, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.get("https://demoqa.com/profile");
        Assert.assertTrue(addbook.getTrashCan().isDisplayed());
    }

    @Test
    public void delete() throws InterruptedException, IOException {
        Addbook addbook = new Addbook(driver);
        LoginPage loginPage2 = new LoginPage(driver);
        loginPage2.loginUser("jovan", "Pass123@@");
        Thread.sleep(2000);

        driver.get("https://demoqa.com/books");

        addbook.buybook();

        Alert alert = new WebDriverWait((WebDriver) wd, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
        alert.accept();
        driver.get("https://demoqa.com/profile");
        DeleteBook deleteBook = new DeleteBook(driver);
        deleteBook.deletfirstebook();
    }

        @Test
        public void deleteallbooks () throws InterruptedException {
            LoginPage loginPage3 = new LoginPage(driver);
            loginPage3.loginUser("jovan", "Pass123@@");
            Thread.sleep(2000);
            driver.get("https://demoqa.com/books");
            Addbook addbook = new Addbook(driver);
            addbook.buybook();

            Alert alert = new WebDriverWait((WebDriver) wd, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
            alert.accept();
            driver.get("https://demoqa.com/profile");
            Alldelete alldelete = new Alldelete(driver);


        }
    }

