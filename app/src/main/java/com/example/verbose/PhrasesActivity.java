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

public class PhrasesActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Salut!","Hello!",R.raw.hello));
        words.add(new Word("Mulțumesc!","Thank you!",R.raw.ty));
        words.add(new Word("Scuze!","Sorry!",R.raw.sorry));
        words.add(new Word("Cum te cheamă?","What's your name?",R.raw.wname));
        words.add(new Word("Numele meu este...","My name is...",R.raw.name));
        words.add(new Word("Câți ani ai?","How old are you?",R.raw.howoldareyou));
        words.add(new Word("Cum mai ești?","How are you?",R.raw.howareyou));
        words.add(new Word("Mi-e foame.","I am hungry.",R.raw.hungry));
        words.add(new Word("Mi-e sete.","I am thirsty.",R.raw.thirsty));
        words.add(new Word("M-am pierdut.","I am lost.",R.raw.lost));



        WordAdapter adapter = new WordAdapter(this,words, R.color.colorPhrases);
        ListView listView = (ListView) findViewById(R.id.phrases_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }

}
