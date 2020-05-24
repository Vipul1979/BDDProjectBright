package BDDProjectBright.PageObjectPackage;

import BDDProjectBright.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Resultpage extends DriverFactory {
    @FindBy(xpath = "//span[contains(text(),'Running')]")
    WebElement runningButton;

    @FindBy(xpath = "//h1[contains(text(),'Running')]")
    WebElement runningResult;

    public void runningFilter(){
        runningButton.click();
    }

    public void runningpageassertion(){
       String actualruningrusult = runningResult.getText();
        Assert.assertThat(actualruningrusult,Matchers.containsString("Running"));
    }
}//Class end
//pull practice
