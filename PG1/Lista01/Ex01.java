package Lista01;

/* 1. Leia os 03 �ngulos e os 03 lados de um tri�ngulo, e classifique-o como: ret�ngulo,
obtus�ngulo ou acut�ngulo; e equil�tero, escaleno ou is�sceles.*/

import java.util.Scanner;

public class Ex01 {
	public static void verificaAngulosTriangulo(int angA, int angB, int angC) {
		if ((angA > 0) && (angB > 0) && (angC > 0) && (angA + angB + angC == 180))
		{		
			if (angA == 90 || angB == 90 || angC == 90) {
				System.out.println("Tri�ngulo ret�ngulo");
			}else
			if (angA > 90 || angB > 90 || angC > 90) {
				System.out.println("Tri�ngulo obtus�ngulo");
			}else {
				System.out.println("Tri�ngulo acut�ngulo");
			}
		}else {
			System.out.println("Querido usu�rio, isso n�o � um tri�ngulo!");
		}
	}
	
	public static void verificaLadosTriangulo(int ladoA, int ladoB, int ladoC) {
		if ((ladoA > 0) && (ladoB > 0) && (ladoC > 0) &&
				(ladoA + ladoB > ladoC) && 
				(ladoA + ladoC > ladoB) &&
				(ladoB + ladoC > ladoA)){
				
				if (ladoA == ladoB && ladoA == ladoC) {
					System.out.println("Equil�tero");
				}else
				if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
					System.out.println("Escaleno");
				}else {
					System.out.println("Is�celes");
				}
							
			}else {
				System.out.println("Querido usu�rio, isso n�o � um tri�ngulo!");
			}
	}
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int angA, angB, angC;
		int ladoA, ladoB, ladoC; 
		
		System.out.println("Forne�a os 03 �ngulos do tri�ngulo:");
		angA = ler.nextInt();
		angB = ler.nextInt();
		angC = ler.nextInt();

		verificaAngulosTriangulo(angA, angB,angC);
						
		System.out.println("Forne�a os 03 lados do tri�ngulo:");
		ladoA = ler.nextInt();
		ladoB = ler.nextInt();
		ladoC = ler.nextInt();
		
		verificaLadosTriangulo(ladoA, ladoB, ladoC);
		ler.close();
	}
}
