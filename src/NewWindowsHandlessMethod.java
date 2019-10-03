import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NewWindowsHandlessMethod {
    public static void main(String[] args) {
        InvokeBrowser myBrowser=new InvokeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("https://accounts.google.com/signup");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement((By.xpath(("//a[text()=]"))));
    }
}
