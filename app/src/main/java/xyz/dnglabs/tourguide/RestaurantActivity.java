package xyz.dnglabs.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Items> items = new ArrayList<Items>();
        items.add(new Items(R.string.restaurant_item1, R.string.restaurant_addr1, R.drawable.coco_bambu));
        items.add(new Items(R.string.restaurant_item2, R.string.restaurant_addr2, R.drawable.taste_it_food));

        ItemsAdapter adapter = new ItemsAdapter(this, items, R.color.background_restaurant);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
