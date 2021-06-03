package sg.edu.rp.c346.id20002369.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etElement, etIndexElement;
    Button btnAdd;
    ListView lvColour;
    ArrayAdapter adapter;
    ArrayList <String> alColours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etElement = findViewById(R.id.editTextFruit);
        etIndexElement = findViewById(R.id.editTextNumber);
        btnAdd = findViewById(R.id.buttonAdd);
        lvColour = findViewById(R.id.listView);

        alColours = new ArrayList<>();
        alColours.add("Red");
        alColours.add("Orange");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alColours);
        lvColour.setAdapter(adapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = etElement.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alColours.add(pos, colour);
                adapter.notifyDataSetChanged();
            }
        });

        lvColour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String colour = alColours.get(position);
                Toast.makeText(MainActivity.this, colour, Toast.LENGTH_SHORT).show();

            }
        });
    }
}