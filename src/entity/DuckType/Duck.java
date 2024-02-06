package entity.DuckType;

import entity.FlyBehavior.FlyBehavior;
import entity.QuackBehavior.QuackBehavior;

public abstract class Duck {

    private int cost = 120;
     FlyBehavior flyBehavior;
     QuackBehavior quackBehavior;
    public abstract void display();
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
    public void perfromQuack(){
        quackBehavior.quack();
    }
    public void perfromFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }


}
