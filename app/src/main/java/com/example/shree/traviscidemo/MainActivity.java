package com.example.shree.traviscidemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Test", Toast.LENGTH_SHORT).show();
        initViewMy();
    }

    private void initViewMy() {
    }
    
    private void initView(){
        int i=0;
        int j=1;
        int k=1;

    }
}
