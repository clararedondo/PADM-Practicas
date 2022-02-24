package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static Calculator calculator;
    private static EditText editTextX;
    private static EditText editTextY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.calculator = new Calculator();
        MainActivity.editTextX = findViewById(R.id.editTextNumberDecimal);
        MainActivity.editTextY = findViewById(R.id.editTextNumberDecimal2);
        Log.i("MainActivity","created");
    }

    public void addXandY(android.view.View view){
        double result;
        try {
            Log.i("MainActivity","add called");
            double x = Double.valueOf(editTextX.getText().toString());
            double y = Double.valueOf(editTextY.getText().toString());
            result = MainActivity.calculator.add(x, y);
            Intent intent = new Intent(this, CalculatorResultActivity.class);
            intent.putExtra("result", result);
            startActivity(intent);
            Log.i("MainActivity","result calculated");
        }
        catch (Exception e) {
            Intent intent_error = new Intent(this, CalculatorResultError.class);
            startActivity(intent_error);
        }

    }
}