import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends BaseTest{
    @Test
    public void goToNextPage(){
        HomeMedEquipmentPage newPage = mainPage.goToHomeMedEquipmentPage();
        ProductPage productPage = newPage.goToProductPage();
        Assert.assertEquals(productPage.getProductTitle(), "ԱՊԼԻԿԱՏՈՐ «ԵՐԻՑՈՒԿ»");
        System.out.println(AssertionMessages.correctTitle);
    }
}