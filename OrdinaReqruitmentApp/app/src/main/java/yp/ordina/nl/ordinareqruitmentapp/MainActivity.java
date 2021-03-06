package yp.ordina.nl.ordinareqruitmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    //Deze hele methode kan waarschijnlijk weg omdat we de settings button niet gebruiken en waarschijnlijk ook geen andere buttons
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        //Settings in xml files uit gecomment
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }

    public void startWaaromOrdinaActivity(View view){
        Intent intent = new Intent(this, WaaromOrdinaActivity.class);
        startActivity(intent);
    }
    public void startWatDoetOrdinaActivity(View view){
        Intent intent = new Intent(this, WatDoetOrdinaActivity.class);
        startActivity(intent);
    }

    public void startYoungProfessionalProgramma(View view){
        Intent intent = new Intent(this, YoungProfessionalProgramma.class);
        startActivity(intent);
    }
}

