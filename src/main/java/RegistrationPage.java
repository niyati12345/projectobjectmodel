import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils {
LoadProps loadProps=new LoadProps();

    public void verifyUserIsOnRegistraionPage()
    {
        assertUrl("register");
    }
    public void userEnterRegistrationDetails()
    {
        //enter Firstname
        entertext(By.id("FirstName"), loadProps.getProperty("FirstName"));
        entertext(By.xpath("//input[@name='LastName']"), loadProps.getProperty("LastName"));
        // entertext(By.name("Email"),);
        selectByValue(By.xpath("//select[@name='DateOfBirthDay']"), "2");
        selectByVisibleText(By.xpath("//select[@name='DateOfBirthMonth']"), "February");
        selectbyindex(By.xpath("//select[@name='DateOfBirthYear']"), 4);
        //enter email
        entertext(By.name("Email"),loadProps.getProperty("EmailName1") +randomDate()+ loadProps.getProperty("EmailFormat1"));
        //enter password
        entertext(By.id("Password"), loadProps.getProperty("password"));
        //re-enter same password to confirm
        entertext(By.id("ConfirmPassword"), loadProps.getProperty("password"));
        //click on register
        clickOnLocator(By.name("register-button"));
    }
public void verifyUserRegistersuccessfully()
   {
   // String actual= gettext(By.xpath("//div[@class='result']"));
       asserttextmessage(loadProps.getProperty("expectedregmsg"),gettext(By.xpath("//div[@class='result']")));
   }
   public void clickOnContinueButton()
   {
       clickOnLocator(By.name("register-continue"));
   }

}
