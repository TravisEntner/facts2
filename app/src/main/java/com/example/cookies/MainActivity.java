package com.example.cookies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button pressPlz;
    TextView textView;
    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        pressPlz = findViewById(R.id.pressbutton);
        textView = findViewById(R.id.text);

        pressPlz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNewFact();

                //Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                //startActivity(intent);


            }
        });

    }

    public void showNewFact(){
        String[] facts = {"the average person will spend six months of their lives at red lights",
                "the worlds biggest pyramid isn't in Egypt",
                "Dolphins have their own language",
                "Sears used to sell houses",
                "hot water cleans better than cold water",
                "bottled water produces plastic bottles",
                "rich russians hire fake ambulances",
                "your funny bone isn't a bone it's a nerve",
                "Apple used to have it's own clothing and lifestyle line",
                "someone tried to sell New Zealand on ebay",};

        random = new Random();
        int randomNumber = random.nextInt(facts.length);
        textView.setText(facts[randomNumber]);

    }
}
