package com.example.nayrouz.tp4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;

public class GameActivity extends AppCompatActivity {
    EditText Ville;
    ListView List;
    Array tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);


        Ville = (EditText) findViewById(R.id.Ville);
        List = (ListView) findViewById(R.id.myList);

        List.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Ville.setText(List.getItemAtPosition(position).toString());
                // Intent intentt= new Intent(this,HintActivity.class);
                Intent intent = new Intent(getApplicationContext(), HintActivity.class);
                startActivity(intent);


            }

        });
    }
}
