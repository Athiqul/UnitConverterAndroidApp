package com.example.kgtopound;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import  android.view.View;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText getInput=(EditText) findViewById(R.id.editTextNumber);
        TextView showOutput=(TextView) findViewById(R.id.textView2);
        Button button = (Button) findViewById(R.id.button);
        //button listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String input=getInput.getText().toString();
               double kg=Double.parseDouble(input);
               double pound= round( kg*2.204);
               showOutput.setText("Output is: " +pound +" pound");
            }
        });
        //Displaying Toast with Hello Javatpoint message

        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
    }
}