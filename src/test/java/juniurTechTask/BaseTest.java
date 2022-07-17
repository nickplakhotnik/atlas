package juniurTechTask;

import juniorTechTask.DriverManager;
import juniorTechTask.model.Config;
import juniorTechTask.model.TestData;
import juniorTechTask.utils.GsonParser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected DriverManager driverManager = new DriverManager();
    private GsonParser gsonParser = new GsonParser();
    private Config config = gsonParser.parseConfig();
    protected TestData testData = gsonParser.parseTestData();

    @BeforeMethod
    public void beforeMethod() {
        driverManager.openURL(config.getStartURL());
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.closeBrowser();
    }

}
