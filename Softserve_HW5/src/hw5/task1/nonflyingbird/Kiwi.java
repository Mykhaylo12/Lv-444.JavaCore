package hw5.task1.nonflyingbird;

public class Kiwi extends NonFlyingBird {
    public Kiwi(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString() {
        return "Kiwi{" +
                "feathers='" + feathers + '\'' +
                ", layEggs='" + layEggs + '\'' +
                '}';
    }
}
