package com.company;

public class Main {

    public static void main(String[] args) {
        Dad[] arrayDad = {createObject("EldestDaughter"), createObject("Daughter"), createObject("YoungerDaughter")};
        for (Dad a : arrayDad) {
            a.print();

        }

    }

    public static Dad createObject(String className) {
        switch (className) {
            case "Eldest_Son":
                EldestDaughter kate = new EldestDaughter(20, "Kate", 187);
                return kate;
            case "Daughter":
                Daughter diana = new Daughter(16, "Diana", "Dancing");
                return diana;
            case "Younger_Son":
                YoungDaughter anna = new YoungDaughter(10, "Anna", "iphone");
                return anna;
        }
        return null;
    }
}

