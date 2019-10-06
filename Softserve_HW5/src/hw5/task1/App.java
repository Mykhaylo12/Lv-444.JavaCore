package hw5.task1;

import hw5.task1.flyingbird.Eagle;
import hw5.task1.flyingbird.Swallow;
import hw5.task1.nonflyingbird.Kiwi;
import hw5.task1.nonflyingbird.Penguin;

public class App {
    public static void main(String[] args) {
        Bird[] birds= {new Eagle("+++", "---"),new Swallow("+++","+++"),
        new Penguin("---","+++"), new Kiwi("---","---")};
        for (Bird bird:birds) {
            bird.fly();
            System.out.println(bird);
        }
    }
}
