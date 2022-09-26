package YuriusR.calculatorgb.modelView;

public enum Operations {
    PLUS, MINUS, DIVIDE, MULTIPLY, EQUALS, BACKSPACE, PERCENT, CLEAR;

    public static Operations get(double id) {
        return YuriusR.calculatorgb.modelView.Operations.get(id);
    }

}
