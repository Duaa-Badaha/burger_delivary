package com.example.projectburger;

public class Burger {

    private String name;
    private int imageID;

    public static final Burger[] burgers = {
            new Burger("Burger with cheese && price=120", R.drawable.a2),
            new Burger("Perfect Lamb Satay Burger && price=220", R.drawable.a2),
            new Burger("Burger for children && price=80", R.drawable.a2),
            new Burger("Lentiland Mushroom Burger && price=100", R.drawable.a2),
//            new Burger("mini Burger && price=70", R.drawable.mini),
//            new Burger("mix meat and chicken Burger && price=150", R.drawable.mixmeat),
//            new Burger("Perfect Lamb Satay Burger && price=220", R.drawable.perfectlamb),
//            new Burger("Red Robin River Burger && price=90", R.drawable.children),
//            new Burger("Stuffed Bean Burger && price=144", R.drawable.perfectlamb),
//            new Burger("Perfect Lamb Satay Burger && price=220", R.drawable.chees),
//            new Burger("White Castle Slider Burger && price=400", R.drawable.mini),


    };
    private Burger(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}

}

