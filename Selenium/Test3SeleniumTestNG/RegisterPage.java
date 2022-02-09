import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

    private WebDriver driver;
    private Actions actions;
    private Select select;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id='firstname']")
    WebElement inputFirstName;
    @FindBy (xpath = "//input[@id='lastname']")
    WebElement inputLastName;
    @FindBy (xpath = "//input[@id='userName']")
    WebElement inputUserName;
    @FindBy(xpath = "//input[@id='password']")
    WebElement inputPassword;
//    @FindBy (xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
//    WebElement notRobot;
    @FindBy(xpath = "//button[@id='register']")
    WebElement registerButton;

    public void registration(String firstName , String lastName , String userName, String password) throws InterruptedException {

     inputFirstName.click();

     inputFirstName.sendKeys(firstName);
        Thread.sleep(2000);
     inputLastName.click();

     inputLastName.sendKeys(lastName);
        Thread.sleep(2000);
     inputUserName.click();

     inputUserName.sendKeys(userName);
        Thread.sleep(2000);
     inputPassword.click();

//     inputPassword.sendKeys(password);
//
//     Thread.sleep(3000);
//     registerButton.click();



    }
    }
