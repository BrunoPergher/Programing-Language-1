/*4. Fa�a um programa que recebe o n�mero de horas trabalhadas e o valor do sal�rio
m�nimo, calcule e mostre o sal�rio a receber seguindo estas regras:
� a hora trabalhada vale a metade do sal�rio m�nimo;
� o sal�rio bruto equivale ao n�mero de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
� o imposto equivale a 3% do sal�rio bruto;
� o sal�rio a receber equivale ao sal�rio bruto menos o imposto*/
package Lista01;

import java.util.Scanner;

public class Ex04 {
	public static void calculaSal(double horas, double salMin) {
		double valorHora = (salMin / 2) / horas;
		double valorBruto = horas * valorHora;
		double salario = valorBruto - (valorBruto * 0.03);
		
		System.out.println("O Valor por hora �: " + valorHora +
				"\n O Valor bruto a ser pago � de:" + valorBruto +
				"\n A Salario com desconto:" + salario);
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double salMin;
		double horas;
		
		System.out.println("Valor do salario minimo:");
		salMin = ler.nextDouble();
		
		System.out.println("Horas trabalhadas:");
		horas = ler.nextDouble();
		
		calculaSal(horas, salMin);
		
		ler.close();
	}
}