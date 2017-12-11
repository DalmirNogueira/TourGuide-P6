package xyz.dnglabs.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class TheaterActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Items> items = new ArrayList<Items>();
        items.add(new Items(R.string.theater_item1, R.string.theater_addr1, R.drawable.teatro_renault));
        items.add(new Items(R.string.theater_item2, R.string.theater_addr2, R.drawable.theatro_municipal));

        ItemsAdapter adapter = new ItemsAdapter(this, items, R.color.background_theater);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
