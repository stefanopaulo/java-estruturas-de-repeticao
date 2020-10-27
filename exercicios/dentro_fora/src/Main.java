import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int dentro = 0;
		int fora = 0;
		
		for(int i = 1; i <= n; i ++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println("Dentro " + dentro);
		System.out.println("Fora " + fora);
		
		sc.close();
	}

}
