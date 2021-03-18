package com.example.sumtownum;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txvResult;
    EditText edtNuma, edtNumb;
    Button btnSum, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setControl() {
        txvResult = (TextView)findViewById(R.id.txvResult);
        edtNuma = (EditText)findViewById(R.id.edtNuma);
        edtNumb = (EditText)findViewById(R.id.edtNumb);
        btnSum = (Button)findViewById(R.id.btnSum);
        btnClear = (Button)findViewById(R.id.btnClear);
    }

    private void setEvent() {

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtNuma.getText().length() > 0 && edtNumb.getText().length() > 0) {
                    float sum = Float.parseFloat(edtNuma.getText().toString()) + Float.parseFloat(edtNumb.getText().toString());
                    String str = "Sum of a and b is: " + sum;
                    txvResult.setText("");
                    txvResult.setText(str);
                    txvResult.setBackgroundColor(Color.GREEN);
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNuma.setText("");
                edtNumb.setText("");
                txvResult.setText("");
                txvResult.setBackgroundColor(0x00000000);
            }
        });
    }

}