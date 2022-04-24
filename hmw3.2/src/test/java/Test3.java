import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 extends BaseTest{
    @Test
    public void goToNextPage(){
        HomeMedEquipmentPage newPage = mainPage.goToHomeMedEquipmentPage();
        ProductPage productPage = newPage.goToProductPage();
        Assert.assertEquals(productPage.getProductAvailability(), "Առկա է (3)");
        System.out.println(AssertionMessages.correctAvailability);
    }
}