package com.aavdeev.starbuzzz;


public class Drink {
    private String name;
    private String description;
    private int imageResourcedId;
    // Drinks - массив с элементами Drinks
    public static final Drink[] drinks = {new Drink("Latte", "A coupe of espresso shot with steamed milk",
            R.drawable.latte),
            new Drink("Cappucciono", "Espresso, hot milk, and steamed milk foam", R.drawable.cappuccino),
            new Drink("Filter", "Highset quality beans roasted and brewed fresh", R.drawable.filter)
    };

    //Для каждого напитка храниться имя, описание и ресурс изображения

    private Drink(String name, String description, int imageResourcedId) {
        this.name = name;
        this.description = description;
        this.imageResourcedId = imageResourcedId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourcedId() {
        return imageResourcedId;
    }

    public String toString() {
        return this.name;
    }
}
