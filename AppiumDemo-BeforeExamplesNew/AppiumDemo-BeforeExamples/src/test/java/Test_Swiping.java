import Pages.HomePage;
import org.testng.annotations.Test;

public class Test_Swiping extends BaseTest{

    @Test
    public void testSwiping() {
        // Navigate to Graphics , Vertices , Swipe right on the photo and then swipe left

        new HomePage(driver).enterGraphics()
                .enterVertices();

//        mb.swipeRightOnElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.view.View"),driver);
//        mb.swipeLeftOnElement(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.view.View"));

    }
}
