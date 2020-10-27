import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		
		while(n1 < 0 || n1 > 10) {
			System.out.print("Nota inválida! Tente novamente: ");
			n1 = sc.nextDouble();
		}

		System.out.print("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		while(n2 < 0 || n2 > 10) {
			System.out.print("Nota inválida! Tente novamente: ");
			n2 = sc.nextDouble();
		}
		
		double avg = (n1 + n2) / 2;
		
		System.out.printf("Média: %.2f", avg);
		
		sc.close();
	}

}
