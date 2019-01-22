package com.example.jsu2.labassignmentfrancia1b;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;
import java.util.ArrayList;
import java.util.Random;
import java.lang.String;

public class Lab1B extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_b);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lab1_b, menu);
        return true;
    }

    public void getHelpButtonClicked(View v){

        ArrayList<String> sentences = new ArrayList<String>();

        sentences.add("you get knocked out");
        sentences.add("you go somewhere else");
        sentences.add("you find a dead man");
        sentences.add("you find a dead woman");
        sentences.add("you meet a buxom blonde");
        sentences.add("someone has searched the place");
        sentences.add("a crooked cop warns you");
        sentences.add("you are arrested");
        sentences.add("you find a gun");
        sentences.add("you find a knife");
        sentences.add("you find a frayed rope");
        sentences.add("a bullet whizzes past your ear!");
        sentences.add("you are almost run over");
        sentences.add("you are being followed");
        sentences.add("you smell familiar perfume");
        sentences.add("the telephone rings");
        sentences.add("there is a knock at the door");
        sentences.add("you hear footsteps behind you . . .");
        sentences.add("you hear a gunshot");
        sentences.add("you hear a scream!");
        sentences.add("you are not alone . . .");
        sentences.add(". . . forget this story, it stinks!");
        Random rand = new Random();
        TextView t = (TextView) findViewById(R.id.textView2);
        String s = new String();
        //String s = sentences.get(rand.nextInt(sentences.size()));
        int numOfElements = 22;
        for (int i = 0; i < numOfElements; i++){
            int randIndex = rand.nextInt(sentences.size());
            s = sentences.get(randIndex);
            sentences.remove(randIndex);
            if (i == 0)
                i = 22;
        }



        t.setText(s);
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
