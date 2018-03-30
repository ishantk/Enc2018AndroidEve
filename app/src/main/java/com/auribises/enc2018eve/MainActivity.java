package com.auribises.enc2018eve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    // Declare the reference to the View, which you wish to use
    EditText eTxtRef;
    TextView txtRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Initialize the Ref to the View
        eTxtRef = findViewById(R.id.editText);
        txtRef = findViewById(R.id.textView2);
    }

    public void clickHandler(View view){

        /*String name = eTxtRef.getText().toString();

        Date date = new Date();
        Toast.makeText(this,"Dear, "+name+"\n\nYou Clicked Button. \n\nToday is: "+date.toString(),Toast.LENGTH_LONG).show();*/

        String num = eTxtRef.getText().toString();
        int n = Integer.parseInt(num);

        StringBuffer buffer = new StringBuffer();
        for(int i=1;i<=10;i++){
            buffer.append(n+" "+i+"'s are "+(n*i)+"\n");
        }

        //Toast.makeText(this,buffer.toString(),Toast.LENGTH_LONG).show();
        txtRef.setText(buffer.toString());
    }
}
