package com.example.verbose;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.verbose.R;
import com.example.verbose.Word;
import com.example.verbose.WordAdapter;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("câine","dog",R.drawable.animal_dog, R.raw.dog));
        words.add(new Word("pisică","cat",R.drawable.animal_cat,R.raw.cat));
        words.add(new Word("pasăre","bird",R.drawable.animal_bird,R.raw.bird));
        words.add(new Word("cal","horse",R.drawable.animal_horse,R.raw.horse));
        words.add(new Word("șarpe","snake",R.drawable.animal_snake,R.raw.snake));
        words.add(new Word("vulpe","fox",R.drawable.animal_fox,R.raw.fox));
        words.add(new Word("leu","lion",R.drawable.animal_lion,R.raw.lion));
        words.add(new Word("urs","bear",R.drawable.animal_bear,R.raw.bear));


        WordAdapter adapter = new WordAdapter(this,words, R.color.colorAnimals);
        ListView listView = (ListView) findViewById(R.id.animal_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(AnimalsActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }

}
