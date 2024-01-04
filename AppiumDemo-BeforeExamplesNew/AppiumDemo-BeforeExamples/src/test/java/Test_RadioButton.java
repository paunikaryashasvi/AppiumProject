import Pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_RadioButton extends BaseTest{
    @Test
    public void testRadioButton() {
        // Navigate to Views , Radio Group , click on any radio button and check If it's selected or not
        new HomePage(driver).enterViews()
                .enterRadioGroup()
                .clickSnack();
        Assert.assertEquals(driver.findElement(By.id("io.appium.android.apis:id/choice")).getText(), "You have selected: 2131296758");

    }
}
