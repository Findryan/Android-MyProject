package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //public variabel
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonC, space;

    EditText Eangka1, Eangka2, Eangka3;
    int batas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonC = (Button) findViewById(R.id.buttonC);
        space = (Button) findViewById(R.id.space);

        Eangka1 = (EditText) findViewById(R.id.angka1);
        Eangka2 = (EditText) findViewById(R.id.angka2);
        Eangka3 = (EditText) findViewById(R.id.angka3);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView hasilView = (TextView) findViewById(R.id.hasilView);

                //sorting
                int arr[] = new int[5];
                arr[0] = Integer.parseInt(Eangka1.getText().toString());
                arr[1] = Integer.parseInt(Eangka2.getText().toString());
                arr[2] = Integer.parseInt(Eangka3.getText().toString());
                int temp;
                for(int i=0; i < 3; i++){
                    for(int j=1; j < (3-i); j++){
                        if(arr[j-1] > arr[j]){
                            //swap elements
                            temp = arr[j-1];
                            arr[j-1] = arr[j];
                            arr[j] = temp;
                        }

                    }
                }

                //cek
                int cek1 = arr[0] - arr[1];
                int cek2 = arr[1] - arr[2];

                if (cek1 < cek2){
                    hasilView.setText(String.valueOf(arr[0]));
                }else{
                    hasilView.setText(String.valueOf(arr[2]));
                }

                batas = 0;
                Eangka1.setText("");
                Eangka2.setText("");
                Eangka3.setText("");
            }

        });

        space.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                batas++;
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "0");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "0");
                }else {
                    Eangka3.setText(Eangka3.getText() + "0");
                }
                batas++;
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "1");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "1");
                }else {
                    Eangka3.setText(Eangka3.getText() + "1");
                }
                batas++;
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "2");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "2");
                }else {
                    Eangka3.setText(Eangka3.getText() + "2");
                }
                batas++;
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "3");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "3");
                }else {
                    Eangka3.setText(Eangka3.getText() + "3");
                }
                batas++;
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "4");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "4");
                }else {
                    Eangka3.setText(Eangka3.getText() + "4");
                }
                batas++;
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "5");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "5");
                }else {
                    Eangka3.setText(Eangka3.getText() + "5");
                }
                batas++;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "6");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "6");
                }else {
                    Eangka3.setText(Eangka3.getText() + "6");
                }
                batas++;
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "7");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "7");
                }else {
                    Eangka3.setText(Eangka3.getText() + "7");
                }
                batas++;
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "8");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "8");
                }else {
                    Eangka3.setText(Eangka3.getText() + "8");
                }
                batas++;
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (batas < 2){
                    Eangka1.setText(Eangka1.getText() + "9");
                }else if(batas > 1 && batas < 4){
                    Eangka2.setText(Eangka2.getText() + "9");
                }else {
                    Eangka3.setText(Eangka3.getText() + "9");
                }
                batas++;
            }
        });
    }
}
