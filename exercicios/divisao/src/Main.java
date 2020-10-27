import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voc� vai digitar? ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.print("Numerador: ");
			int num = sc.nextInt();
			System.out.print("Denominador: ");
			int dem = sc.nextInt();
			
			if(dem == 0) {
				System.out.println("Divis�o imposs�vel!");
			} else if(num == 0) {
				System.out.println("Infinity");
			} else {
				double div = (double)num / dem;
				
				System.out.printf("DIVIS�O = %.2f%n", div);
			}
		}
		
		sc.close();
	}

}
