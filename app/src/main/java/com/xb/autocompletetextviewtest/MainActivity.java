package com.xb.autocompletetextviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String GAME[]=new String[]{"game1","game2","game3","game4","game5","game6"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autocomplete);
        autoCompleteTextView.setFocusable(true);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.autocomplete_hint,GAME);
        autoCompleteTextView.setAdapter(adapter);
    }
}
