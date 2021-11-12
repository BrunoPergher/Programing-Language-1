/*Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores*/
package Lista01;

public interface Ex002 {
	public static void main(String[] args) {
		

		int[] v1 = {1, 2, 3};
		int[] v2 = {3, 4, 5};
		
		final int TAM = 6;
		
		int[] vr = new int[TAM];
		int ivr = 0;
		boolean diferente;
		
		for (int i = 0; i < TAM; i++) {
			diferente = true;
			for (int j = 0; j < v2.length; j++) {
				if (v1[i] == v2[j]) {
					diferente= false;
					break;
				}
			}
			if (diferente) {
				vr[ivr] = v1[i];
				ivr++;
			}
		}
		
			
	}
}
