package com.example.homdashbord2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Instanciation of variables
    private CardView cardBanking;
    private CardView cardIdeas;
    private CardView cardAdd;
    private CardView cardLinks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Link the xml with java by using id

        cardBanking = (CardView)findViewById( R.id.card_banking );
        cardIdeas = (CardView)findViewById( R.id.card_ideas );
        cardAdd = (CardView)findViewById( R.id.card_add );
        cardLinks = (CardView)findViewById( R.id.card_links );

        //set the click on cards
        /*cardBanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/

        //Add clicklistener to the cards
        cardBanking.setOnClickListener(this);
        cardIdeas.setOnClickListener(this);
        cardAdd.setOnClickListener(this);
        cardLinks.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        Intent i;
        switch (view.getId()){
            case R.id.card_banking : i = new Intent(this, Bank.class); startActivity(i); break;
            case R.id.card_ideas : i = new Intent(this, Ideas.class);startActivity(i); break;
            case R.id.card_add : i = new Intent(this, Add.class);startActivity(i); break;
            case R.id.card_links : i = new Intent(this, Links.class);startActivity(i); break;
            default:break;
        }
    }
}
