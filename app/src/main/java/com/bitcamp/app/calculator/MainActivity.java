package com.bitcamp.app.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

                    @Override
                    protected void onCreate(Bundle savedInstanceState) {
                        super.onCreate(savedInstanceState);
                        setContentView(R.layout.activity_main);
                        final EditText inputValue1 = findViewById(R.id.input_value_1);
                        final EditText inputValue2 = findViewById(R.id.input_value_2);
                        final TextView result = findViewById(R.id.result);

                     findViewById(R.id.plus_btn).setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             result.setText(String.valueOf(Command.calc(inputValue1,inputValue2,"+")));
                         }
                     });
                        findViewById(R.id.minus_btn).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                result.setText(String.valueOf(Command.calc(inputValue1,inputValue2,"-")));
                            }
                        });
                        findViewById(R.id.multiple_btn).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                result.setText(String.valueOf(Command.calc(inputValue1,inputValue2,"*")));
                            }
                        });
                        findViewById(R.id.devide_btn).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                result.setText(String.valueOf(Command.calc(inputValue1,inputValue2,"/")));
                            }
                        });


    }
}
