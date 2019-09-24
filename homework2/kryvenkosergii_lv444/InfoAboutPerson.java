package homework3.kryvenkosergii_lv444;

public class InfoAboutPerson {

	public static void main(String[] args) {
		Person pers1 = new Person("Vasya", "Pupkin");
		pers1.setBirthYear(1980);
		pers1.input("friendly and sociable man");
		System.out.println(pers1.output());

		Person pers2 = new Person("Ivan", "Durak");
		pers2.setBirthYear(1982);
		pers2.input("shy and unsociable man");
		System.out.println(pers2.output());

		Person pers3 = new Person("Igor", "Rak");
		pers3.setBirthYear(1985);
		pers3.input("intelligent and hardworking man");
		System.out.println(pers3.output());

		Person pers4 = new Person("Mark", "Rid");
		pers4.setBirthYear(1995);
		pers4.input("young and active man");
		System.out.println(pers4.output());

		Person pers5 = new Person("Mark", "Rid");
		pers5.setBirthYear(1998);
		pers5.input("lazy and unfriendly man");
		System.out.println(pers5.output());

//		pers5.changeName("Ostin", "Daniels");
//		System.out.println(pers5.output());

	}

}
