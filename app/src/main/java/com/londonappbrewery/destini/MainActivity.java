package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.attr.visibility;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;

    private int mState = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
    }

    public void clickTop(View view) {
        if (mState == 1 || mState == 2) {
            mState = 3;
            mStoryTextView.setText(R.string.T3_Story);
            mButtonTop.setText(R.string.T3_Ans1);
            mButtonBottom.setText(R.string.T3_Ans2);
        } else if (mState == 3) {
            mStoryTextView.setText(R.string.T6_End);
            hideButtons();
        }

    }

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

    public void clickBottom(View view) {
        if (mState == 1) {
            mState = 2;
            mStoryTextView.setText(R.string.T2_Story);
            mButtonTop.setText(R.string.T2_Ans1);
            mButtonBottom.setText(R.string.T2_Ans2);
        } else if (mState == 2) {
            mStoryTextView.setText(R.string.T4_End);
            hideButtons();
        } else if (mState == 3) {
            mStoryTextView.setText(R.string.T5_End);
            hideButtons();
        }
    }

    private void hideButtons() {
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
}
