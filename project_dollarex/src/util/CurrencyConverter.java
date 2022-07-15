//Programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que terá 6% de IOF sobre o valor em dólar. 

package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double converter(double dollarPrice, double dollars) {
		return dollarPrice * dollars * (IOF + 1.0); 
	}

}
