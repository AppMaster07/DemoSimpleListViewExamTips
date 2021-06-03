package sg.edu.rp.c346.day2.demoarraysarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArray, btnArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArray = findViewById(R.id.btnArray);
        btnArrayList =  findViewById(R.id.btnArrayList);

        btnArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, ArrayActivity.class);
                startActivity(i);
            }
        });

        btnArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (MainActivity.this, ArrayListActivity.class);
                startActivity(i);
            }
        });
    }
}