import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends Utils {

    private By _clickOnRegister = By.xpath("//a[@class='ico-register']");


    public void clickOnRegisterButton() {
        // click on register button
        clickOnLocator(_clickOnRegister);
    }

    public void clickOnMacbbokProduct() {
        //click on apple macbook
        clickOnLocator(By.linkText("Apple MacBook Pro 13-inch"));
    }
    public void clickOncomputer() {
        //click on apple macbook
        clickOnLocator(By.linkText("Build your own computer"));
    }
}