package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			double limiteDiario = sc.nextDouble();

			for (double saque = 0.0; saque != limiteDiario; saque++) {
				saque = sc.nextDouble();
				limiteDiario -= saque;

				if (saque <= limiteDiario) {
					if (saque == 0) {
						System.out.println("Transacoes encerradas.");
						return;
					}
					System.out.println("Saque realizado. Limite restante: " + limiteDiario);
				} else {
					System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
					return;
				}
			}
		}
	
	}
}
