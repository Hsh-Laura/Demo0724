package com.hs.www.demo0724;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hs.www.demol1.GirlsActivity;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.hhh);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent=new Intent(MainActivity.this, GirlsActivity.class);
                startActivity(intent);*/
             try{
                 Class cls=Class.forName("com.hs.www.demol1.GirlsActivity");
                 Intent intent=new Intent(MainActivity.this, GirlsActivity.class);
                 startActivity(intent);
             }catch (Exception e){

             }
            }
        });
    }
}
