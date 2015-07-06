package com.example.iamuser773.iamlistview;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.zip.Inflater;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button addNow = (Button) findViewById(R.id.add_bt);
        addNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addMessage();
            }
        });

    }
public void addMessage(){
    AlertDialog.Builder addMessage = new AlertDialog.Builder(this);
    addMessage.setTitle("Say hi");
    View v = getLayoutInflater().inflate(R.layout.dialog_layout,null);
    addMessage.setView(v);
    addMessage.setNegativeButton("OK",null);
    addMessage.create();
    addMessage.show();
}




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
