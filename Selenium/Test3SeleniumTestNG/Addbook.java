import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addbook {
    private WebDriver driver;

    public Addbook(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

@FindBy (xpath = "//a[contains(text(),'Git Pocket Guide')]")
    WebElement book1;
    @FindBy (xpath = "//button[contains(text(),'Add To Your Collection')]")
    WebElement book1added;
    @FindBy (xpath = "//span[@id='']")
    WebElement trashCan;

    public void buybook () throws InterruptedException {
        book1.click();
        Thread.sleep(2000);
        book1added.click();


    }
    public WebElement getTrashCan () {
        return trashCan;
    }


}
