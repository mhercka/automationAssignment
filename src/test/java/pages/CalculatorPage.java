package pages;

import selectors.CalculatorPageSelectors;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import tests.Setup;



public class CalculatorPage extends Setup {
    private AppiumDriver driver;
    public CalculatorPage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickNumber(String number){
        MobileElement element = (MobileElement) driver.findElement(By.id("com.android.calculator2:id/digit_" + number));
        element.click();
    }

    public void clickMultipleButton(){
        MobileElement element = (MobileElement) driver.findElement(CalculatorPageSelectors.multipleButton);

        element.click();
    }

    public void clickEqualButton(){
        MobileElement element = (MobileElement) driver.findElement(CalculatorPageSelectors.equalButton);

        element.click();
    }

    public String getTextFromDisplay(By id){
        MobileElement element = (MobileElement) driver.findElement(id);
        String text = element.getText();

        return text;
    }
}