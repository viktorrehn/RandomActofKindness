package com.first.akashshrivastava.randomactofkindness;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


public class RandomActMainActivity extends ActionBarActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorwheel = new ColorWheel();

    private FontWheel mFontwheel = new FontWheel();


    TextView ActString;
    LinearLayout first_layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_act_main);

        //Declaring the View Variables!


        ActString = (TextView)findViewById(R.id.Act_string);
        first_layout = (LinearLayout)findViewById(R.id.primary_layout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String junk = mFactBook.getFact();

                //This updates the string
                ActString.setText(junk);

                int color = mColorwheel.getColor();

                first_layout.setBackgroundColor(color);


            }

        };
        //This connects the OnClickListener to the layout that is being clicked on!
        first_layout.setOnClickListener(listener);

    }


        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_random_act_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
