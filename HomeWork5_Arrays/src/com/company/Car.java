package com.company;
//Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//certain model year  (enter year in the console);
//ordered by the field year.
public class Car {
    private String type;
    private  int year;
    private int engine;

    public Car(String type, int year, int engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }
}
