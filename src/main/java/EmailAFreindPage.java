import org.openqa.selenium.By;
import org.seleniumhq.jetty9.util.Utf8LineParser;
import org.testng.Assert;

public class EmailAFreindPage extends Utils {
LoadProps loadProps=new LoadProps();


    public void verifyUserIsOnEmailAFreiendPage()
    {
        assertUrl("emailafriend");
    }

    public void EmailAFriendPage(){
        entertext(By.className("friend-email"), loadProps.getProperty("friendemail"));
        //message
        entertext(By.id("PersonalMessage"),loadProps.getProperty("msg"));
        //send email
        clickOnLocator(By.name("send-email"));
    }
    public void UnregesiterUserEmailAFriendPage(){
        entertext(By.className("friend-email"), loadProps.getProperty("friendemail"));
        entertext(By.id("YourEmailAddress"),loadProps.getProperty("UserEmail"));
        //driver.findElement(By.className("friend-email")).sendKeys("niyati141193@gmail.com");
        //message
        entertext(By.id("PersonalMessage"),loadProps.getProperty("msg"));
        //send email
        clickOnLocator(By.name("send-email"));
    }

    public void verifyUserSendEmailToFreindSuccessfully()
    {
        asserttextmessage(loadProps.getProperty("confmsgforfrndemail"),gettext(By.cssSelector("div.result")));
    }

    public void verifyUnRegisterUserNotAbleToSendEmailToFreindSuccessfully(){

        asserttextmessage(loadProps.getProperty("UnRegisterMsgEmailAfriend"),gettext(By.xpath("//div[@class='message-error validation-summary-errors']")));
    }
}
