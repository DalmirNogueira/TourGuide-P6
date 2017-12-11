package xyz.dnglabs.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout hotel = (RelativeLayout) findViewById(R.id.hotel);
        RelativeLayout restaurant = (RelativeLayout) findViewById(R.id.restaurant);
        RelativeLayout shopping = (RelativeLayout) findViewById(R.id.shopping);
        RelativeLayout theater = (RelativeLayout) findViewById(R.id.theater);

        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelIntent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(hotelIntent);
            }
        });

        restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(restaurantIntent);
            }
        });

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);
                startActivity(shoppingIntent);
            }
        });

        theater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent theaterIntent = new Intent(MainActivity.this, TheaterActivity.class);
                startActivity(theaterIntent);
            }
        });
    }
}
