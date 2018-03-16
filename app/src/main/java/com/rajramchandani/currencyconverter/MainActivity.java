package com.rajramchandani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   public void click(View v)
   {
       EditText ed=(EditText)findViewById(R.id.result);
       Double amount=Double.parseDouble(ed.getText().toString());
       switch(v.getId())
       {
           case R.id.india:
               Double india=amount*64.08;
               Toast.makeText(MainActivity.this,india.toString(), Toast.LENGTH_SHORT).show();
               break;
           case R.id.us:
               Double us=amount/64.08;
               Toast.makeText(MainActivity.this, us.toString(), Toast.LENGTH_SHORT).show();
               break;
       }

   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
