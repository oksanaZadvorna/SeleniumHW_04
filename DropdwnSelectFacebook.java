package SeleniumHW_04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdwnSelectFacebook extends CommonMethods {
    public static void main (String [] args ) throws  InterruptedException{
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebElement createNewAccount = driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]"));
        createNewAccount.click();
        Thread.sleep(2000);
        WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
        birthMonth.click();
        Thread.sleep(2000);
        Select selMonth = new Select(birthMonth);
        selMonth.selectByVisibleText("Dec");
        Thread.sleep(2000);
        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        birthDay.click();
        Thread.sleep(2000);
        Select selDay = new Select(birthDay);
        selDay.selectByVisibleText("9");
        Thread.sleep(2000);
        WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
        birthYear.click();
        Thread.sleep(2000);
        Select selYear = new Select(birthYear);
        selYear.selectByVisibleText("1992");
        Thread.sleep(2000);

        driver.close();






    }
}
