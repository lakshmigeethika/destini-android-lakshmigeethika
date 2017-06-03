package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.bottom;
import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryText;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryText = (TextView) findViewById(R.id.storyTextView);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mStoryIndex = 1;


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
         mButtonTop.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 Log.d("destini app", "top button clicked");
                 if (mStoryIndex == 1)
                 {

                     mStoryText.setText(R.string.T3_Story);
                     mButtonTop.setText(R.string.T3_Ans1);
                     mButtonBottom.setText(R.string.T3_Ans2);
                     mStoryIndex = 3;
                     Log.d("destini app", " current index should be 3 " + mStoryIndex);
                 }

                 else if(mStoryIndex == 3)
                 {
                     mButtonTop.setText(R.string.T6_End);
                     mButtonBottom.setVisibility(View.GONE);
                     mStoryIndex = 6;
                 }
                 else if(mStoryIndex == 2)
                 {
                     mStoryText.setText(R.string.T3_Story);
                     mButtonTop.setText(R.string.T3_Ans1);
                     mButtonBottom.setText(R.string.T3_Ans2);
                     mStoryIndex = 3;
                     Log.d("destini app", " current index should be 3 " + mStoryIndex);

                 }
             }
         });





        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("destini app", "bottom button clicked");
                if(mStoryIndex == 1)
                {
                    mStoryText.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                    mStoryIndex = 2;
                    Log.d("destini app", " current index should be 2 " + mStoryIndex);

                }
                else if (mStoryIndex == 3)
                {
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setText(R.string.T5_End);
                    mStoryIndex = 5;

                }
                else if(mStoryIndex == 2)
                {
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setText(R.string.T4_End);
                    mStoryIndex = 4;
                }


            }

        });
    }
}
