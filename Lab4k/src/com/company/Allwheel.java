package com.company;

import java.util.Objects;

public class Allwheel extends Jeep{

    private int cost = 15000;
    private double engineSize = 1.450;
    public Allwheel(String name, int speed){
        super.setName(name);
        super.setSpeed(speed);
    }
    @Override
    public void OutPut() {
        System.out.println(super.getName() + ", current speed = " + super.getSpeed());
        System.out.println("Price = " + cost +"$");
        System.out.println("Engine size: " + engineSize);
        super.getInformation();
    }

    @Override
    public String toString() {
        return super.toString()+ "Chopper{" +
                "cost=" + cost +
                ", engineSize=" + engineSize +
                ", MAX_SPEED=" + MAX_SPEED +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Allwheel chopper = (Allwheel) o;
        return cost == chopper.cost &&
                Double.compare(chopper.engineSize, engineSize) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), cost, engineSize);
    }
}
