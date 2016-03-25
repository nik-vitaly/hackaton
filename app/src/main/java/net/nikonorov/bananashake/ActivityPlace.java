package net.nikonorov.bananashake;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.nikonorov.bananashake.utils.AmazingPicture;

/**
 * Created by vitaly on 25.03.16.
 */
public class ActivityPlace extends AppCompatActivity {

    private City city = null;
    private AmazingPicture photo;
    private TextView cityName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_place);

        photo = (AmazingPicture) findViewById(R.id.city_image);
        cityName = (TextView) findViewById(R.id.city_name);


        Button vrBtn = (Button) findViewById(R.id.vr_btn);

        vrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityPlace.this, ActivityVR.class));
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        city = ((App) getApplication()).cities.get(Values.city);

        Drawable drawable = getResources().getDrawable(getResources()
                .getIdentifier(city.photo, "drawable", getPackageName()));
        photo.setImageDrawable(drawable);

        cityName.setText(city.name);

    }
}