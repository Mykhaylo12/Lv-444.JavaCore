package hw5.task1.flyingbird;

public class Eagle extends FlyingBird {
    public Eagle(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }
}
