package hoangquocnam.baikt2.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Number;
    RadioButton radio13, radio15, radio18;
    Button Cal;
    float kq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Number = (EditText) findViewById(R.id.edNum);
        radio13 = (RadioButton) findViewById(R.id.radio13);
        radio15 = (RadioButton) findViewById(R.id.radio15);
        radio18 = (RadioButton) findViewById(R.id.radio18);
        Cal = (Button) findViewById(R.id.btnCal);

        Cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = Number.getText().toString();
                float b = Float.parseFloat(a);
                if(radio13.isChecked()){
                    kq = b*13/100;
                    Toast.makeText(MainActivity.this, "Your tip will be $" + kq, Toast.LENGTH_SHORT).show();
                }

                else
                if(radio15.isChecked()) {
                    kq = b * 15/100;
                    Toast.makeText(MainActivity.this, "Your tip will be $"+kq, Toast.LENGTH_SHORT).show();
                }

                else
                if(radio18.isChecked()) {
                    kq = b * 18/100;
                    Toast.makeText(MainActivity.this, "Your tip will be $"+kq, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}