import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
    public static void main(String[] args) {

        InvokeBrowser myBrowser=new InvokeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("https;//jqueryui.com/droppable/");
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe.demo-frame")));

        Actions myAction=new Actions(driver);
        WebElement webSource=driver.findElement(By.id("draggable"));
        WebElement webTarget=driver.findElement(By.id("droppable"));

        myAction.dragAndDrop(webSource,webTarget).build().perform();
        driver.switchTo().defaultContent();

    }

}



