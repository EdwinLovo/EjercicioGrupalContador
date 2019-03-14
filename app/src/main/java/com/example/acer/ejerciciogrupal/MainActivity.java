package com.example.acer.ejerciciogrupal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int add1,add2;
    private Button btnAdd1,btnAdd2;
    private TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add1 = 0;
        add2 = 0;
        btnAdd1 =  findViewById(R.id.btnAdd1);
        btnAdd2 =  findViewById(R.id.btnAdd2);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add1++;
                txt1.setText(Integer.toString(add1));
            }
        });
        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add2++;
                txt2.setText(Integer.toString(add2));
            }
        });
    }


}
