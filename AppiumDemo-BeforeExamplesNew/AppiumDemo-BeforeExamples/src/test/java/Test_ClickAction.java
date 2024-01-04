import Pages.HomePage;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_ClickAction extends BaseTest{
    @Test
    public void testClickAction() {
        new HomePage(driver).enterAccessi_bility();
        Assert.assertEquals(driver.findElement(new AppiumBy.ByAccessibilityId("Accessibility Node Provider")).getText(), "Accessibility Node Provider");
    }
}
