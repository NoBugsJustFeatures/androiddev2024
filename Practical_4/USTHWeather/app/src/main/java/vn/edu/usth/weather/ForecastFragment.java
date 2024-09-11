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

        LinearLayout layout = new LinearLayout(getContext());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT));


        TextView textView = new TextView(getContext());
        textView.setText("Sunday");
        textView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        textView.setPadding(16, 16, 16, 16);


        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sunny);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(
                200, 200));
        imageView.setPadding(16, 16, 16, 16);

        layout.addView(textView);
        layout.addView(imageView);

        return layout;
    }
}