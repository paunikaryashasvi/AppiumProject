package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GraphicsPage {
    WebDriver driver;

    public GraphicsPage(WebDriver driver)
    {
        this.driver = driver;
    }

    By scaleToFit = AppiumBy.accessibilityId("ScaleToFit");
    By vertices = AppiumBy.accessibilityId("Vertices");

    public void enterScaleToFit(){
        MobileActions mb = new MobileActions(driver);
        mb.scrollDownToSpecificText("ScaleToFit");
        driver.findElement(scaleToFit).click();
    }

    public void enterVertices(){
        MobileActions mb = new MobileActions(driver);
        mb.scrollDownToSpecificText("Vertices");
        driver.findElement(vertices).click();
        mb.swipe(0.75,200,200,"right");
        mb.swipe(0.75,200,200,"left");
        mb.swipe(0.75,200,200,"up");
        mb.swipe(0.75,200,200,"down");
    }

}
