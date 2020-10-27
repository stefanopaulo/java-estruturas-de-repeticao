import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai digitar: ");
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			System.out.print("Digite um n�mero: ");
			int num = sc.nextInt();
			
			if(num < 0) {
				if(num % 2 != 0) {
					System.out.println("IMPAR NEGATIVO");
				} else {
					System.out.println("PAR NEGATIVO");
				}
			} else if(num > 0) {
				if(num % 2 != 0) {
					System.out.println("IMPAR POSITIVO");
				} else {
					System.out.println("PAR POSITIVO");
				}
			} else {
				System.out.println("NULO");
			}
		}
		
		sc.close();
	}
	
}
