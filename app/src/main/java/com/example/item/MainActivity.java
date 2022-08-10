package com.example.item;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_insert;
    EditText cat_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_insert=findViewById(R.id.btn_insert);
        cat_name=findViewById(R.id.cat_name);

        btn_insert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                if(!btn_insert.getText().toString().equals("")){

                } else{
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Name Required!",Toast.LENGTH_LONG).show();
                }

            }


        });
    }
}