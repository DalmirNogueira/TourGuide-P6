package xyz.dnglabs.tourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class ShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Items> items = new ArrayList<Items>();
        items.add(new Items(R.string.shopping_item1, R.string.shopping_addr1, R.drawable.shopping_jk_iguatemi));
        items.add(new Items(R.string.shopping_item2, R.string.shopping_addr2, R.drawable.shopping_patio_higienopolis));

        ItemsAdapter adapter = new ItemsAdapter(this, items, R.color.background_shopping);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }

}
