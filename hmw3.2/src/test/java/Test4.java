import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4 extends BaseTest{
    @Test
    public void goToNextPage(){
        HomeMedEquipmentPage newPage = mainPage.goToHomeMedEquipmentPage();
        Assert.assertEquals(newPage.getProductCode(), "Ապրանքի կոդ: 0031");
        System.out.println(AssertionMessages.correctProductCode);
    }
}
