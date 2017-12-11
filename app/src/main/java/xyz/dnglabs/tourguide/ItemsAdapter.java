package xyz.dnglabs.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Items> {

    private int mColor;

    public ItemsAdapter(Context context, ArrayList<Items> words, int colorItems) {
        super(context, 0, words);
        mColor = colorItems;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Items currentItem = getItem(position);
        TextView itemNameView = (TextView) listItemView.findViewById(R.id.item_name);
        itemNameView.setText(currentItem.getitemName());
        TextView itemAddrView = (TextView) listItemView.findViewById(R.id.item_addr);
        itemAddrView.setText(currentItem.getitemAddr());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);
        imageView.setImageResource(currentItem.getitemImg());
        imageView.setVisibility(View.VISIBLE);
        LinearLayout textContainer = listItemView.findViewById(R.id.allItem);
        int Color = ContextCompat.getColor(getContext(), mColor);
        textContainer.setBackgroundColor(Color);
        return listItemView;
    }

}
