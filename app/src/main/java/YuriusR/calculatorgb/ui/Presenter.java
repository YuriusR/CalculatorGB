package YuriusR.calculatorgb.ui;

import YuriusR.calculatorgb.modelView.Calculator;
import YuriusR.calculatorgb.modelView.Operations;

public class Presenter {
    private ResultView view;
    private Calculator calculator;
    private double digitOne;
    private double digitTwo;

    public Presenter(ResultView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onDigitPressed(int digits) {


    }

    public void onOperatorsPressed(Operations operations) {
    }

    public void onCommaPressed() {
    }
}
