package juniorTechTask;

import juniorTechTask.utils.DriverUtil;
import juniorTechTask.utils.LoggerUtil;
import org.openqa.selenium.WebDriver;

import java.util.logging.Logger;

public class DriverManager {

    private static Logger log = LoggerUtil.getLog(DriverManager.class.getName());
    private WebDriver driver = DriverUtil.instanceWebDriver();

    public void openURL(String URL) {
        log.info("Open website: " + URL);
        driver.manage().window().maximize();
        driver.get(URL);
    }

    public void closeBrowser() {
        log.info("Close browser");
        DriverUtil.stopWebDriver();
    }

}
