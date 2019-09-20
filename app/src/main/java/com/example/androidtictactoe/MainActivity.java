package com.example.androidtictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button_1);
        btn2 = findViewById(R.id.button_2);
        btn3 = findViewById(R.id.button_3);
        btn4 = findViewById(R.id.button_4);
        btn5 = findViewById(R.id.button_5);
        btn6 = findViewById(R.id.button_6);
        btn7 = findViewById(R.id.button_7);
        btn8 = findViewById(R.id.button_8);
        btn9 = findViewById(R.id.button_9);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonClick(view);
            }
        });
    }

    int count = 0;

    void buttonClick(View view){
        if(count%2 == 0) {
            ((Button) view).setText("X");
        }else{
            ((Button) view).setText("0");
        }
        count++;
        kiemTraX();
    }

    void kiemTraX(){
        kiemtraButtonX(btn1, btn2, btn3);
        kiemtraButtonX(btn1, btn4, btn7);
        kiemtraButtonX(btn1, btn5, btn9);
        kiemtraButtonX(btn2, btn5, btn8);
        kiemtraButtonX(btn3, btn6, btn9);
        kiemtraButtonX(btn3, btn5, btn7);
        kiemtraButtonX(btn4, btn5, btn6);
        kiemtraButtonX(btn7, btn8, btn9);

        kiemtraButton0(btn1, btn2, btn3);
        kiemtraButton0(btn1, btn4, btn7);
        kiemtraButton0(btn1, btn5, btn9);
        kiemtraButton0(btn2, btn5, btn8);
        kiemtraButton0(btn3, btn6, btn9);
        kiemtraButton0(btn3, btn5, btn7);
        kiemtraButton0(btn4, btn5, btn6);
        kiemtraButton0(btn7, btn8, btn9);
    }
    void kiemtraButtonX(Button a, Button b, Button c){
        if(a.getText().equals("X") && b.getText().equals("X") && c.getText().equals("X")){
            Toast.makeText(this, "X win", Toast.LENGTH_SHORT).show();
            setBtn();
        }
    }

    void kiemtraButton0(Button a, Button b, Button c){
        if(a.getText().equals("0") && b.getText().equals("0") && c.getText().equals("0")){
            Toast.makeText(this, "0 win", Toast.LENGTH_SHORT).show();
            setBtn();
        }
    }

    void setBtn(){
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
    }
}
