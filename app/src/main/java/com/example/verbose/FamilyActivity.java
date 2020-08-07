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

public class FamilyActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("mamă","mother", R.drawable.family_mother,R.raw.mother));
        words.add(new Word("tată","father", R.drawable.family_father,R.raw.father));
        words.add(new Word("fiu","son",R.drawable.family_son,R.raw.son));
        words.add(new Word("fiică","daughter",R.drawable.family_daughter,R.raw.daughter));
        words.add(new Word("bunic","grandfather",R.drawable.family_grandpa,R.raw.grandfather));
        words.add(new Word("bunică","grandmother",R.drawable.family_grandma,R.raw.grandmother));
        words.add(new Word("unchi","uncle",R.drawable.family_uncle,R.raw.uncle));
        words.add(new Word("mătușă","aunt",R.drawable.family_aunt,R.raw.aunt));
        words.add(new Word("frate","brother",R.drawable.family_brother,R.raw.brother));
        words.add(new Word("soră","sister",R.drawable.family_sister,R.raw.sister));
        words.add(new Word("văr / verișoară","cousin",R.drawable.family_cousin,R.raw.cousin));
        words.add(new Word("nepot / nepoată (de bunici)","grandson / grandaughter",R.drawable.family_granddaughter,R.raw.grandson));
        words.add(new Word("nepot / nepoată (de unchi)","nephew / niece",R.drawable.family_nephew,R.raw.nephew));


        WordAdapter adapter = new WordAdapter(this,words, R.color.colorFamily);
        ListView listView = (ListView) findViewById(R.id.family_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }

}
