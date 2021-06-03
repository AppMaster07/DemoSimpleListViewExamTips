package sg.edu.rp.c346.id20002369.demospinnertest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    Spinner spnYesNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        spnYesNo = findViewById(R.id.spinner);

        spnYesNo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected", Toast.LENGTH_SHORT).show();

                switch (position) {
                    case 0:
                        tv.setText("Spinner Item, Yes Selected");
                        break;
                    case 1:
                        tv.setText("Spinner Item, No Selected");
                        break;
                }

//                if (position == 0) {
//                    tv.setText("Spinner Item, Yes Selected");
//                } else if (position == 1) {
//                    tv.setText("Spinner Item, No Selected");
//                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

}