import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero inteiro: ");
		int n = sc.nextInt();
		
		while(n != 0) {
			if (n % 2 != 0) {
				n++;
			}
			
			int c = 0;
			int sum = 0;
			
			while(c < 5) {
				sum += n;
				n += 2;
				c++;
			}
			
			System.out.println("SOMA = " + sum);
			
			System.out.print("Digite um n�mero inteiro: ");
			n = sc.nextInt();			
		}
		
		sc.close();
	}

}
