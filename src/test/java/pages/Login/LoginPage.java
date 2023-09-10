package pages.Login;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    @Step
    public void enterCredetials(String email, String password){
        $(By.xpath( "//div[contains(@class, 'panel')]//input[@id='signInFormUsername']" )).type( email );
        $(By.xpath( "//div[contains(@class, 'panel')]//input[@id='signInFormPassword']" )).type( password );
    }

    @Step
    public void clickLoginBtn(){
        $(By.xpath( "//div[contains(@class, 'panel') ]//input[@name = 'signInSubmitButton']" )).click();
    }

    @Step
    public void verifyLogin(){
        String homePageTitle = getTitle();
        Assertions.assertEquals( "Dashboard Home", homePageTitle );
    }

}
