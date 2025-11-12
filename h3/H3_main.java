package h3;

public class H3_main {
	public static void main (String [] args) {
		float celsiusFloat = 16.8f;
		float fahrenheitFloat = 88.9f;
		fahrenheitFloat =celsiusFloat * 9/5 + 32f;
		double celsiusDouble = 16.8;
		double fahrenheitDouble = 155.86;
		fahrenheitDouble = celsiusDouble * 9/5 + 32;
		
		System.out.println("Das Wetter heute liegt bei " + celsiusFloat + " Grad Celsius und " + fahrenheitFloat + " Grad Fahrenheit.");
		System.out.println("Das Wetter heute liegt bei " + celsiusDouble + " Grad Celsius und " + fahrenheitDouble + " Grad Fahrenheit.");

	}

}
