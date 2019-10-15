package hw6.task2;

import java.util.*;

public class App {
    public static boolean checkSameName(Map<String, String> someMap) {
        Boolean tmp = false;
        Set<String> valueSet = new HashSet<String>(someMap.values());
        if (valueSet.size() < someMap.size()) {
            return false;
        } else {
            return true;
        }
    }
    public static void removeByValue(Map<String,String> someMap,String str){
        String tmp=new String();
        for (Map.Entry<String, String> entry : someMap.entrySet()) {
            if (entry.getValue().contains(str)) {
                tmp = entry.getKey();
            }
        }
        someMap.remove(tmp);

    }
    public static void main(String[] args) {
        Map<String,String> personMap = new HashMap<String, String>();
        personMap.put("qwewqr","Andrii");
        personMap.put("qwere","Orest");
        personMap.put("qsfadf","Ann");
        personMap.put("sdgf","Andi");
        personMap.put("qwewr","ihor");
        personMap.put("qwwqr","Andrii");
        personMap.put("qewqr","Jake");

        System.out.println(personMap);
        System.out.println(checkSameName(personMap));

        removeByValue(personMap,"Orest");
        System.out.println(personMap);


    }
}
