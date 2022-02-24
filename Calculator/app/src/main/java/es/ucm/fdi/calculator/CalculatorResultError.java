package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CalculatorResultError extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_result_error);
        TextView text = findViewById(R.id.textView2);
        String err_text =  "Ha ocurrido un error durante la operación";
        text.setText(err_text);

    }
}