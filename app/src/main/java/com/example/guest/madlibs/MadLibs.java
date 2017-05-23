package com.example.guest.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MadLibs extends AppCompatActivity {
    @Bind(R.id.madText) TextView mMadText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mad_libs);
        ButterKnife.bind(this);
        Intent intent = getIntent();

        String[] result = intent.getStringArrayExtra("result");

        String story = String.format("Once upon a time, I dreamed of a unicorn named %s. She had beautiful %s eyes and %s hair the color of a %s. She lived in a pretty %s. She let me feed her %s, and then I %s her %s. She gave me a %s that I put on my %s. She let me climb on her back and rook me to see a %s fairy who grants whishes to children. I wished for a %s and was so surprised when it appeared before me that I shouted \"%s\" when I saw it. Then we had a picnic near a %s and ate %s. Soon it was time to say goodbye. I gave her a big %s goodbye!", result[0], result[1], result[2], result[3], result[4], result[5],result[6], result[7], result[8], result[9], result[10], result[11],result[12], result[13], result[14], result[15]);

        mMadText.setText(story);
    }
}
