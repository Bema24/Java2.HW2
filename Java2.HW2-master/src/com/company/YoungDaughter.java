package com.company;

public class YoungDaughter extends Dad implements Printable{
    private String mobilePhone;

    public YoungDaughter(int age, String name, String mobilePhone) {
        super(age, name);
        this.mobilePhone = mobilePhone;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(mobilePhone);
    }
}
