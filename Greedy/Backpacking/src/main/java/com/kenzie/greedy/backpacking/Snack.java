package com.kenzie.greedy.backpacking;

/**
 * Class that describes a Snack.
 */
public class Snack {

    private String name;
    private int weight;

    public Snack(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
