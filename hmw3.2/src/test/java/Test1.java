import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends BaseTest{
    @Test
    public void goToNextPage(){
        HomeMedEquipmentPage newPage = mainPage.goToHomeMedEquipmentPage();
        Assert.assertEquals(newPage.getHeader(), "ՏՆԱՅԻՆ ԲԺՇԿԱԿԱՆ ՍԱՐՔԵՐ");
        System.out.println(AssertionMessages.correctHeader);
    }
}
