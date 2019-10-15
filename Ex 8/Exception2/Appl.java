
public class Appl {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		   Plant [] p = new Plant[5];
			try {
				p[0] = new Plant("one222", "blue", 5);			      
			      System.out.println(p[0]);
			   } catch (ColorException | TypeException e) {
			      System.err.println(e.getMessage() + "\n");
			      //e.printStackTrace();
			   }

	}

}
