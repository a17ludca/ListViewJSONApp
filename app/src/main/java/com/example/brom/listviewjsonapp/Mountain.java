package com.example.brom.listviewjsonapp;

/**
 * Created by a17ludca on 2018-04-17.
 */

public class Mountain {
    public String name;
    public int height;
    public String location;

    public Mountain(String name, int height, String location) {
        this.name = name;
        this.height = height;
        this.location = location;
    }
    public String getName(){
        return name;
    }
    public int getHeight(){
        return height;
    }
    public String getLocation(){
        return location;
    }


    @Override
    public String toString() {
        return name;
    }
}
