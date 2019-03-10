package com.example.rezam.test5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Spinner spinner;
private EditText editText;
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
public void addListenerOnButton(View view){
    spinner = (Spinner) findViewById(R.id.spinner);
    editText = (EditText) findViewById(R.id.editText);
    button = (Button) findViewById(R.id.button);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String value= editText.getText().toString();
            int finalValue=Integer.parseInt(value);
            String value2= String.valueOf(spinner.getSelectedItem());
            String test= "reza";
            if(value2.equals("inch")){
                test="acdc";
            }
        //    Toast.makeText(MainActivity.this,
          //          "OnClickListener : " +
          //                  "\nSpinner  : "+ test +
          //                  "\nSpinner  : "+ finalValue,
            //        Toast.LENGTH_SHORT).show();
Intent int1=new Intent(MainActivity.this,newww.class);
            Bundle b= new Bundle();
            b.putString("nubmber", value);
            b.putString("convert", value2);
            int1.putExtras(b);
            startActivityForResult(int1, 0);
        }
    });
}
}
