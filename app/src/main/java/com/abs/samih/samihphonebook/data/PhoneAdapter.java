package com.abs.samih.samihphonebook.data;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.abs.samih.samihphonebook.R;

/**
 * Created by user on 5/27/2018.
 */

public class PhoneAdapter extends ArrayAdapter<MyContact>
{

    public PhoneAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    /**
     * connect data to view item and return it
     * @param position data item number (index)
     * @param convertView the view item to return
     * @param parent the view items container
     * @return view item
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        //1. to build view item from xml layout
        View view = LayoutInflater.from(getContext()).inflate(R.layout.phone_item,parent,false);
        //2. get reference for views at the layout
        TextView tvName=view.findViewById(R.id.itmtvName);
        TextView tvPhone=view.findViewById(R.id.itmtvPhone);

        //3.  get the data item
        MyContact m=getItem(position);

        //4. update the view items by the data object
        tvName.setText(m.getName());
        tvPhone.setText(m.getPhone());
        //5. return the view
        return view;
    }
}
