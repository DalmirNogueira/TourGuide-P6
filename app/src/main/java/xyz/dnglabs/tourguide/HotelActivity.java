package xyz.dnglabs.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class HotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Items> items = new ArrayList<Items>();
        items.add(new Items(R.string.hotel_item1, R.string.hotel_addr1, R.drawable.melia_jardim_europa));
        items.add(new Items(R.string.hotel_item2, R.string.hotel_addr2, R.drawable.blue__tree_towers));

        ItemsAdapter adapter = new ItemsAdapter(this, items, R.color.background_hotel);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
