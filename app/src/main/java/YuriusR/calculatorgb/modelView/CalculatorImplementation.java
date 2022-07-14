package YuriusR.calculatorgb.modelView;

public class CalculatorImplementation implements Calculator{
    @Override
    public float performOperations(float arg1, float arg2, Operations operations) {

        switch (operations){
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
                return (arg2 / 100 * arg1);


        }
        return 0;
    }
}
