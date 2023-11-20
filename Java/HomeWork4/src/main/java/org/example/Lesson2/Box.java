package org.example.Lesson2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void move(Box<? super T> otherBox) {
        for (T fruit : fruits) {
            otherBox.add(fruit);
        }
        fruits.clear();
    }

    public int getWeight() {
        int weight = 0;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }



    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }

}
