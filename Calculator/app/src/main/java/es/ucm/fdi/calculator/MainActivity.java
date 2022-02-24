package es.ucm.fdi.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static Calculator calculator;
    private static EditText editTextX;
    private static EditText editTextY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivity.editTextX = findViewById(R.id.editTextNumberDecimal);
        MainActivity.editTextY = findViewById(R.id.editTextNumberDecimal2);

        setContentView(R.layout.activity_main);
    }

    public void addXandY(){
        try {
            result = calculator.add((double) editTextX.getText(), (double) editTextY.getText());
        }
        catch {
            //Add new activity to show error
        }
        Intent intent = new Intent(this, CalculatorResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}