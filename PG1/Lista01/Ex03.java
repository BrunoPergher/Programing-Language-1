/*Sabe-se que o quilowatt de energia custa um quinto do sal�rio m�nimo. Fa�a um programa que recebe o valor do
 * sal�rio m�nimo e a quantidade de quilowatts consumida por uma resid�ncia, calcule e mostre:
� o valor de cada quilowatt;
� o valor a ser pago por essa resid�ncia;
� o valo a ser pago com 15% de desconto.*/
package Lista01;
import java.util.Scanner;

public class Ex03 {
	public static void calculaValorLuz(double salMin, double kw) {
		double valorPorKw = (salMin / 5) / kw;
		double valorConta = salMin / 5;
		double valorDesconto = valorConta - (valorConta * 0.15);
		
		System.out.println("O Valor por Quilowatt � de: " + valorPorKw +
				"\n O Valor a ser pago � de:" + valorConta +
				"\n A conta com 15% de desconte ser� de:" + valorDesconto);
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