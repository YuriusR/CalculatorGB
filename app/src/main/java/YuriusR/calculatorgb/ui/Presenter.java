package YuriusR.calculatorgb.ui;

import YuriusR.calculatorgb.modelView.Calculator;
import YuriusR.calculatorgb.modelView.Operations;

public class Presenter {
    private ResultView view;
    private Calculator calculator;
    private double digitOne;
    private Double digitTwo;
    private Operations selectOperator;

    public Presenter(ResultView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    /*public void onDigitPressed(int digits) {
        if (digitTwo == null) {
            digitOne = (digitOne * 10 + digits);
            view.showResult(String.valueOf(digitOne));
        } else
            digitTwo = digitTwo * 10 + digits;
        view.showResult(String.valueOf(digitTwo));
    }*/

    public void onDigitPressed(int digits){
        digitOne = (digitOne * 10 + digits);
        view.showResult(String.valueOf(digitOne));
    }

    public void onOperatorsPressed(Operations operations) {
        selectOperator = operations;
        if (selectOperator != null) {
            digitOne = calculator.performOperations(digitOne, digitTwo, selectOperator);
            view.showResult(String.valueOf(digitOne));
        }
        digitTwo = 0.0;
    }

    public void onCommaPressed() {

    }
//    public void onBackspasePressed(int digits) {
//        if (digitTwo == null) {
//            digitOne = (digitOne - digits) / 10;
//            view.showResult(String.valueOf(digitOne));
//        }else
//            digitTwo = (digitTwo - digits) / 10;
//        view.showResult(String.valueOf(digitTwo));
//    }
   /* public void onEqualsPressed(double arg1, double arg2, ResultView resultView) {
        if (arg2 == null) {
            digitOne = digitOne * 10 + digits;
            view.showResult(String.valueOf(result));
        }else
            digitTwo = digitTwo * 10 +digits;
        view.showResult(String.valueOf(digitTwo));
    }*/


}
