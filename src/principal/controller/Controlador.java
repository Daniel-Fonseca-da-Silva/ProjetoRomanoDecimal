package principal.controller;

import java.util.ArrayList;
import java.util.Scanner;

import principal.model.Decimal;
import principal.model.Romano;

public class Controlador {

	private ArrayList<String> modos = new ArrayList<>();
	private String opcao = "";
	private Romano romano = new Romano();
	private Decimal decimal = new Decimal();

	public void modo() {

		Scanner entrada = new Scanner(System.in);
		modos.add("R");
		modos.add("r");
		modos.add("d");
		modos.add("R");

		System.out.println("-------------------------------");
		System.out.println("Sistema de Conversão de números");
		System.out.println("Escolha qual conversão deseja realizar");
		System.out.println("(r)Romano para Decimal ou (d) Decimal para Romano");
		opcao = entrada.nextLine();

		if (modos.contains(opcao)) {
			if (opcao.equals("r") || opcao.equals("R")) {
				romano.conversao();
			} else {
				decimal.conversao();
			}
		} else {
			System.out.println("Por favor tente novamente entre (r) ou (d)");
		}

		entrada.close();
	}

}
