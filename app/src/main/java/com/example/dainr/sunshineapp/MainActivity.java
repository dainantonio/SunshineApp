package com.example.dainr.sunshineapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare a TextView variable called mWeatherListTextView
    private TextView mWeatherListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        /*
         * Using findViewById, we get a reference to our TextView from xml. This allows us to
         * do things like set the text of the TextView.
         */
        mWeatherListTextView = findViewById(R.id.tv_weather_data);

        /*Use the static ToyBox.getToyNames method and store the names in a String array
        /*
         * This String array contains names of classic toys. After all, these are toy apps. We
         * wanted to create a way to break concepts down into smaller pieces that we thought might
         * be a little easier to understand. In each lesson, we'll demonstrate new concepts using a
         * toy app (no, sadly every one won't have ACTUAL toys in it) and then we'll guide you
         * through adding the functionality that you've just learned by having you use those
         * concepts in Sunshine! Let us know what you think! We're really excited to have you
         * taking this course.
         */
        String[] dummyWeatherData = {
                "Today, May 17 - Clear - 17°C / 15°C",
                "Tomorrow - Cloudy - 19°C / 15°C",
                "Thursday - Rainy- 30°C / 11°C",
                "Friday - Thunderstorms - 21°C / 9°C",
                "Saturday - Thunderstorms - 16°C / 7°C",
                "Sunday - Rainy - 16°C / 8°C",
                "Monday - Partly Cloudy - 15°C / 10°C",
                "Tue, May 24 - Meatballs - 16°C / 18°C",
                "Wed, May 25 - Cloudy - 19°C / 15°C",
                "Thu, May 26 - Stormy - 30°C / 11°C",
                "Fri, May 27 - Hurricane - 21°C / 9°C",
                "Sat, May 28 - Meteors - 16°C / 7°C",
                "Sun, May 29 - Apocalypse - 16°C / 8°C",
                "Mon, May 30 - Post Apocalypse - 15°C / 10°C",
        };


        //The difference between setText and append is that setText overwrites what was in the TextView,
        // while append simply adds text onto whatever text was already there.

        // COMPLETED (5) Loop through each toy and append the name to the TextView (add \n for spacing)
        /*
         * Iterate through the array and append the Strings to the TextView. The reason why we add
         * the "\n\n\n" after the String is to give visual separation between each String in the
         * TextView. Later, we'll learn about a better way to display lists of data.
         */
        for (String dummyWeatherDay : dummyWeatherData) {
            mWeatherListTextView.append(dummyWeatherDay + "\n\n\n");
        }
    }

}
