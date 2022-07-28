// Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de estudantes que vão alugar quartos. Para cada registro de aluguel, informar o nome, email e qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. Ao final, imprimir um relatório de todas ocupações do pensionato, por ordem de quarto.

package application;

import java.util.Scanner;

import client.Student1;

public class Hotel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Student1[] vect = new Student1[10];

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			System.out.println();
			vect[room] = new Student1(name, email);
		}

		System.out.print("Busy rooms: ");

		for (int i = 0; i <= 10; i++) {
			if (vect[i] != null) {
				System.out.print(i + ": " + vect[i]);
			}

		}

		sc.close();
	}

}
