import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a senha: ");
		int password = sc.nextInt();
		
		while(password != 2002) {
			System.out.print("Senha inv�lida! Tente novamente: ");
			password = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
