package com.example.vyomesh.tictaktoe;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by hp on 11/10/2016.
 */

public class Winner extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getIntent()!=null)
            b = getIntent().getExtras().getString("who");

        if(b.equals("tom"))
        {
          setContentView(R.layout.winner_tom);
        }
        else{
            if(b.equals("jerry")){
                setContentView(R.layout.winner_jerry);
            }

        }
    }
    String  b ;
}

