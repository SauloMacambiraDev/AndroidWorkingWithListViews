package com.saulomacambira.section6androidcourse;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView startersCard;
    CardView mainsCard;
    CardView dissertsCard;
    TextView textViewRestaurantEmail;
    Button btnSendMailToRestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        attachingWidgetsToFields();
    }

    private void attachingWidgetsToFields() {
        startersCard = findViewById(R.id.card_view_starters);
        mainsCard = findViewById(R.id.card_view_mains);
        dissertsCard = findViewById(R.id.card_view_disserts);
        textViewRestaurantEmail = findViewById(R.id.text_view_restaurant_email);
        btnSendMailToRestaurant = findViewById(R.id.btn_send_mail_to_restaurant);

        startersCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StarterActivity.class);

                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainCoursesActivity.class));
            }
        });

        dissertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DissertsActivity.class));
            }
        });


        btnSendMailToRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailRestaurant = textViewRestaurantEmail.getText().toString();

                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + emailRestaurant));
                startActivity(intent);
            }
        });

    }
}