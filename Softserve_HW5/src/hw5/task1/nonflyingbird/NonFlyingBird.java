package hw5.task1.nonflyingbird;

import hw5.task1.Bird;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
