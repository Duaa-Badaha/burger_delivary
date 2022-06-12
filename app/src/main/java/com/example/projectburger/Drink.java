package com.example.projectburger;

public class Drink {
    private String name;
    private int imageID;

    public static final Drink[] drinks = {
            new Drink("CocaCola Can && price=120", R.drawable.cola),
            new Drink("Sprite Can && price=220", R.drawable.sprite),
            new Drink("Orange Juice && price=80", R.drawable.juice),
            new Drink("Fanta Can && price=100", R.drawable.fanta),
//            new Burger("mini Burger && price=70", R.drawable.mini),
//            new Burger("mix meat and chicken Burger && price=150", R.drawable.mixmeat),
//            new Burger("Perfect Lamb Satay Burger && price=220", R.drawable.perfectlamb),
//            new Burger("Red Robin River Burger && price=90", R.drawable.children),
//            new Burger("Stuffed Bean Burger && price=144", R.drawable.perfectlamb),
//            new Burger("Perfect Lamb Satay Burger && price=220", R.drawable.chees),
//            new Burger("White Castle Slider Burger && price=400", R.drawable.mini),


    };
    private Drink(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}


}
