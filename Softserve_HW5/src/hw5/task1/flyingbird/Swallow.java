package hw5.task1.flyingbird;

public class Swallow extends FlyingBird {
    public Swallow(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Swallow{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }
}
