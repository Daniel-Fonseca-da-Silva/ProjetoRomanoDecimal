package principal.model;

import java.util.HashMap;
import java.util.Scanner;

public class Romano extends Calculo {

	private HashMap<String, Integer> letras = new HashMap<String, Integer>();
	private Integer letraTotalTamanho = 0;
	private Integer letraAtualTamanho = 0;
	private boolean repeticao = true;
	private String parada = "true";
	private String letracapturada = "";
	private String contaLetra = "";

	@Override
	public void conversao() {

		Scanner captura = new Scanner(System.in);

		letras.put("I", 1);
		letras.put("V", 5);
		letras.put("X", 10);
		letras.put("L", 50);
		letras.put("C", 100);
		letras.put("D", 500);
		letras.put("M", 1000);

		while (repeticao) {

			System.out.println("\nPressione enter para continuar ou (s) para sair");
			parada = captura.nextLine();

			if (parada.equals("s") || parada.equals("S")) {
				System.out.println("Sistema finalizado");
				captura.close();
				break;
			} else {
				System.out.println("Entre com o numero romano");
				letracapturada = captura.nextLine();

				if (letras.containsKey(letracapturada.toUpperCase())) {
					System.out.println("Numero escolhido: " + letracapturada.toUpperCase());

					contaLetra += letracapturada.toUpperCase();
					letraAtualTamanho = letras.get(letracapturada.toUpperCase());

					if (letraAtualTamanho >= letraTotalTamanho) {
						letraTotalTamanho += letras.get(letracapturada.toUpperCase());
						System.out.println("Inserido: " + letracapturada + " conversão: " + letraTotalTamanho);
						System.out.println("Letras inseridas: " + contaLetra);
					} else {
						letraTotalTamanho -= letras.get(letracapturada.toUpperCase());
						System.out.println("Inserido: " + letracapturada + " conversão: " + letraTotalTamanho);
						System.out.println("Letras inseridas: " + contaLetra);
					}
				} else {
					System.out.println("Verifique se a letra informada é romana");
				}
			}

		}
	}

}
