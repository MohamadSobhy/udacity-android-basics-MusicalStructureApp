package com.example.musicalstructureapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView newreleases = findViewById(R.id.newreleases);
        newreleases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newreleasesIntent = new Intent(MainActivity.this, NewReleasesActivity.class);
                startActivity(newreleasesIntent);
            }
        });

        TextView nowplaying = findViewById(R.id.nowplaying);
        nowplaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowplayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowplayingIntent);
            }
        });

        TextView podcasts = findViewById(R.id.podcasts);
        podcasts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent podcastsIntent = new Intent(MainActivity.this, PodcastsActivity.class);
                startActivity(podcastsIntent);
            }
        });

        TextView topcharts = findViewById(R.id.topcharts);
        topcharts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent topchartsIntent = new Intent(MainActivity.this, TopChartsActivity.class);
                startActivity(topchartsIntent);
            }
        });
    }
}
