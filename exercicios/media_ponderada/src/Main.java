import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos você vai digitar? ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.println("Digite três números:");
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;
			
			System.out.printf("Média = %.1f%n", media);
		}
		
		sc.close();
	}

}
