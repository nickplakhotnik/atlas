package juniorTechTask.pages;

import juniorTechTask.elements.Button;
import juniorTechTask.elements.TextField;
import org.openqa.selenium.By;


public class MainPage extends BaseForm {

    private TextField searchWhereAreYouGoing = new TextField(By.id("ss"), "Search input text field where are you going");
    private Button chooseLanguageButton = new Button(By.xpath("//button[@data-modal-id='language-selection']"), "Choose language Button");
    private String ENGLISH_LANGUAGE_BUTTON_XPATH = "//div[contains(text(), 'English (US)')]";
    private Button searchButton = new Button(By.xpath("//span[@class='js-sb-submit-text ']"), "Search Button");

    public MainPage() {
        super(By.xpath("//div[@class='hero-banner-searchbox']"), "Main Page");
    }

    public void inputPlaceToGo(String place) {
        searchWhereAreYouGoing.sendKeys(place);
    }

    public void chooseLanguage() {

        chooseLanguageButton.clickAndWait();
        createEnglishLanguageButton().clickAndWait();
    }

    private Button createEnglishLanguageButton() {
        return new Button(By.xpath(ENGLISH_LANGUAGE_BUTTON_XPATH), "English Language Button");
    }

    public void clickOnSearch() {
        searchButton.click();
    }
}
