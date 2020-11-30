package com.example.uravnenie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText  = (EditText) findViewById(R.id.editTextNumber);
        editText2 = (EditText) findViewById(R.id.editTextNumber2);
        editText3 = (EditText) findViewById(R.id.editTextNumber3);
        textView  = (TextView) findViewById(R.id.textV);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a;
                double b;
                double c;
                double d1;
                double d2;
                String S1 = editText.getText().toString();
                String S2 = editText2.getText().toString();
                String S3 = editText3.getText().toString();
                a = Double.parseDouble(S1);
                b = Double.parseDouble(S2);
                c = Double.parseDouble(S3);
                d1 = (-1*b + Math.sqrt(b*b-4*a*c))/(2*a);
                d2 = (-1*b - Math.sqrt(b*b-4*a*c))/(2*a);
                String s1 = String.valueOf(d1);
                String s2 = String.valueOf(d2);
                textView.setText(s1 + s2);
            }
        });
    }
}
