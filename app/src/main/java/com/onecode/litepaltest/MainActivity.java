package com.onecode.litepaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import org.litepal.tablemanager.Connector;


public class MainActivity extends AppCompatActivity {

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
                Album al = new Album();
                al.setName(et.getText().toString());
                // al.setPrice(99);
                al.save();
            }
        });
    }
}
