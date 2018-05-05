package com.company;

public class Tricycle extends Jeep{
    private int cost = 12000;
    private String motorsName = "Motor 2000";
    public Tricycle(String name, int speed){
        super.setName(name);
        super.setSpeed(speed);
    }
    @Override
    public void OutPut() {
        System.out.println(super.getName() + ", current speed = " + super.getSpeed());
        System.out.println("Price = " + cost +"$");
        System.out.println("Motor's name: " + motorsName);
        super.getInformation();
    }
}
