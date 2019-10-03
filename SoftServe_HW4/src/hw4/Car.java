package hw4;

public class Car {
    private int year;
    private String type;
    private double engine_capacity;

    public Car() {
    }

    public Car(int year, String type, double engine_capacity) {
        this.year = year;
        this.type = type;
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", type='" + type + '\'' +
                ", engine_capacity=" + engine_capacity +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }
}
