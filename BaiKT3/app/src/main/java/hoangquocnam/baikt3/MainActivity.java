package hoangquocnam.baikt3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText pos, val;
    Button them, sua, xoa;
    ListView listView;
    ArrayList<String> listData;
    ArrayAdapter adapter;
    int vitri;
    String giatri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pos = (EditText) findViewById(R.id.edPos);
        val = (EditText) findViewById(R.id.edVal);
        them = (Button) findViewById(R.id.btnThem);
        sua = (Button) findViewById(R.id.btnSua);
        xoa = (Button) findViewById(R.id.btnXoa);
        listView = (ListView) findViewById(R.id.ListView);

        listData = new ArrayList<>();
        listData.add("Content");
        listData.add("Graphics");
        listData.add("Hardware");
        listData.add("Media");
        listData.add("NFC");
        listData.add("OS");
        listData.add("Preference");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                val.setText(listData.get((int) l));
                pos.setText("" + i);
                vitri = i;
            }
        });

        them.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giatri = val.getText().toString();
                listData.add(giatri);
                adapter.notifyDataSetChanged();
            }
        });

        sua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                giatri = val.getText().toString();
                listData.set(vitri, giatri);
                adapter.notifyDataSetChanged();
            }
        });

        xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listData.remove(vitri);
                adapter.notifyDataSetChanged();
            }
        });
    }
}