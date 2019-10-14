package hm;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		final Random random = new Random();
Employee [] e = new Employee[5];
e[0]=new SalariedE(90, random.nextInt(1000000), 1);
e[1]=new SalariedE(150, random.nextInt(1000000), 2);
e[2]=new SalariedE(70, random.nextInt(1000000), 3);
e[3]=new ContractE(random.nextInt(1000000), 5000, 4);
e[4]=new ContractE(random.nextInt(1000000), 7000, 5);
for(int i=0;i<e.length;i++) {
	System.out.print(e[i].calculate());
	System.out.println(e[i].toString());
}
Employee t;
for (int i = 0; i < e.length - 1; i++) {
	for (int j = i + 1; j < e.length; j++) {
		if (e[i].calculate()<e[j].calculate()) {
			t = e[i];
			e[i] = e[j];
			e[j] = t;
		}
	}
}
for (int i = 0; i < e.length; i++) {
	System.out.println(e[i].toString()+" "+ e[i].calculate());
}

	}


		

}

