package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator();

		int op = 5;
		double n1;
		double n2;

		System.out.println("-Escolha uma opção-");
		System.out.println("1. Soma");
		System.out.println("2. Subtracao");
		System.out.println("3. Multiplicacao");
		System.out.println("4. Divisao");
		System.out.println("0. Sair");
		System.out.println("Operação: ");

		op = sc.nextInt();

		while (op != 0) {

			switch (op) {
			case 1:
				System.out.print("Digite o primeiro numero :");
				n1 = sc.nextDouble();

				System.out.print("Digite o segundo numero :");
				n2 = sc.nextDouble();

				double resultado = calc.soma(n1, n2);
				System.out.printf("\n" + "O resultado da  soma é : %.2f%n", resultado);
				break;

			case 2:
				System.out.print("Digite o primeiro numero :");
				n1 = sc.nextDouble();

				System.out.print("Digite o segundo numero :");
				n2 = sc.nextDouble();

				resultado = calc.subtrair(n1, n2);
				System.out.printf("\n" + "O resultado da subtração é : %.2f%n", resultado);
				break;

			case 3:
				System.out.print("Digite o primeiro numero :");
				n1 = sc.nextDouble();

				System.out.print("Digite o segundo numero :");
				n2 = sc.nextDouble();

				resultado = calc.multiplicar(n1, n2);
				System.out.printf("\n" + "O resultado da multiplicação é : %.2f%n", resultado);
				break;

			case 4:
				System.out.print("Digite o primeiro numero :");
				n1 = sc.nextDouble();

				System.out.print("Digite o segundo numero :");
				n2 = sc.nextDouble();

				resultado = calc.dividir(n1, n2);
				System.out.printf("\n" + "O resultado da multiplicação é : %.2f%n", resultado);
				break;

			}
		}

		System.out.println("Programado encerrado !!! ");

		sc.close();
	}

}
