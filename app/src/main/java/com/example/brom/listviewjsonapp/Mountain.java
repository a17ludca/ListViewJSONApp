package com.example.brom.listviewjsonapp;

/**
 * Created by a17ludca on 2018-04-17.
 */

public class Mountain {
    public String name;
    public int height;
    public String location;
    public String url;

    public Mountain(String name, int height, String location, String url) {
        this.name = name;
        this.height = height;
        this.location = location;
        this.url = url;
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
    public String getImage(){
        return url;
    }
    public String infoText(){
        return name + "is in the" + location + "and is" + height + "m high.";
    }

}
