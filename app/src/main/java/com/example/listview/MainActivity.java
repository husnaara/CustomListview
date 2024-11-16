package com.example.listview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
String vegetablelist[]={"Tomato","Cabbage","Cauliflower","Potato"};
int vegetableImages[]={R.drawable.tomato,R.drawable.cabbage,R.drawable.cauliflower,R.drawable.patato};
  ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.customListView);
        CustomBaseAdaptr customBaseAdaptr=new CustomBaseAdaptr(getApplicationContext(),vegetablelist,vegetableImages);
        listView.setAdapter(customBaseAdaptr);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("CUSTOM_LIST_VIEW","Item is clicked @position::"+position);
            }
        });

    }
}