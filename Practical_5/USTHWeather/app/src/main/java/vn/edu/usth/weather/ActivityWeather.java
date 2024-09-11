package vn.edu.usth.weather;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityWeather extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate called");

        ForecastFragment forecastFragment = new ForecastFragment();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, forecastFragment)
                .commit();
    }

}