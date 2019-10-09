import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils extends BasePage{
////assert Url method
 public void assertUrl(String text){
     Assert.assertTrue(driver.getCurrentUrl().contains(text));
  }
  //assert equals
  public void asserttextmessage(String expected, String actual){
    Assert.assertEquals(expected,actual);
  }

//    ScreanShotMethod
    public  void takeScreenshot()
  {
//
  }

//clickOnLocator
  public void clickOnLocator(By by) {
    driver.findElement(by).click();
  }

  //sendkeys method
  public void entertext(By by,String text){
    driver.findElement(by).sendKeys(text);
  }

  //SELECT METHOD BY TEXT
  public void selectByValue(By by,String text){
    Select select=new Select(driver.findElement(by));
    select.selectByValue(text);
  }
 ///SELECT METHOD BY visible text
  public void selectByVisibleText(By by,String text){
      Select select=new Select(driver.findElement(by));
      select.selectByVisibleText(text);
    }
  public void selectbyindex(By by,int num){
    Select select=new Select(driver.findElement(by));
    select.selectByIndex(num);
  }
   public static String randomDate(){
      DateFormat format=new SimpleDateFormat("ddMMyyHHmmss");
    return format.format(new Date()); }
//get text
  public String gettext(By by){
   return driver.findElement(by).getText();
  }
  public static void waitforClickable(By by,long time){
        WebDriverWait wait =new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by)); }


}
