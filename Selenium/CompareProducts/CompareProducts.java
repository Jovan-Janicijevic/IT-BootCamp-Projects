package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class CompareProducts {
    private WebDriver driver;
    private Actions actions;
    public CompareProducts(WebDriver driver) {
        this.driver = driver;
        actions=new Actions(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"navigation\"]/nav/div/div/div[1]/button")
    WebElement clickProducts;
    @FindBy(xpath = "//*[@id=\"main-nav-2\"]/a")
    WebElement hoverRacunari;
    @FindBy(xpath = "//*[@id=\"main-nav-2\"]/ul/li/ul[3]/li[2]/a/h3")
    WebElement monitors;
    @FindBy(xpath = "//span[@id='compare-432840']")
    WebElement checkMonitor1;
    @FindBy(xpath = "//span[@id='compare-423700']")
    WebElement checkMonitor2;
    @FindBy(xpath = "//*[@id=\"compare-423700\"]/div/div[3]/a")
    WebElement compare;

    public void chekProduct1() {
        clickProducts.click();
    }
    public void hover(){
      actions=new Actions(driver);
      actions.moveToElement(hoverRacunari).build().perform();
    }
    public void monitors(){
        monitors.click();
    }
    public void checkMonitor1(){
        checkMonitor1.click();
    }
    public void checkMonitor2(){
        checkMonitor2.click();
    }
    public void compare(){
        compare.click();
    }


}
