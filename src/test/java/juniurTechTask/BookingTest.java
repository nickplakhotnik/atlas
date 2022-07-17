package juniurTechTask;

import juniorTechTask.pages.MainPage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BookingTest extends BaseTest {

    @Test
    public void searchingTest() {
        MainPage mainPage = new MainPage();
        Assert.assertTrue(mainPage.isPageOpened(), "Main Page is not open");
        mainPage.chooseLanguage();

        mainPage.inputPlaceToGo(testData.getCity());



        //mainPage.clickOnSearch();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
