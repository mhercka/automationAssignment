package tests;



import io.qameta.allure.Step;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CalculatorPage;
import selectors.CalculatorPageSelectors;


public class CalculatorTest extends Setup {

 
    @Test
    public void displayedNumberTest() {
        verifyIfClickedNumberIsDisplayed();
    }
    @Step("Step 1: Click number '5' and verify if its displayed on screen")
    public void verifyIfClickedNumberIsDisplayed(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickNumber("5");

        String text = calculatorPage.getTextFromDisplay(CalculatorPageSelectors.calculatorDisplay);
        Assertions.assertThat(text).isEqualTo("5");
    }

    @Test
    public void verifyMultipleResult() {
        multipleNumbers();
        verifyResult();
    }
    @Step("Step 1: Multiple number 5 with 3")
    public void multipleNumbers(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        calculatorPage.clickNumber("5");
        calculatorPage.clickMultipleButton();
        calculatorPage.clickNumber("3");
        calculatorPage.clickEqualButton();
    }
    @Step("Step 2: Verify if result is 15")
    public void verifyResult(){
        CalculatorPage calculatorPage = new CalculatorPage(driver);
        Assertions.assertThat(calculatorPage.getTextFromDisplay(CalculatorPageSelectors.resultDisplay)).isEqualTo("15");
    }
}