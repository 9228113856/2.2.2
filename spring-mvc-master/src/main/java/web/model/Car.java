package web.model;

public class Car {


    private String model;

    public String getModel() {
        return model;
    }
    private String color;

    public String getColor() {
        return color;
    }

    private String year;

    public String getYear() {
        return year;
    }

    public Car(String model, String color, String year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
}
