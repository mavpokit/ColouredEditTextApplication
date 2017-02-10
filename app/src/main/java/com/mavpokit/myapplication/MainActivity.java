package com.mavpokit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ColouredEditText cet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);

        final Spinner spinner = (Spinner)findViewById(R.id.spinner2);

        cet = (ColouredEditText)findViewById(R.id.cet1);

        ColouredSpinner colouredSpinner = (ColouredSpinner)findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapterSn = ArrayAdapter.createFromResource(this,
                R.array.function1array, android.R.layout.simple_spinner_item);
        adapterSn.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        colouredSpinner.setAdapter(adapterSn);
        spinner.setAdapter(adapterSn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(),cet.getText(),Toast.LENGTH_SHORT).show();
                String string = String.valueOf(spinner.getSelectedItemPosition());
                Toast.makeText(getApplicationContext(), string,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
