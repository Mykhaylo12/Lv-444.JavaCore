package hw6.task1;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static Set union(Set set1, Set set2){
        Set tmp = new HashSet();
        for (Object i: set1) {
            tmp.add(i);
        }
        for (Object i: set2) {
            tmp.add(i);
        }
        return tmp;
    }

    public static Set intersect(Set set1, Set set2){
        Set tmp = new HashSet();
        for (Object i: set2) {
            if (set1.contains(i)){
                tmp.add(i);
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Set set1 = new HashSet<Integer>();
        Set set2 = new HashSet<Integer>();
        for (int i = 0; i < 10; i++) {
            set1.add(i);
        }
        for (int i = 0; i < 10; i++) {
            set2.add(i + 5);
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));
    }
}
