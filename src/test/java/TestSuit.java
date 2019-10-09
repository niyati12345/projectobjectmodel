import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage=new HomePage();
    RegistrationPage registrationPage=new RegistrationPage();
    AppleMacBookProductPage appleMacBookProductPage=new AppleMacBookProductPage();
    EmailAFreindPage emailAFreindPage=new EmailAFreindPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    CheckoutPage checkoutPage=new CheckoutPage();
    CheckOutCompleted checkOutCompleted=new CheckOutCompleted();
    CheckOutAsGuest checkOutAsGuest =new CheckOutAsGuest();



      @Test
    public void userShouldAbleToRegisterSuccessfuly() {
     homePage.clickOnRegisterButton();
     registrationPage.verifyUserIsOnRegistraionPage();
     registrationPage.userEnterRegistrationDetails();
     registrationPage.verifyUserRegistersuccessfully();
    }
    @Test
    public void UserShouldBeAbleToReferAProductToFriend(){
     userShouldAbleToRegisterSuccessfuly();
     registrationPage.clickOnContinueButton();
     homePage.clickOnMacbbokProduct();
     appleMacBookProductPage.verifyUserIsOnMacbbokPage();
     appleMacBookProductPage.applemacbookpage();
     emailAFreindPage.verifyUserIsOnEmailAFreiendPage();
     emailAFreindPage.EmailAFriendPage();
     emailAFreindPage.verifyUserSendEmailToFreindSuccessfully();
    }
    @Test
    public void UnRegisterUserShouldNotAbleToReferProductToAFriend(){
     homePage.clickOnMacbbokProduct();
     appleMacBookProductPage.verifyUserIsOnMacbbokPage();
     appleMacBookProductPage.applemacbookpage();
     emailAFreindPage.verifyUserIsOnEmailAFreiendPage();
     emailAFreindPage.UnregesiterUserEmailAFriendPage();
     emailAFreindPage.verifyUnRegisterUserNotAbleToSendEmailToFreindSuccessfully();
    }
    @Test
    public void userShouldAbletoBuyProduct(){
     userShouldAbleToRegisterSuccessfuly();
     registrationPage.clickOnContinueButton();
     homePage.clickOncomputer();
     buildYourOwnComputerPage.verifyUserIsonBuildComputerPage();
     buildYourOwnComputerPage.clickOnAddToCartForcomputer();
     shoppingCartPage.shoppingCart();
     checkoutPage.verifyUserIsOnCheckOutPage();
     checkoutPage.shippingAddress();
     checkOutCompleted.verifyUserIsOnCheckOutComple();
     checkOutCompleted.verifyUserOrderSuccessfullyPlaced();}

     @Test
     public void GuestuserShouldAbleBuyProduct(){
     homePage.clickOncomputer();
     buildYourOwnComputerPage.verifyUserIsonBuildComputerPage();
     buildYourOwnComputerPage.clickOnAddToCartForcomputer();
     shoppingCartPage.shoppingCart();
     checkOutAsGuest.verifyUserIsonCheckOutGuestPage();
     checkOutAsGuest.checkOutGuestPage();
     checkoutPage.verifyUserIsOnCheckOutPage();
     checkoutPage.shippingAddressWithFullDetilas();
     checkoutPage.shippingAddress();
     checkOutCompleted.verifyUserIsOnCheckOutComple();
     checkOutCompleted.verifyUserOrderSuccessfullyPlaced();


      }
}