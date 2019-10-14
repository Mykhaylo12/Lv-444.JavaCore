package hm6;

public class Main {

	public static void main(String[] args) {
Bird [] o = new Bird [4];
o[0]=new Kiwi();
o[1] = new Eagle();
o[2] = new Swallow();
o[3] = new Penguin();
for (int i = 0; i < o.length; i++) {
	o[i].fly();
	System.out.println(o[i].toString());
}
	}

}
