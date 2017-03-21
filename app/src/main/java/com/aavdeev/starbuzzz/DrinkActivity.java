package com.aavdeev.starbuzzz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";
    int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
    Drink drink = Drink.drinks[drinkNo];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
    }
}
