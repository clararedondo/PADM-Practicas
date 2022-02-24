package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class CalculatorResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result);
        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0.0);
    }
}
