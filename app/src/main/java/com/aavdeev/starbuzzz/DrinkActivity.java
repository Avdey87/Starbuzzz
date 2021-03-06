package com.aavdeev.starbuzzz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        //Получить напиток из данных интента
        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
        Drink drink = Drink.drinks[drinkNo];

        //Заполнение изображения
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourcedId());
        photo.setContentDescription(drink.getName());

        //Заполнение названия напитка
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

        //Заполнение описания напитка
        TextView description = (TextView) findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
