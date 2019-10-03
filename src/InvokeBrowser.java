import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
    public WebDriver invokeChromeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\GozelMyrat\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver gozel = new ChromeDriver();
        return gozel;
    }
}
