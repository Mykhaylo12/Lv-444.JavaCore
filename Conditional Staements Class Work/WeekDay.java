import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WeekDay {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of the day of the week");
		int day = Integer.parseInt(br.readLine());

		System.out.println(getWeekDayName(day));

	}

	public static String getWeekDayName(int day) {
		String WeekDayName = "";
		switch (day) {
		case 1:
			WeekDayName = String.valueOf(WeekDayNames.MONDAY);
			break;
		case 2:
			WeekDayName = String.valueOf(WeekDayNames.TUESDAY);
			break;
		case 3:
			WeekDayName = String.valueOf(WeekDayNames.WEDNESDAY);
			break;
		case 4:
			WeekDayName = String.valueOf(WeekDayNames.THURSDAY);
			break;
		case 5:
			WeekDayName = String.valueOf(WeekDayNames.FRIDAY);
			break;
		case 6:
			WeekDayName = String.valueOf(WeekDayNames.SATURDAY);
			break;
		case 7:
			WeekDayName = String.valueOf(WeekDayNames.FRIDAY);
			break;
		default:
			WeekDayName = "Invalid day number";
		}

		return WeekDayName;
	}
}
