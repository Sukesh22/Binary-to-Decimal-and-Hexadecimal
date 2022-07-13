package com.example.binarytohexadecimal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText input, hex,dec;
    Button submit, reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.editText);
        hex = (EditText) findViewById(R.id.hex);
        dec = (EditText) findViewById(R.id.dec);
        submit = (Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = input.getText().toString();
                int i = Integer.parseInt(string,2);
                String hexadecimal = Integer.toHexString(i);
                hex.setText(hexadecimal);
                i = Integer.parseInt(string, 2);
                String decimal = Integer.toString(i);
                dec.setText(decimal);
            }
        });
        reset = (Button) findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText("");
                dec.setText("");
                hex.setText("");
            }
        });
    }
}