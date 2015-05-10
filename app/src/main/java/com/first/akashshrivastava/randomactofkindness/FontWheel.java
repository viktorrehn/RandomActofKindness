package com.first.akashshrivastava.randomactofkindness;

import android.graphics.Typeface;

import java.util.Random;

/**
 * Created by akashshrivastava on 15-03-18.
 */
public class FontWheel {

    String[] allTheFonts = {
            "akash.ttf",
            "faris.ttf",
            "Metropolis.otf",
            "aracne.ttf",
            "delicate.ttf",
            "Robotothin.ttf"

    };

    public String getFont(){

        String font = "";

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(allTheFonts.length);

        font = allTheFonts[randomNumber];


        return font;
    }
}
