package CreateCard;

import java.util.Random;

public class CreateEmployeeCardOld {

    int random = (int) (Math.random() * 10000);
    String idCard;
    public void insertData(){
        System.out.println("1. Insert Employee Card Data Name: สมชาย ใจดี");
    }
    public void generatorIdCard(){
        System.out.println("2. Generate ID Card ID: "+random);
    }

    public void waitQueue(){
        System.out.println("2. Wait for queue");
    };

    public void takePhoto(){
        System.out.println("3. Take photo");
    };

    public void printCard(){
        System.out.println("""
                5. Print Employee Card
                Name: สมชาย
                SurName: ใจดี
                ID:""" + random);
    }

    public final void makeCard(){
        insertData();
        generatorIdCard();
        waitQueue();
        takePhoto();
        printCard();
    }
}
