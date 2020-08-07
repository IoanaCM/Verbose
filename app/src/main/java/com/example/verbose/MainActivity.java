package com.example.verbose;

import androidx.appcompat.app.AppCompatActivity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AccountManager am = AccountManager.get(this);
        Account[] accounts = am.getAccountsByType("com.google");
        //search number view
        TextView numbers = (TextView) findViewById(R.id.numbers);

        //add the onClick listener
        numbers.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);

                startActivity(numbersIntent);
            }
        });

        //search the family members view
        TextView family = (TextView) findViewById(R.id.family);

        //add the onClick listener
        family.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                startActivity(familyIntent);
            }
        });

        //search colors activity
        TextView colors = (TextView) findViewById(R.id.colors);

        //
        colors.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                startActivity(colorsIntent);
            }
        });
        //search phrases activity
        TextView phrases = (TextView) findViewById(R.id.phrases);

        //add the onClick listener
        phrases.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                startActivity(phrasesIntent);
            }
        });
        //search animals activity
        TextView animals = (TextView) findViewById(R.id.animals);

        //add the onClick listener
        animals.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View view){
                Intent animalsIntent = new Intent(MainActivity.this, AnimalsActivity.class);

                startActivity(animalsIntent);
            }
        });
    }
}
