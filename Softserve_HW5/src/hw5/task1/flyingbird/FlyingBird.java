package hw5.task1.flyingbird;

import hw5.task1.Bird;

public class FlyingBird extends Bird {
    @Override
    public void fly(){
        System.out.println("I can fly");
    };

    public FlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

}
