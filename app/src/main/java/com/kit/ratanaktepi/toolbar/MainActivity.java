package com.kit.ratanaktepi.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.mikepenz.iconics.context.IconicsLayoutInflater;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button reusing, styling, custom, translucent, react;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        LayoutInflaterCompat.setFactory(getLayoutInflater(), new IconicsLayoutInflater(getDelegate()));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Find Toolbar by id*/
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(0xFFFFFFFF);
        // Sets the Toolbar to act as the ActionBar for this Activity window.
        // Make sure the toolbar exists in the activity and is not null
        setSupportActionBar(toolbar);

        reusing = (Button) findViewById(R.id.reuse);
        styling = (Button) findViewById(R.id.styling);
        custom = (Button) findViewById(R.id.custom);
        translucent = (Button) findViewById(R.id.translucent);
        react = (Button) findViewById(R.id.react);

        reusing.setOnClickListener(this);
        styling.setOnClickListener(this);
        custom.setOnClickListener(this);
        translucent.setOnClickListener(this);
        react.setOnClickListener(this);

    }

    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {

        if ( v == reusing) {
            Intent a = new Intent(MainActivity.this, Reusing.class);
            startActivity(a);
        }
        else if ( v == styling) {
            Intent b = new Intent(MainActivity.this, Styling.class);
            startActivity(b);
        }
        else if ( v == custom){
            Intent c = new Intent(MainActivity.this, Custom.class);
            startActivity(c);
        }
        else if (v == translucent){
            Intent d = new Intent(MainActivity.this, Translucent.class);
            startActivity(d);
        }
        else if ( v == react ) {
            Intent e = new Intent(MainActivity.this, React.class);
            startActivity(e);
        }

    }
}
