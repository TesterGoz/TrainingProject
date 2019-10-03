import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class DragDropFrame {
    public static void main(String[] args) {
        InvokeBrowser myBrowser=new InvokeBrowser();
        WebDriver driver=myBrowser.invokeChromeBrowser();
        driver.get("http://jqueryui.com/droppable/");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

        Actions myAction=new Actions(driver);
        WebElement webSource=driver.findElement(By.id("draggable"));
        WebElement webTarget=driver.findElement(By.id("droppable"));

        myAction.dragAndDrop(webSource,webTarget).build().perform();
        driver.switchTo().defaultContent();

    }

}
