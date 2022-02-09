import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (id = "submit" )
    WebElement logoutButton;
    @FindBy (xpath = "//input[@id='userName']")
    WebElement inputUser;
    @FindBy (xpath = "//input[@id='password']")
    WebElement pass;
    @FindBy (xpath = "//button[@id='login']")
    WebElement login;

    public void loginUser (String userName, String password){
        inputUser.click();
        inputUser.sendKeys(userName);
        pass.click();
        pass.sendKeys(password);
        login.click();
    }

    public WebElement getLogoutButton () {
        return logoutButton;
    }
}

