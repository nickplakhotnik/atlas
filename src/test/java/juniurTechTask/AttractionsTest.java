package juniurTechTask;

import juniorTechTask.pages.AttractionsPage;
import juniorTechTask.pages.AttractionsResultSearchPage;
import juniorTechTask.pages.MainPage;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AttractionsTest extends BaseTest {

    @Test
    public void attractionsTest() {
        MainPage mainPage = new MainPage();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(mainPage.isPageOpened(), "Main Page is not open");
        Assert.assertTrue(mainPage.getCurrentLanguage().contains(testData.getLanguage()), "Language is not correct");

        mainPage.clickOnAttractionsButton();
        AttractionsPage attractionsPage = new AttractionsPage();
        Assert.assertTrue(attractionsPage.isPageOpened());

        attractionsPage.setSearchingField(testData.getCity());
        attractionsPage.clickOnSearchButton();

        AttractionsResultSearchPage attractionsResultSearchPage = new AttractionsResultSearchPage();
        Assert.assertTrue(attractionsResultSearchPage.isPageOpened(), "Attractions Result Search Page is not open");

        Assert.assertTrue(attractionsResultSearchPage.getCityInSearching().contains(testData.getCity()),
                "City in result searching is not correct");
    }
}
