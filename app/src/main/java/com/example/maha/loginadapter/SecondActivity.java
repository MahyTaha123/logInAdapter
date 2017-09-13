package com.example.maha.loginadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    TextView textView2;
    EditText note;
    Button add;
    ListView list;
    ArrayList<String> data;
    ArrayAdapter<String> adapter;

    Button pinding;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        pinding = (Button) findViewById(R.id.pinding);
        checkBox = (CheckBox) findViewById(R.id.checkBox);


        textView2 = (TextView) findViewById(R.id.textView2);

        String name = (String) getIntent().getExtras().get("UserName");
        textView2.setText(name);


        initViews();
        setData();
        adapter = new ArrayAdapter<String>(this, R.layout.item_view, data);
        list.setAdapter(adapter);
        pinding.setText("Done");
        checkBox.setChecked(true);



    }


    public void initViews() {
        note = (EditText) findViewById(R.id.note);
        add = (Button) findViewById(R.id.add);
        list = (ListView) findViewById(R.id.list);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String notee = note.getText().toString();
                if (notee != null) {

                    data.add(notee);
                    note.setText("");
                    adapter.notifyDataSetChanged();

                }
            }
        });


    }


    public void setData() {

        data = new ArrayList<String>();
        data.add("zzzzz");
        data.add("maha");
        data.add("zzzzz");
        data.add("maha");
        data.add("zzzzz");
        data.add("maha");
        data.add("zzzzz");
        data.add("maha");
        data.add("zzzzz");
        data.add("maha");

    }
}
