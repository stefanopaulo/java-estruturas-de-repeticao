import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Deseja a tabuada para qual valor? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int prod = n * i;
			System.out.printf("%d x %d = %d%n", n, i, prod);
		}
		
		sc.close();
	}

}
