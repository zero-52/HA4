package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben = -150;
		double monEingang = 50;
		int rating = -2;
		boolean warnhinweis = true;
		boolean negativ = true;
		
		if (guthaben < 0) {
			negativ = true;
		}
		
			else {
				negativ = false;
			}
		
		if (guthaben > 0) {
				rating += 3;
			}
		
		else if (guthaben == 0) {
			rating += 2;
		}
		
		
		if (guthaben < 0 && monEingang >= Math.abs(guthaben)) {
			rating += 1;
		}
		
		   else if (guthaben < 0 && monEingang < Math.abs(guthaben)) {
			rating -= 1;
		}
		
		if (guthaben < 0 && monEingang < Math.abs(guthaben) && rating < 0) {

			warnhinweis = true;
		}  
		   else {
			warnhinweis = false;
			}
		
				
	System.out.println(negativ);
	       System.out.println(rating);
	System.out.println(warnhinweis);
	//Testfall 4,5 und 7 teilweise falsch: noch mal nachfragen vielleicht
	}
}
	

