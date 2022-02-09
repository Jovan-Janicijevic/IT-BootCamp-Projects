import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteBook {
    private WebDriver driver;

    public DeleteBook(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[contains(text(),'Git Pocket Guide')]")
    WebElement book1;
    @FindBy (xpath = "//button[contains(text(),'Add To Your Collection')]")
    WebElement book1added;
    @FindBy (xpath = "//span[@id='']")
    WebElement trashCan;

    public void deletfirstebook () throws InterruptedException {
        book1.click();
        Thread.sleep(2000);
        book1added.click();
        trashCan.click();


    }
}
