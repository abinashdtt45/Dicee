package com.example.abinash.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button roll= (Button) findViewById(R.id.RollAction);
          final ImageView image=(ImageView) findViewById(R.id.Rock);

        final int[] images={R.drawable.paper,
                R.drawable.scissors,
                R.drawable.rock};

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int number = random.nextInt(3);
                image.setImageResource(images[number]);

            }
        });
    }
}
