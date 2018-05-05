package com.company;

public class Main {

    public static void main(String[] args) {
        Tricycle tricycle = new Tricycle("Roadster", 250);
        tricycle.OutPut();
        Allwheel allwheel = new Allwheel("Allwheel", 180);
        allwheel.OutPut();
        Tricycle tricycle1 = new Tricycle("Tricycle1", 550);
        Allwheel allwheel1 = new Allwheel("Allwheel", 300);

        System.out.println(allwheel.toString());
        System.out.println(tricycle.toString());

        System.out.println(tricycle.equals(tricycle1));
        System.out.println(allwheel.equals(allwheel1));

        System.out.println(allwheel.hashCode());
        System.out.println(allwheel1.hashCode());

        System.out.println(tricycle.hashCode());
        System.out.println(tricycle1.hashCode());
    }

}
