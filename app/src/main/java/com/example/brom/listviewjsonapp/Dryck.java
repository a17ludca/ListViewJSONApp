package com.example.brom.listviewjsonapp;

/**
 * Created by zhend on 2018-05-09.
 */

public class Dryck extends MainActivity {
    public String name;
    public String company;
    public String location;
    public int size;
    public int cost;
    public String auxdata;

    public Dryck(String name, String company, String location, int size, int cost, String auxdata) {
        this.name = name;
        this.company = company;
        this.location = location;
        this.size = size;
        this.cost = cost;
        this.auxdata = auxdata;
    }
    public String getName(){
        return name;
    }
    public String getCompany(){
        return company;
    }
    public String getLocation(){
        return location;
    }
    public int getSize(){
        return size;
    }
    public int getCost(){
        return cost;
    }
    public String getAuxdata(){
        return auxdata;
    }
    public String toastText(){
        return name + " is a part of the " + location;
    }

    @Override
    public String toString() {
        return name;
    }
}
