import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static boolean task1(String s1, String s2){
        return s2.contains(s1);
    }
    public static boolean task3(String userNameString){
        Pattern p = Pattern.compile("^[a-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Task1==========================================
        System.out.println(task1(br.readLine(),br.readLine()));

        //Task2==========================================
        String[] pibAr = br.readLine().split(" ");
        System.out.println(pibAr[0]+" "+pibAr[1].substring(0,1)+"."+pibAr[2].substring(0,1)+".");
        System.out.println(pibAr[1]);
        System.out.println(pibAr[1]+" "+pibAr[2]+" "+pibAr[0]);

        //Task3================================================

        String[] users = {br.readLine(),br.readLine(),br.readLine(),br.readLine(),br.readLine()};
        for (String user: users) {
            System.out.println(task3(user));
        }

    }
}
