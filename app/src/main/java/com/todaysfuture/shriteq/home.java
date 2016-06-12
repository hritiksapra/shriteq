package com.todaysfuture.shriteq;

/**
 * Created by rishabh on 25/4/16.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void HomeFunctionAgain(View v)
    {
        switch (v.getId())
        {
            case R.id.button3:
                Intent intent=new Intent(this, events.class);
                startActivity(intent);break;
            case R.id.button4:
                Intent intent1=new Intent(this, contactTeacher.class);
                startActivity(intent1);break;
            case R.id.button5:
                Intent intent3=new Intent(this,attend.class);
                startActivity(intent3);break;
            case R.id.button6:
                Intent intent4=new Intent(this,tasksassigned.class);
                startActivity(intent4);break;
            case R.id.button7:
                Intent intent5=new Intent(this,announcements.class);
                startActivity(intent5);break;
            case R.id.button8:
                Intent intent6=new Intent(this,LiveScore.class);
                startActivity(intent6);break;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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
