package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.getMadLibButton) Button mMyButton;
    @Bind(R.id.textView2) TextView mHomeText;
    @Bind(R.id.color) EditText mColor;
    @Bind(R.id.adjective) EditText mAdjective;
    @Bind(R.id.noun) EditText mNoun;
    @Bind(R.id.noun1) EditText mNounOne;
    @Bind(R.id.noun2) EditText mNounTwo;
    @Bind(R.id.food) EditText mFood;
    @Bind(R.id.verb) EditText mVerb;
    @Bind(R.id.noun3) EditText mNounThree;
    @Bind(R.id.noun4) EditText mNounFour;
    @Bind(R.id.noun5) EditText mNounFive;
    @Bind(R.id.adjective2) EditText mAdjectiveTwo;
    @Bind(R.id.noun6) EditText mNounSix;
    @Bind(R.id.exclamation) EditText mExclamation;
    @Bind(R.id.place) EditText mPlace;
    @Bind(R.id.name) EditText mName;
    @Bind(R.id.food2) EditText mFoodTwo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mMyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String color = mColor.getText().toString();
                String adjective = mAdjective.getText().toString();
                String noun = mNoun.getText().toString();
                String noun1 = mNounOne.getText().toString();
                String noun2 = mNounTwo.getText().toString();
                String food = mFood.getText().toString();
                String verb = mVerb.getText().toString();
                String noun3 = mNounThree.getText().toString();
                String noun4 = mNounFour.getText().toString();
                String noun5 = mNounFive.getText().toString();
                String adjective2 = mAdjectiveTwo.getText().toString();
                String noun6 = mNounSix.getText().toString();
                String exlamation = mExclamation.getText().toString();
                String place = mPlace.getText().toString();
                String name = mName.getText().toString();
                String food2 = mFoodTwo.getText().toString();
                Intent intent = new Intent(MainActivity.this, MadLibs.class);



                String[] result = {name, color, adjective, noun, noun1, food, verb, noun2, noun3, noun4, adjective2, noun5, exlamation, place, food2, noun6};
                intent.putExtra("result", result);
                startActivity(intent);
            }
        });
    }
}