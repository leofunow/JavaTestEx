package com.number5;

import java.util.ArrayList;

public class Safe {
    private int capacity;
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private ArrayList<Thing> tempThings;

    public Safe(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void fillThings(ArrayList<Thing> things) {
        this.tempThings = things;
        System.out.println("Ценность набора: " + fillOneThing(capacity));
    }

    public void print() {
        for (Thing thing : things) {
            System.out.println("Вместимость: " + thing.getVolume() + ", Цена: " + thing.getPrice());
        }
    }

    protected int fillOneThing(int capacity) {
        if (capacity == 0)
            return 0;
        else {
            int max = 0, maxIndex = 0;
            for (int i = 0; i < tempThings.size(); i++) {
                if (tempThings.get(i).getVolume() <= capacity) {
                    int fillValue = tempThings.get(i).getPrice() + fillOneThing(capacity - tempThings.get(i).getVolume());
                    if (max <= fillValue) {
                        max = fillValue;
                        maxIndex = i;
                    }
                }
            }
            things.add(tempThings.get(maxIndex));
            return max;
        }
    }

}
