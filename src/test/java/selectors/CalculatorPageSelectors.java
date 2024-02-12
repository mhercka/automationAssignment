package selectors;

import org.openqa.selenium.By;
import tests.Setup;

public class CalculatorPageSelectors {
    public static final By calculatorDisplay = By.id("com.android.calculator2:id/formula");
    public static final By multipleButton = By.id("com.android.calculator2:id/op_mul");
    public static final By equalButton = By.id("com.android.calculator2:id/eq");
    public static final By resultDisplay = By.id("com.android.calculator2:id/result");
}

