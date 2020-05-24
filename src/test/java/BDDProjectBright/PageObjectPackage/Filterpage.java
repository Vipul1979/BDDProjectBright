package BDDProjectBright.PageObjectPackage;

import BDDProjectBright.BaseClassPackage.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Filterpage extends DriverFactory {
    @FindBy(xpath = "//a[contains(text(),'Nike Lean Armbands')]")
    WebElement runningfiletproduct;

    @FindBy(xpath = "//h1[contains(text(),'Running')]")
    WebElement runningAssertion;

    @FindBy(xpath = "//h1[@class='h2 product-name-main']//span[contains(text(),'Nike Lean Armbands')]")
    WebElement armBandAssert;
    public void clickonproduct(){
        runningfiletproduct.click();
    }

    public void runingPageassertion(){
        String actualRunning = runningAssertion.getText();

        Assert.assertThat(actualRunning, Matchers.containsString("Running"));

    }

    public void runingproductassert(){
        String acutalArmBandAssert = armBandAssert.getText();

        Assert.assertThat(acutalArmBandAssert,Matchers.containsString("Lean"));
    }


}
