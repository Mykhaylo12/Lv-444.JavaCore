import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;

//		Print n random numbers on console using Java 8
//		Print n random numbers on console using Java 8 in a sorted order
//		Using Java 8 show the biggest number from n random numbers
//		Show witch today is a day of a week
//		Show a date of first Monday for current month
//		Write a method for sorting list of Strings using Java 8


public class Appl {
	//sort using java 8 
	private static void sortUsingJava8(List<String> names){ 
	Collections.sort(names, (s1, s2) -> s1.compareTo(s2)); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random(); 
		random.ints().limit(4).forEach(System.out::println);
		System.out.println("++++++++++");

		Random random1 = new Random(); 
		random1.ints().limit(4).sorted().forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5); 
		List<String> str = Arrays.asList("B", "B", "K","A","O", "D", "J"); 
		
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics(); 
		System.out.println("Highest number in List : " + stats.getMax());

		//add 1 week to the current date 
		DayOfWeek dayofweek = LocalDate.now().getDayOfWeek();
		
		System.out.println(LocalDate.now()+" "+ dayofweek);
		LocalDate firstMonday = LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.TUESDAY));
	

		System.out.println("First Monday: " + firstMonday);
		
		sortUsingJava8(str);
		System.out.println(str.toString());

	}

}
