/*5. Fa�a um programa que receba
� O c�digo do produto comprado;
� A quantidade comprada do produto
Calcule e mostre:
� O pre�o unit�rio do produto comprado, seguindo a Tabela I;
� O pre�o total da nota;
� O valor do desconto, seguindo a Tabela II e aplicado sobre o pre�o total da nota;
� O pre�o final da nota depois do desconto.*/
package Lista01;

import java.util.Scanner;

public class Ex05 {
	public static double calculaPreco(int codigo, int qtd) {
		double preco = 0;
		
		if(codigo <= 10) {
			preco = 10;
			
		}else if(codigo > 10 && codigo < 21) {
			preco = 15;
			
		}else if(codigo > 20 && codigo < 31) {
			preco = 20;
			
		}else if(codigo > 30 && codigo < 41) {
			preco = 20;
			
		}else {
			System.out.println("Codigo Invalido");
		}
		
		return preco * qtd;
	}
	
	public static void calculaDesconto(double preco, int qtd) {
		double precoDesc = 0;
		
		if(preco < 250) {
			precoDesc = preco - (preco * 0.05);
			
		}else if(preco >= 250 && preco < 500) {
			precoDesc = preco - (preco * 0.1);
			
		}else {
			precoDesc = preco - (preco * 0.15);
		}
		
		System.out.println(" O Valor unitario �: " + (preco/qtd) +
				"\n O Subtotal:" + preco +
				"\n O desconto:" + (preco - precoDesc) +
				"\n Total: " + precoDesc);
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int codigo;
		int qtd;
		
		System.out.println("Codigoo do produto:");
		codigo = ler.nextInt();
		
		System.out.println("quantidade:");
		qtd = ler.nextInt();
		
		double preco= calculaPreco(codigo, qtd);
		
		calculaDesconto(preco, qtd);
		
		
		ler.close();
	}
	
	
}