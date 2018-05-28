package com.abs.samih.samihphonebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.abs.samih.samihphonebook.data.MyContact;
import com.abs.samih.samihphonebook.data.PhoneAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView lstvPhone;
    private PhoneAdapter phoneAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstvPhone= (ListView) findViewById(R.id.lstvPhone);

        phoneAdapter=new PhoneAdapter(getBaseContext(),R.layout.phone_item);


        //data source sample
        ArrayList<MyContact> myContacts=new ArrayList<>();
        myContacts.add(new MyContact("samih","0546222095"));
        myContacts.add(new MyContact("Ali","05466745"));
        myContacts.add(new MyContact("Donia","050777777"));
        myContacts.add(new MyContact("Aleeen","05077777"));
        myContacts.add(new MyContact("Bayan","054686123"));

        //connect all
        phoneAdapter.addAll(myContacts);
        lstvPhone.setAdapter(phoneAdapter);




    }
}
