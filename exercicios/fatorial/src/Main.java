import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de N: ");
		int n = sc.nextInt();
		
		int fat = 1;
		
		for(int i = 1; i <= n; i++) {
			fat *= i;
		}
		
		System.out.println("Fatorial = " + fat);
		
		sc.close();
	}
	
}
