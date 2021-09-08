package com.company;

public class EldestDaughter extends Dad implements Printable {
    private int height;

    public EldestDaughter(int age, String name, int height) {
        super(age, name);
        this.height = height;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(height);
    }
}
