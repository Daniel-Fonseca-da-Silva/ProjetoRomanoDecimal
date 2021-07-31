package principal.model;

import java.util.HashMap;
import java.util.Scanner;

public class Decimal extends Calculo {

	private HashMap<Integer, String> numeros = new HashMap<Integer, String>();
	private Integer numeroGuardado = 0;
	private Integer letraAtual = 0;
	private boolean repeticao = true;
	private String parada = "";
	private String guardaLetras = "";
	private Integer capturaNumero = 0;
	private String guardaNumero = "";
	private String guardaLetra = "";

	@Override
	public void conversao() {

		Scanner captura = new Scanner(System.in);

		numeros.put(1, "I");
		numeros.put(5, "V");
		numeros.put(10, "X");
		numeros.put(50, "L");
		numeros.put(100, "C");
		numeros.put(500, "D");
		numeros.put(1000, "M");

		while (repeticao) {
			
			System.out.println("\nPressione enter para continuar ou (s) para sair\n");
			parada = captura.nextLine();

			if (parada.equals("s") || parada.equals("S")) {
				System.out.println("Sistema finalizado");
				captura.close();
				break;
			} else {
				System.out.println("Entre com o numero decimal");
				capturaNumero = Integer.parseInt(captura.nextLine());

				if (numeros.containsKey(capturaNumero)) {
					System.out.println("Numero escolhido: " + capturaNumero);

					guardaNumero += capturaNumero.toString();
					letraAtual = capturaNumero;

					if (letraAtual >= numeroGuardado) {
						numeroGuardado += capturaNumero;
						guardaLetra = numeros.get(letraAtual);
						guardaLetras += numeros.get(letraAtual);
						System.out.println("Inserido: " + letraAtual + " conversão: " + guardaLetra);
						System.out.println("Numeros inseridos: " + guardaNumero + "\nletras atuais: " + guardaLetras);

					} else {
						if (numeros.containsKey(letraAtual)) {
							guardaLetra = numeros.remove(letraAtual);
							System.out.println("Inserido: " + letraAtual + " conversão " +  guardaLetra);
							System.out.println("Numeros inseridos: " + guardaNumero);
						} else {
							System.out.println("Número fora da faixa");
						}
					}

				} else {
					System.out.println("Número fora da faixa");
				}

			}
			}

		}

	}
