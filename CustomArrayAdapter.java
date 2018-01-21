package ke.co.microhub.e_data;

/**
 * Created by davis eng on 2016-07-06.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomArrayAdapter extends ArrayAdapter<String>

{
    private  Context context;
    private  ArrayList<String> values;

    public CustomArrayAdapter(Context context, ArrayList<String> values)
    {
        super(context, R.layout.list_view_item, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_view_item, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.item_title);
        textView.setText(values.get(position));
        return rowView;
    }

}