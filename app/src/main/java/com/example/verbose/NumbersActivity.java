package com.example.verbose;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("unu","one",R.drawable.number_one,R.raw.one));
        words.add(new Word("doi","two",R.drawable.number_two,R.raw.two));
        words.add(new Word("trei","three",R.drawable.number_three,R.raw.three));
        words.add(new Word("patru","four",R.drawable.number_four,R.raw.four));
        words.add(new Word("cinci","five",R.drawable.number_five,R.raw.five));
        words.add(new Word("șase","six",R.drawable.number_six,R.raw.six));
        words.add(new Word("șapte","seven",R.drawable.number_seven,R.raw.seven));
        words.add(new Word("opt","eight",R.drawable.number_eight,R.raw.eight));
        words.add(new Word("nouă","nine",R.drawable.number_nine,R.raw.nine));
        words.add(new Word("zece","ten",R.drawable.number_ten,R.raw.ten));
        words.add(new Word("o sută","a hundred",R.drawable.number_hundred,R.raw.hundred));
        words.add(new Word("o mie","a thousand",R.drawable.number_thousand,R.raw.thousand));


        WordAdapter adapter = new WordAdapter(this,words, R.color.colorNumbers);
        ListView listView = (ListView) findViewById(R.id.number_list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }

}
