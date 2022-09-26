package YuriusR.calculatorgb.modelView;

import YuriusR.calculatorgb.ui.ResultView;

public abstract class CalculatorImplementation implements Calculator {

    public double performOperations(double arg1, double arg2, Operations operations, ResultView resultView) {

        switch (operations) {
            case PLUS:
                return arg1 + arg2;
            case MINUS:
                return arg1 - arg2;
            case DIVIDE:
                return arg1 / arg2;
            case MULTIPLY:
                return arg1 * arg2;
            case CLEAR:
                return 0;
            case PERCENT:
                return (arg1 / 100 * arg2);
        }
        return 0.0;
    }
}
