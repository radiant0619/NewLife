package com.southservice.matrimony;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;


/**
 * Created by rsvra on 06/10/2016.
 */

public class searchDrawerActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_header_view);
       View view= LayoutInflater.from(searchDrawerActivity.this).inflate(R.layout.search_view,null);

    }
}
