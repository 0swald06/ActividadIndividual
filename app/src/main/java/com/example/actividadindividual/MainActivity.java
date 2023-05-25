package com.example.actividadindividual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnS,btnR,btnM,btnD;
    EditText numero1,numero2;
    TextView valor;
    int num1,num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnS=findViewById(R.id.btn_suma);
        btnR=findViewById(R.id.btn_resta);
        btnM=findViewById(R.id.btn_multi);
        btnD=findViewById(R.id.btn_divi);
        numero1=findViewById(R.id.editNum1);
        numero2=findViewById(R.id.editNum2);
        valor=findViewById(R.id.valor);

        btnS.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnD.setOnClickListener(this);
    }
    public int getIntFromEditText(EditText editText){
        if (editText.getText().toString().equals("")){
            Toast.makeText(this,"ingreaw numero",Toast.LENGTH_SHORT).show();
            return 0;
        }else
            return Integer.parseInt(editText.getText().toString());

    }
    @Override
    public void onClick(View v) {
        num1=getIntFromEditText(numero1);
        num2=getIntFromEditText(numero2);
 
    }
}