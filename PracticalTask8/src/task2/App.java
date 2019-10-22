package task2;

public class App {
    public static void main(String[] args)  {
        Plant[] plants = new Plant[0];
        try {
            plants = new Plant[]{new Plant(3, "yellow", "orchid"),
                    new Plant(3, "black", "lily"),
                    new Plant(3, "white", "orch45d"),
                    new Plant(3, "orange", "orchid"),
                    new Plant(3, "red", "pansy")};
        } catch (ColorException e) {
            e.printStackTrace();
        } catch (TypeException e) {
            e.printStackTrace();
        }
        for (Plant plant:plants) {
            System.out.println(plant);
        }
    }
}
