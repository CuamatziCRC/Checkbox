package com.example.cuamatzi.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1,et2;
    private CheckBox CB1,CB2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.ET1);
        et2 = (EditText)findViewById(R.id.ET2);
        CB1 = (CheckBox)findViewById(R.id.CB1);
        CB2 = (CheckBox)findViewById(R.id.CB2);
        tv1 =(TextView)findViewById(R.id.TV1);
    }

    //Para los botones
    public void Calcular(View view){
        String VS1 = et1.getText().toString();
        String VS2 = et2.getText().toString();

        int VI1 = Integer.parseInt(VS1);
        int VI2 = Integer.parseInt(VS2);

        String resultado = "";

        if (CB1.isChecked()){
            int suma = VI1 + VI2;
            resultado = "  La suma es: "+ suma +"/";
        }
        if (CB2.isChecked()){
            int resta = VI1 - VI2;
            resultado = resultado + "  La resta es: "+ resta ;
        }
        tv1.setText(resultado);
    }
}
