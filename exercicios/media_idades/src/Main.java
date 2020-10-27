import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media;
		int cont = 0;
		int somaIdades = 0;
		int idade = sc.nextInt();
		
		while (idade >= 0) {
			if (idade >= 0) {
				somaIdades += idade;
				cont++;
			}
			
			idade = sc.nextInt();
		}
		
		
		if (somaIdades == 0) {
			System.out.println("Impos�vel calcular");
		} else {
			media = (double)somaIdades / cont;
			System.out.printf("M�dia de idades: %.2f", media);
		}
		
		sc.close();
	}

}
