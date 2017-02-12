package com.example.home.beeradvicer;


import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands (String color)
    {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("light")) {
            brands.add("Molson Canadian");
            brands.add("Kirin");
        }else if (color.equals("brown")) {
            brands.add("Founders Sumatra Mountain");
            brands.add("Coffee Okie");
        }else {
            brands.add("Guinness");
            brands.add("Belhaven");
        }
        return  brands;
    }
}
