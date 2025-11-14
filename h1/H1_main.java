package h1;

public class H1_main {
	public static void main(String[] args) {
		int zone = 82;
		double price = 8;

		switch (zone) {
		case 1:
			price = 2;
			break;
			
		case 2:
			price = 2.35;
			break;
			
		case 3:
		case 4:
			price = 2.85;
			break;
			
		case 5:
			price = 3.55;
			break;
			
		case 6:
			price = 4;
			break;

		default:
			if (zone >= 6) {
				price = 4;
			}
			else {
				price = 0;
			}
			
	

		}			
		System.out.println(price);

	}

}
