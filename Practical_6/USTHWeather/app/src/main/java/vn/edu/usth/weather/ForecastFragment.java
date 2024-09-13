package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Main vertical LinearLayout
        LinearLayout mainLayout = new LinearLayout(getContext());
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));

        // Blue forecast area
        LinearLayout forecastArea = new LinearLayout(getContext());
        forecastArea.setOrientation(LinearLayout.VERTICAL);
        forecastArea.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        forecastArea.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
        forecastArea.setPadding(16, 16, 16, 16);

        // Add existing TextView and ImageView to the blue forecast area
        TextView textView = new TextView(getContext());
        textView.setText("Sunday");
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setPadding(0, 0, 0, 8);

        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sunny);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                200, 200));

        forecastArea.addView(textView);
        forecastArea.addView(imageView);

        // Add the blue forecast area to the main layout
        mainLayout.addView(forecastArea);
        return mainLayout;
    }
}
