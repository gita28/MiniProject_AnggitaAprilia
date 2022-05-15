package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class Ratingpage extends PageObject {

    private By Ratingfield() {
        return By.xpath("                ");
    }

    @Step
    public void validateOnRatingPage(){
        $(Ratingfield()).isDisplayed();
    }

}