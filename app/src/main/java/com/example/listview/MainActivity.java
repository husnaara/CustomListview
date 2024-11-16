package com.example.listview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
String vegetablelist[]={"Tomato","Cabbage","Cauliflower","Potato"};
int vegetableImages[]={R.drawable.tomato,R.drawable.cabbage,R.drawable.cauliflower,R.drawable.patato};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


    }
}