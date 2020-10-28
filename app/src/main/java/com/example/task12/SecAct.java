package com.example.task12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

public class SecAct extends AppCompatActivity {
    LinearLayout lL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        lL=(LinearLayout)findViewById(R.id.lL);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,400,"Yellow");
        menu.add(0,0,500,"Back to Act");
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        String choice=item.getTitle().toString();
        if(choice.equals("Blue"))
            lL.setBackgroundColor(Color.BLUE);
        if(choice.equals("Red"))
            lL.setBackgroundColor(Color.RED);
        if(choice.equals("Green"))
            lL.setBackgroundColor(Color.GREEN);
        if(choice.equals("Yellow"))
            lL.setBackgroundColor(Color.YELLOW);
        if(choice.equals("Back to Act"))
            finish();
        return true;
    }

}