package entity.DuckType;

import entity.FlyBehavior.FlyNoWay;
import entity.QuackBehavior.Quack;

public class RedDuck extends Duck {
    public RedDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a red duck");
    }

}
