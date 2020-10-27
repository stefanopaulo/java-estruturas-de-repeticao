import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
		int cod = sc.nextInt();
		
		int alcool = 0;
		int disel = 0;
		int gasolina = 0;
		
		while(cod != 4) {
			switch(cod) {
				case 1:
					alcool++;
					break;
				case 2:
					gasolina++;
					break;
				case 3:
					disel++;
					break;
			}
			
			System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
			cod = sc.nextInt();
		}
		
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Disel: " + disel);
		
		sc.close();
	}

}
