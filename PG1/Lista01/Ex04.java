/*4. Faça um programa que recebe o número de horas trabalhadas e o valor do salário
mínimo, calcule e mostre o salário a receber seguindo estas regras:
• a hora trabalhada vale a metade do salário mínimo;
• o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da
hora trabalhada;
• o imposto equivale a 3% do salário bruto;
• o salário a receber equivale ao salário bruto menos o imposto*/
package Lista01;

import java.util.Scanner;

public class Ex04 {
	public static void calculaSal(double horas, double salMin) {
		double valorHora = (salMin / 2) / horas;
		double valorBruto = horas * valorHora;
		double salario = valorBruto - (valorBruto * 0.03);
		
		System.out.println("O Valor por hora é: " + valorHora +
				"\n O Valor bruto a ser pago é de:" + valorBruto +
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