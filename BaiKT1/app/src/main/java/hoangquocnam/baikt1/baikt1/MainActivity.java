package hoangquocnam.baikt1.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Name, Pass;
    TextView Attempts;
    Button btnLogin;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.edtUserName);
        Pass = (EditText) findViewById(R.id.edtPass);
        Attempts = (TextView) findViewById(R.id.tvAttemps);
        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = i+1;
                i = a;
                Attempts.setText(" " + a);
                String Username = Name.getText().toString();
                String Password = Pass.getText().toString();
                if(Username.equals("maicuongtho") && Password.equals("Cntt60ntu!"))
                    Toast.makeText(MainActivity.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"User and Password is wrong", Toast.LENGTH_SHORT).show();
            }
        });
    }
}