import org.openqa.selenium.By;

public class CheckoutPage extends Utils {
    LoadProps loadProps=new LoadProps();

    public void verifyUserIsOnCheckOutPage()
    {
        assertUrl("checkout");
    }
//
//    FirstName=fraz
//            LastName=hamilton
//    EmailName1= dii
//    EmailFormat1 =@gmail.com

    public void shippingAddressWithFullDetilas(){
     entertext(By.id("BillingNewAddress_FirstName"),loadProps.getProperty("FirstName"));
     entertext(By.id("BillingNewAddress_LastName"),loadProps.getProperty("LastName"));
     entertext(By.id("BillingNewAddress_Email"),loadProps.getProperty("EmailName1")+loadProps.getProperty("EmailFormat1"));

    }

    public void shippingAddress() {
        selectByValue(By.id("BillingNewAddress_CountryId"), "239");
        entertext(By.id("BillingNewAddress_City"), "abcd");
        entertext(By.id("BillingNewAddress_Address1"), "hfefgegugbeg");
        entertext(By.id("BillingNewAddress_ZipPostalCode"), "jgrghu");
        entertext(By.id("BillingNewAddress_PhoneNumber"), "4346");
        clickOnLocator(By.xpath("//div[@id=\"billing-buttons-container\"] //input[@type=\"button\"]"));
        clickOnLocator(By.xpath("//div[@id=\"shipping-method-buttons-container\"] //input[@type=\"button\"]"));
        clickOnLocator(By.id("paymentmethod_1"));
        clickOnLocator(By.xpath("//div[@id=\"payment-method-buttons-container\"]//input[@type=\"button\"]"));
        selectByValue(By.id("CreditCardType"), "MasterCard");
        entertext(By.id("CardholderName"), "Darryl Land");
        entertext(By.id("CardNumber"), "5192694549491634");
        selectByValue(By.id("ExpireMonth"), "7");
        selectByValue(By.id("ExpireYear"), "2023");
        entertext(By.name("CardCode"), "209");
        clickOnLocator(By.xpath("//div[@id='payment-info-buttons-container']  //input[@type=\"button\"]"));
        clickOnLocator(By.xpath("//div[@id=\"confirm-order-buttons-container\"] //input[@type=\"button\"]"));


    }

}
