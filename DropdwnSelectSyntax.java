package SeleniumHW_04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdwnSelectSyntax extends CommonMethods {
    public static void main (String [] args ) throws  InterruptedException{
        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement selectDays = driver.findElement(By.xpath("//select[@id='select-demo']"));
        selectDays.click();
        Thread.sleep(2000);
        Select sel = new Select(selectDays);
        sel.selectByVisibleText("Tuesday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Thursday");
        Thread.sleep(2000);
        sel.selectByVisibleText("Friday");
        Thread.sleep(2000);
        driver.close();




    }
}
