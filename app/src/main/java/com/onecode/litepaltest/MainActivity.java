package com.onecode.litepaltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.litepal.LitePal;
import org.litepal.tablemanager.Connector;


public class MainActivity extends AppCompatActivity {
    Album al = new Album();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btcretb = (Button) findViewById(R.id.bt_crtable);
        btcretb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Connector.getDatabase();
            }
        });

        Button btadd = (Button) findViewById(R.id.bt_add);
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.inputs);

                al.setPrice(58f);
                al.setName(et.getText().toString());
                // al.setPrice(99);
                al.save();
            }
        });

        Button btdel = (Button) findViewById(R.id.bt_del);
        btdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.inputs);
                String t = et.getText().toString();
                LitePal.deleteAll(Album.class);
            }
        });
    }
}
