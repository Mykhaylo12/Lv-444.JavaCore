package pt6.t1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void checkPositionAndAdd(int i, List lst, int num){
            if (lst.size()>=i ? true : false){
                lst.add(i,new Integer(num));
            }
    }
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<Integer>();
        List<Integer> newCollection = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(new Integer((int) (Math.random()*25)));
        }
        System.out.println(myCollection);

        for (Integer i: myCollection) {
            if (i>5){
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);
        System.out.println(myCollection);
        for (int i =0; i <myCollection.size();i++) {
            if (myCollection.get(i)>20){
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println(myCollection);
        Integer n;
        Iterator<Integer> it = myCollection.iterator();
        while (it.hasNext()) {
            n = it.next();
            if (n >10){
                it.remove();
            }
        }


        checkPositionAndAdd(2,myCollection,1);
        checkPositionAndAdd(8,myCollection,-3);
        checkPositionAndAdd(5,myCollection,-4);
        System.out.println(myCollection);

        myCollection.sort(Integer::compareTo);
        System.out.println(myCollection);

    }
}
