//Android Developer Training Session 5 - Assignment 5.2

//You need to create option menu having three options programmatically
//and show toast on selection of particular option.


package com.example.sandeep.custommenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Variables for setting id of the menu items

    private static final int Computer = 0;
    private static final int Gamepad = 1;
    private static final int Camera = 2;
    private static final int Video = 3;
    private static final int Email = 4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // For adding each item into menu

        MenuItem item1 = menu.add(Menu.NONE, Computer, Menu.NONE, "Computer");
        MenuItem item2 = menu.add(Menu.NONE, Gamepad, Menu.NONE, "Gamepad");
        MenuItem item3 = menu.add(Menu.NONE, Camera, Menu.NONE, "Camera");
        MenuItem item4 = menu.add(Menu.NONE, Video, Menu.NONE, "Video");
        MenuItem item5 = menu.add(Menu.NONE, Email, Menu.NONE, "Email");

        // For menu item visibility

        item1.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        item2.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        item3.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        item4.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
        item5.setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // For the toast message after clicking menu items

        switch (item.getItemId()) {

            case Computer:
                Toast.makeText(this, "Computer", Toast.LENGTH_SHORT).show();
                break;

            case Gamepad:
                Toast.makeText(this, "Gamepad", Toast.LENGTH_SHORT).show();
                break;

            case Camera:
                Toast.makeText(this, "Camera", Toast.LENGTH_SHORT).show();
                break;

            case Video:
                Toast.makeText(this, "Video", Toast.LENGTH_SHORT).show();
                break;

            case Email:
                Toast.makeText(this, "Email", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
