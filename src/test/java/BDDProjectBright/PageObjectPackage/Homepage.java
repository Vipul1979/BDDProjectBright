package BDDProjectBright.PageObjectPackage;

import BDDProjectBright.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory { //extends to use driver instances
    @FindBy(id = "searchTerm")
    WebElement searchbox;

    @FindBy(xpath = "//span[@class='_1gqeQ']")
    WebElement searchbutton;

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement accountButton;

    public void doSearch(String item) { //make generic method and do not hardcode so when you use this method
        //give product name their when use it
        searchbox.sendKeys(item);
        searchbutton.click();
    }

    public void homePageURL() { //Assert here then call in Homepagesteps
        String actualURL = driver.getCurrentUrl();
        Assert.assertThat(actualURL, Matchers.containsString("argos"));
    }

    public void resultOfSearch() { //Assert here then call in HomepageSteps
        String nikeURL = driver.getCurrentUrl();
        Assert.assertThat(nikeURL, Matchers.containsString("nike"));
    }

    public void clickOnAccountButton() {
        accountButton.click();
    }

}
