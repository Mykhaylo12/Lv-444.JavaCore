package hw5.task1.nonflyingbird;

public class Penguin extends NonFlyingBird {
    public Penguin(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }
}
