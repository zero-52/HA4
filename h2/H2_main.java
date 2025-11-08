package h2;

public class H2_main {
	public static void main (String [] args) {
		boolean x = true;
		boolean y = true;
		boolean a;
		boolean b;
		boolean c;
		int input = 1; //0,1,10 oder 11
		
		if (input == 10 || input == 11) {
			x = true;
		}
		else {
			x = false;
		}
		System.out.println("x ist " + x);
		
		if (input == 11 || input == 1) {
			y = true;
		}
		else { 
			y = false;
		}
		System.out.println("y ist " + y);
		
		if (x && y) {
			a = true;
		}
		else { 
			a = false;
		}
		System.out.println("a ist " + a);

		
		if (x || x!= y) {
			b = true;
		}
		else { 
			b = false;
		}
		System.out.println("b ist " + b);

		
		if (x && !y || !x && !y) {
			c = true;
		}
		else {
			c = false;
		}
		System.out.println("c ist " + c);
		
	}

}
