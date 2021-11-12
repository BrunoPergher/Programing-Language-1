package Lista02;

/*Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados.*/
import java.util.Random;

public class Ex05 {

    public static void main(String[] args) {
        Random generator = new Random();
        int m[][] = new int[7][7];
        int vLinha[] = new int[7];
        int vColuna[] = new int[7];

        for (int i = 0; i < 7; i++) {
            for (int k = 0; k < 7; k++) {
                m[i][k] = generator.nextInt(20);
            }
        }

        for (int[] m1 : m) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m1[j] + " | ");
            }
            System.out.println("");
        }

        for (int j = 0; j < m.length; j++) {
            int maiorLinha = m[j][0];
            for (int i = 0; i < m[j].length; i++) {
                if (m[j][i] > maiorLinha) {
                    maiorLinha = m[j][i];
                }
            }
            vLinha[j] = maiorLinha;

            int menorColuna = m[0][j];
            for (var m1 : m) {
                if (m1[j] < menorColuna) {
                    menorColuna = m1[j];
                }
                vColuna[j] = menorColuna;
            }
        }

        System.out.println("\nMaiores valores Por Linha");
        for (int i = 0; i < vLinha.length; i++) {
            System.out.print(vLinha[i] + " | ");
        }

        System.out.println("\n\nMenores valores por coluna");
        for (int i = 0; i < vColuna.length; i++) {
            System.out.print(vColuna[i] + " | ");
        }
    }
}
