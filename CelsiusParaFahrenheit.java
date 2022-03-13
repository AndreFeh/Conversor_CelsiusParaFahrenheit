package git;
import java.util.Scanner; 
public class CelsiusParaFahrenheit {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Qual a temperatura em C°: ");
		float graus = scan.nextFloat();
//		A base do Fahrenheit é 32 = 0 Graus - entao...
		float conversaoF = (graus * 5/9) + 32;
		
			System.out.println("Temperatura em Graus(C°): " + graus + "\n" + "Convertida em Fahrenheit(F°): " + conversaoF);	
	}
}
