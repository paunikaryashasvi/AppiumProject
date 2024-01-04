import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Typing extends BaseTest{

    @Test
    public void testTyping() {
        // Navigate to APP ,activity , custom title , type "Appium" and check If the text written or not
        new HomePage(driver).enterApp()
                .enterActivity()
                .enterCustomTitle()
                .enterTitle();
        Assert.assertEquals(driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Left is best\"]")).getText(), "Appium");
    }
}
