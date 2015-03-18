package com.example.pam_43.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class HelloActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Button leftButton  = (Button) findViewById(R.id.button_left);
        Button rightButton = (Button) findViewById(R.id.button_right);
        final TextView state = (TextView) findViewById(R.id.textView_state);

        String lastClicked = new String();

        leftButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                state.setText("LEFT");
            }
        });

        rightButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                state.setText("RIGHT");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
