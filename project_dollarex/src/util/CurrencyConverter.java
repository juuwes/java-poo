//Programa para ler a cota��o do d�lar, e depois um valor em d�lares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos d�lares, considerando ainda que ter� 6% de IOF sobre o valor em d�lar. 

package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double dollars) {
		return dollarPrice * dollars * (IOF + 1.0); 
	}

}
