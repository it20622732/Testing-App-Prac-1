package com.example.item;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.item.DB.DBHandler;

import java.util.concurrent.Callable;

public class MainActivity extends AppCompatActivity {

    Button btn_insert;
    EditText cat_name;
    DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context =getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_insert=findViewById(R.id.btn_insert);
        cat_name=findViewById(R.id.cat_name);
        dbHandler = new DBHandler(this);

        btn_insert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                if(!btn_insert.getText().toString().equals("")){
                    boolean res = dbHandler.addCategory(cat_name.getText().toString());



                    if(res) {
                        cat_name.setText("");
                        Toast.makeText(context,"successful",Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(context, "unsuccessful", Toast.LENGTH_SHORT).show();
                    }

                } else{
                    Context context = getApplicationContext();
                    Toast.makeText(context, "Name Required!",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}




