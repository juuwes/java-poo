// Programa para ler os dados de funcion�rios. Mostrar os dados dos funcion�rios e aumentar o sal�rio do funcion�rio com base em uma porcentagem dada.

package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalaray(double percentage) {
		grossSalary *= (percentage + 100.0) / 100.0;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f%n", netSalary());
	}
}
