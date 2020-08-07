package com.example.verbose;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

import com.example.verbose.R;
import com.example.verbose.Word;
import com.example.verbose.WordAdapter;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    public MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("albastru","blue",R.drawable.color_blue,R.raw.blue));
        words.add(new Word("verde","green",R.drawable.color_green,R.raw.green));
        words.add(new Word("galben","yellow",R.drawable.color_mustard_yellow,R.raw.yellow));
        words.add(new Word("portocaliu","orange",R.drawable.color_orange,R.raw.orange));
        words.add(new Word("mov","purple",R.drawable.color_purple,R.raw.purple));
        words.add(new Word("roșu","red",R.drawable.color_red,R.raw.red));
        words.add(new Word("roz","pink",R.drawable.color_pink,R.raw.pink));
        words.add(new Word("alb","white",R.drawable.color_white,R.raw.white));
        words.add(new Word("negru","black",R.drawable.color_black,R.raw.black));
        words.add(new Word("gri","gray",R.drawable.color_gray,R.raw.gray));
        words.add(new Word("maro","brown",R.drawable.color_brown,R.raw.brown));



        WordAdapter adapter = new WordAdapter(this,words, R.color.colorColors);
        ListView listView = (ListView) findViewById(R.id.color_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(ColorsActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }

}
