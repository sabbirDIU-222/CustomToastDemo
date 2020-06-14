package com.example.customtoastdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button button;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create allInOne method to sure not in mess in onCreate method

        allInOne();

    }

    public void allInOne()
    {
        button = findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // first we need a layout inflator
                // so that we can get layout inflator
                // and take inflate method
                // we customized our drawable resource as a view
                LayoutInflater inflater = getLayoutInflater();
                view = inflater.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.relativeId));


                /// then we ccreate a instance of toast
                // and set gravity duaration and other staff

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM,0,0);

                // we must notice that we call set View method
                // and put the recently create view in the set view method
                // otherwise the toast will not printed
                // and last we show it 
                toast.setView(view);
                toast.show();



            }
        });
    }
}
