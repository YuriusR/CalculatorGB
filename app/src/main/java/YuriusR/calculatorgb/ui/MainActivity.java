package YuriusR.calculatorgb.ui;

import static YuriusR.calculatorgb.R.id.result;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import YuriusR.calculatorgb.R;
import YuriusR.calculatorgb.modelView.CalculatorImplementation;
import YuriusR.calculatorgb.modelView.Operations;


public class MainActivity extends AppCompatActivity implements ResultView {
    private TextView resultUi;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_calculator);
        resultUi = findViewById(result);
        presenter = new Presenter(this, new CalculatorImplementation() {
            @Override
            public double performOperations(double arg1, double arg2, Operations operations) {
                return 0.0;
            }
        });

        Map<Integer, Integer> digits = new HashMap<>();
        digits.put(R.id.key_1, 1);
        digits.put(R.id.key_2, 2);
        digits.put(R.id.key_3, 3);
        digits.put(R.id.key_4, 4);
        digits.put(R.id.key_5, 5);
        digits.put(R.id.key_6, 6);
        digits.put(R.id.key_7, 7);
        digits.put(R.id.key_8, 8);
        digits.put(R.id.key_9, 9);
        digits.put(R.id.key_zero, 0);
        digits.put(R.id.key_doubleZero, 00);

        View.OnClickListener digitClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onDigitPressed(digits.get(view.getId()));
            }
        };
        findViewById(R.id.key_1).setOnClickListener(digitClickListener);
        findViewById(R.id.key_2).setOnClickListener(digitClickListener);
        findViewById(R.id.key_3).setOnClickListener(digitClickListener);
        findViewById(R.id.key_4).setOnClickListener(digitClickListener);
        findViewById(R.id.key_5).setOnClickListener(digitClickListener);
        findViewById(R.id.key_6).setOnClickListener(digitClickListener);
        findViewById(R.id.key_7).setOnClickListener(digitClickListener);
        findViewById(R.id.key_8).setOnClickListener(digitClickListener);
        findViewById(R.id.key_9).setOnClickListener(digitClickListener);
        findViewById(R.id.key_zero).setOnClickListener(digitClickListener);
        findViewById(R.id.key_doubleZero).setOnClickListener(digitClickListener);

        Map<Integer, Operations> operators = new HashMap<>();
        operators.put(R.id.key_clear, Operations.CLEAR);
        operators.put(R.id.key_backspace, Operations.BACKSPACE);
        operators.put(R.id.key_divide, Operations.DIVIDE);
        operators.put(R.id.key_minus, Operations.MINUS);
        operators.put(R.id.key_plus, Operations.PLUS);
        operators.put(R.id.key_multiply, Operations.MULTIPLY);
        operators.put(R.id.key_percent, Operations.PERCENT);

        View.OnClickListener operatorsClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onOperatorsPressed(operators.get(view.getId()));
            }
        };
        findViewById(R.id.key_backspace).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_clear).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_divide).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_equals).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_minus).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_plus).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_multiply).setOnClickListener(operatorsClickListener);
        findViewById(R.id.key_percent).setOnClickListener(operatorsClickListener);

        findViewById(R.id.key_comma).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.onCommaPressed();
            }
        });
    }


    @Override
    public void showResult(String result) {
        resultUi.setText(result);

    }
}