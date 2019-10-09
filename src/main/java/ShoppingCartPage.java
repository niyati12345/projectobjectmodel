import org.openqa.selenium.By;

public class ShoppingCartPage extends Utils {

    public void shoppingCart(){
      clickOnLocator(By.id("termsofservice"));
      clickOnLocator(By.id("checkout"));
    }

}
