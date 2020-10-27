import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite dois números:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int soma = 0;
		
		if(x > y) {
			int aux = x;
			x = y;
			y = aux;
		}
		
		for(int i = x + 1; i < y; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("Soma dos impares: " + soma);
		
		sc.close();
	}

}
