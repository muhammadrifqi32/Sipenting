package com.example.lab330_04.sipenting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    //    private CardView calendar,bitcoin;
    GridLayout mainGrid;
    GridLayout mainGrid2;
    GridLayout mainGrid3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        mainGrid2 = (GridLayout) findViewById(R.id.mainGrid2);
        mainGrid3 = (GridLayout) findViewById(R.id.mainGrid3);

        setSingleEvent(mainGrid);
        setSingleEvent2(mainGrid2);
        setSingleEvent3(mainGrid3);
    }

    private void setSingleEvent(GridLayout mainGrid){
        for (int i=0; i<mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI == 0)
                    {
                        Intent intent = new Intent(getApplicationContext(), latar.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
    private void setSingleEvent2(GridLayout mainGrid2){
        for (int i=0; i<mainGrid2.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid2.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI == 0)
                    {
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI == 1)
                    {
                        Intent intent = new Intent(getApplicationContext(), testingdk.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }
    private void setSingleEvent3(GridLayout mainGrid3){
        for (int i=0; i<mainGrid3.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid3.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI == 0)
                    {
                        Intent intent = new Intent(getApplicationContext(), carapakai.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

    @Override
    public void onClick(View view) {

    }
}