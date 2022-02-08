package com.number5;

import java.util.ArrayList;

public class Container {
    protected int capacity;
    protected ArrayList<Thing> things = new ArrayList<Thing>();
    protected int price;

    public Container(int capacity, ArrayList<Thing> things, int price) {
        this.capacity = capacity;
        this.things = things;
        this.price = price;
    }

    public Container(int capacity) {
        this.capacity = capacity;
    }

    public Container() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    public void setThings(ArrayList<Thing> things) {
        this.things = things;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
