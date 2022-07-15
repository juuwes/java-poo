//Programa para ler os dados de um funcionário. Mostrar os dados do funcionário e aumentar o  salário do funcionário com base em uma porcentagem dada.

package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();

		System.out.print("\nEmployee: ");
		System.out.println(employee);

		System.out.print("Wich percentage to increase salary? ");
		employee.increaseSalaray(sc.nextDouble());

		System.out.print("\nUpdate data: " + employee);

		sc.close();

	}

}
