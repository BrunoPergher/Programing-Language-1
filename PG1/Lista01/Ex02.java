/*Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre o
sal�rio a receber, sabendo-se que o funcion�rio tem gratifica��o de 5% sobre o sal�rio
base e paga imposto de 7% sobre este sal�rio.*/
package Lista01;
import java.util.Scanner;

public class Ex02 {
	public static void calculaSalario(double salario) {
		double salarioAjustado = salario + (salario * 0.05) - (salario * 0.07);
		
		System.out.println("O novo sal�rio ser� de: " + salarioAjustado);
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
