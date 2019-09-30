
public enum WeekDayNames {
	MONDAY("��������", "Monday", "Montag"), TUESDAY("�������", "Tuesday", "Dienstag"),
	WEDNESDAY("������", "Wednesday", "Mittwoch"), THURSDAY("������", "Thursday", "Donnerstag"),
	FRIDAY("�'������", "Friday", "Freitag"), SATURDAY("������", "Saturday", "Samstag"),
	SUNDAY("�����", "Monday", "Sonntag");

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
