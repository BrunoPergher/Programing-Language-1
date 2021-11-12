/*Faça um programa que receba o salário base de um funcionário, calcule e mostre o
salário a receber, sabendo-se que o funcionário tem gratificação de 5% sobre o salário
base e paga imposto de 7% sobre este salário.*/
package Lista01;
import java.util.Scanner;

public class Ex02 {
	public static void calculaSalario(double salario) {
		double salarioAjustado = salario + (salario * 0.05) - (salario * 0.07);
		
		System.out.println("O novo salário será de: " + salarioAjustado);
	}
	
public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double salario; 
		
		System.out.println("Qual o Salario");
		salario = ler.nextDouble();
		
		calculaSalario(salario);
		
		ler.close();
	}
}
