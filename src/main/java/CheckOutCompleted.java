import org.openqa.selenium.By;

public class CheckOutCompleted extends Utils{
    LoadProps loadProps=new LoadProps();


    public void verifyUserIsOnCheckOutComple()
    {
       // assertUrl("completed");
    }
    public void verifyUserOrderSuccessfullyPlaced(){
     asserttextmessage(loadProps.getProperty("expectedorderplace"),gettext(By.xpath("//div[@class=\"section order-completed\"] //div[@class='title']")));
     // asserttextmessage(loadProps.getProperty("expectedorderplace"),gettext(By.linkText("Your order has been successfully processed!")));
   }
}
//div[@class="section order-completed"] //div[@class='title']