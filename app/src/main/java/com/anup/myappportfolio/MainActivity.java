package com.anup.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button button = (Button) findViewById(R.id.button);
        final Button button1 = (Button) findViewById(R.id.button2);
        final Button button2 = (Button) findViewById(R.id.button3);
        final Button button3 = (Button) findViewById(R.id.button4);
        final Button button4 = (Button) findViewById(R.id.button5);
        final Button button5 = (Button) findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null && toast.getView().isShown()) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button.getText().toString() + " app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null && toast.getView().isShown()) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button1.getText().toString() + " app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null && toast.getView().isShown()) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button2.getText().toString() + " app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null && toast.getView().isShown()) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button3.getText().toString() + " app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null && toast.getView().isShown()) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button4.getText().toString() + " app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast!=null && toast.getView().isShown()) {
                    toast.cancel();
                }
                toast = Toast.makeText(getApplicationContext(), "This button will launch my " + button5.getText().toString() + " app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
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
