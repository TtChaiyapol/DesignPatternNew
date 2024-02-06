package entity.DuckType;

import entity.FlyBehavior.FlyNoWay;
import entity.QuackBehavior.MuteQuack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
