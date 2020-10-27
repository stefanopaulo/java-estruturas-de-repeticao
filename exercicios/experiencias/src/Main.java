import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos casos voc� vai digitar? ");
		int c = sc.nextInt();
		
		int qntS = 0;
		int qntR = 0;
		int qntC = 0;
		
		for(int i = 1; i <= c; i++) {
			System.out.print("Quantidade de cobaias: ");
			int qnt = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			sc.nextLine();
			String tipo = sc.nextLine();
			
			switch(tipo) {
				case "C":
					qntC += qnt;
					break;
				case "S":
					qntS += qnt;
					break;
				case "R":
					qntR += qnt;
					break;
			}
		}
		
		int total = qntS + qntR + qntC;
		
		System.out.println();
		
		System.out.println("RELATORIO FINAL");
		System.out.printf("Total: %d%n", total);
		System.out.printf("Total de coelhos: %d%n", qntC);
		System.out.printf("Total de ratos: %d%n", qntR);
		System.out.printf("Total de sapos: %d%n", qntS);
		
		double perCoelhos = qntC * 100.0 / total;
		double perRatos = qntR * 100.0 / total;
		double perSapos = qntS * 100.0 / total;
		
		System.out.printf("Percentual de coelhos: %.2f%n", perCoelhos);
		System.out.printf("Percentual de ratos: %.2f%n", perRatos);
		System.out.printf("Percentual de sapos: %.2f%n", perSapos);
		
		sc.close();
	}

}
