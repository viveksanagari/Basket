package com.example.root.diet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    CheckBox c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17, c18, c19, c20, c21, c22;
    DbAdapter dbHelper;
    String[] grolist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        dbHelper=new DbAdapter(this);

        c1=(CheckBox) findViewById(R.id.checkBox);
        c2=(CheckBox) findViewById(R.id.checkBox2);
        c3=(CheckBox) findViewById(R.id.checkBox3);
        c4=(CheckBox) findViewById(R.id.checkBox4);
        c5=(CheckBox) findViewById(R.id.checkBox5);
        c6=(CheckBox) findViewById(R.id.checkBox6);
        c7=(CheckBox) findViewById(R.id.checkBox7);
        c8=(CheckBox) findViewById(R.id.checkBox8);
        c9=(CheckBox) findViewById(R.id.checkBox9);
        c10=(CheckBox) findViewById(R.id.checkBox10);
        c11=(CheckBox) findViewById(R.id.checkBox11);
        c12=(CheckBox) findViewById(R.id.checkBox12);
        c13=(CheckBox) findViewById(R.id.checkBox13);
        c14=(CheckBox) findViewById(R.id.checkBox14);
        c15=(CheckBox) findViewById(R.id.checkBox15);
        c16=(CheckBox) findViewById(R.id.checkBox16);
        c17=(CheckBox) findViewById(R.id.checkBox17);
        c18=(CheckBox) findViewById(R.id.checkBox18);
        c19=(CheckBox) findViewById(R.id.checkBox19);
        c20=(CheckBox) findViewById(R.id.checkBox20);
        c21=(CheckBox) findViewById(R.id.checkBox21);
        c22=(CheckBox) findViewById(R.id.checkBox22);

        grolist=getResources().getStringArray(R.array.Groceries);
        //Toast.makeText(getApplicationContext(), ""+grolist.length, Toast.LENGTH_SHORT).show();
        ArrayList<String> re= dbHelper.reload2(grolist);
        //Toast.makeText(getApplicationContext(), ""+re, Toast.LENGTH_SHORT).show();

        if (re.contains(c1.getText().toString())) {
            c1.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c2.getText().toString())) {
            c2.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c3.getText().toString())) {
            c3.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c4.getText().toString())) {
            c4.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c5.getText().toString())) {
            c5.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c6.getText().toString())) {
            c6.setChecked(true);
            //c6.setEnabled(false);
        }
        if (re.contains(c7.getText().toString())) {
            c7.setChecked(true);
            //c7.setEnabled(false);
        }
        if (re.contains(c8.getText().toString())) {
            c8.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c9.getText().toString())) {
            c9.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c10.getText().toString())) {
            c10.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c11.getText().toString())) {
            c11.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c12.getText().toString())) {
            c12.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c13.getText().toString())) {
            c13.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c14.getText().toString())) {
            c14.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c15.getText().toString())) {
            c15.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c16.getText().toString())) {
            c16.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c17.getText().toString())) {
            c17.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c18.getText().toString())) {
            c18.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c19.getText().toString())) {
            c19.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c20.getText().toString())) {
            c20.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c21.getText().toString())) {
            c21.setChecked(true);
            //c5.setEnabled(false);
        }
        if (re.contains(c22.getText().toString())) {
            c22.setChecked(true);
            //c5.setEnabled(false);
        }


        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c1.getText().toString();
                if(c1.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c2.getText().toString();
                if(c2.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c3.getText().toString();
                if(c3.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c4.getText().toString();
                if(c4.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c5.getText().toString();
                if(c5.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c6.getText().toString();
                if(c6.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });

        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c7.getText().toString();
                if(c7.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c8.getText().toString();
                if(c8.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c9.getText().toString();
                if(c9.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c10.getText().toString();
                if(c10.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c11.getText().toString();
                if(c11.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c12.getText().toString();
                if(c12.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c13.getText().toString();
                if(c13.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c14.getText().toString();
                if(c14.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c15.getText().toString();
                if(c15.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c16.getText().toString();
                if(c16.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });

        c17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c17.getText().toString();
                if(c17.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });

        c18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c18.getText().toString();
                if(c18.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c19.getText().toString();
                if(c19.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c20.getText().toString();
                if(c20.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c21.getText().toString();
                if(c21.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });
        c22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String i=c22.getText().toString();
                if(c22.isChecked()) {
                    dbHelper.insertData(i);
                }
                else{
                    dbHelper.delete(i);
                }
            }
        });


    }
/*
    public void view(View view) {
        String data= dbHelper.getAllData();
        AlertDialog.Builder vBuilder = new AlertDialog.Builder(MainActivity.this);
        vBuilder.setTitle("Required Items");
        vBuilder.setMessage(data);
        vBuilder.show();
    }
*/

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
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
