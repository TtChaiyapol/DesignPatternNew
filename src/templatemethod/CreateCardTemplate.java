package templatemethod;

public abstract class CreateCardTemplate {

//   template Method
    public final void makeCard(){
        insertData();
        generatorIdCard();
        waitQueue();
        takePhoto();
        printCard();
    }

    public abstract void insertData();
    public abstract void generatorIdCard();

    public void waitQueue(){
        System.out.println("2. Wait for queue");
    };

    public void takePhoto(){
        System.out.println("3. Take photo");
    };

    public abstract void printCard();

}
