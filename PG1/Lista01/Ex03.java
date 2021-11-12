/*Sabe-se que o quilowatt de energia custa um quinto do salário mínimo. Faça um programa que recebe o valor do
 * salário mínimo e a quantidade de quilowatts consumida por uma residência, calcule e mostre:
• o valor de cada quilowatt;
• o valor a ser pago por essa residência;
• o valo a ser pago com 15% de desconto.*/
package Lista01;
import java.util.Scanner;

public class Ex03 {
	public static void calculaValorLuz(double salMin, double kw) {
		double valorPorKw = (salMin / 5) / kw;
		double valorConta = salMin / 5;
		double valorDesconto = valorConta - (valorConta * 0.15);
		
		System.out.println("O Valor por Quilowatt é de: " + valorPorKw +
				"\n O Valor a ser pago é de:" + valorConta +
				"\n A conta com 15% de desconte será de:" + valorDesconto);
	}
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double kw;
		double salMin;
		
		System.out.println("Qual o Salario minimo ?");
		salMin = ler.nextDouble();
		
		System.out.println("Quantos quilowatts foram consumidos?");
		kw = ler.nextDouble();
		
		calculaValorLuz(salMin, kw);
		
		ler.close();
	}
}