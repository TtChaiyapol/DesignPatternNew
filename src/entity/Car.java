package entity;

public class Car {
    private static Car instance;
    public static Car getInstance() {
        if(instance == null){
            instance = new Car();
        }
        return instance;
    }
    private Car() {
        this.brand = "Toyota";
        this.wheel = 4;
        this.color = "White";
    }
    private String brand;
    private Integer wheel;
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }
}
