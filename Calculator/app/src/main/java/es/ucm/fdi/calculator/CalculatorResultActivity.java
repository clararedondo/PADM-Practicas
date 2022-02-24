package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorResultActivity extends AppCompatActivity {

    private static TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result);

        text = findViewById(R.id.textView);

        Intent intent = getIntent();
        double result = intent.getDoubleExtra("result", 0.0);
        text.setText(String.valueOf(result));
    }
}