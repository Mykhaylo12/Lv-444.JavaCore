package pt6.t2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void findById(Integer id, Map map){
        if (map.containsKey(id)){
            System.out.println(map.get(id));
        }
        else {
            System.out.println("No Id: "+id);
        }
    }

    public static void findByName(String name, Map<Integer, String> map){
        if (map.containsValue(name)){
            for (Map.Entry<Integer,String> entry: map.entrySet()) {
                if (entry.getValue().equalsIgnoreCase(name)){
                    System.out.println(name + " with Id: " + entry.getKey());
            }
        }
        }
        else {
            System.out.println("No name: "+name);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1,"Vasia");
        employeeMap.put(2,"Vania");
        employeeMap.put(3,"Valia");
        employeeMap.put(4,"Ann");
        employeeMap.put(5,"Andrii");
        employeeMap.put(6,"Oleg");
        employeeMap.put(7,"Viktor");
        System.out.println(employeeMap);


        findById(Integer.parseInt(br.readLine()), employeeMap);
        findByName(br.readLine(), employeeMap);
    }
}
