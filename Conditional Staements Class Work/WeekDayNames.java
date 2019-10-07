
public enum WeekDayNames {
	MONDAY("понед≥лок", "Monday", "Montag"), TUESDAY("в≥второк", "Tuesday", "Dienstag"),
	WEDNESDAY("середа", "Wednesday", "Mittwoch"), THURSDAY("четвер", "Thursday", "Donnerstag"),
	FRIDAY("п'€тниц€", "Friday", "Freitag"), SATURDAY("субота", "Saturday", "Samstag"),
	SUNDAY("нед≥л€", "Monday", "Sonntag");

	private final String UA;
	private final String EN;
	private final String DE;

	WeekDayNames(String UA, String EN, String DE) {
		this.UA = UA;
		this.EN = EN;
		this.DE = DE;
	}

	public String getUA() {
		return UA;
	}

	public String getEN() {
		return EN;
	}

	public String getDE() {
		return DE;
	}

	public String toString() {
		return UA + " " + EN + " " + DE;
	}
}
