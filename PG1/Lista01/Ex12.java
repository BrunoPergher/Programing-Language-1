/*
Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0.

 */
package lista01;

import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n = 5, cubo, quadrado, raiz;
        int linhas = 0;

        System.out.println("=========Calcule o cubo, quadrado e raiz de seu número==========");
        System.out.println("====Para finalizar o programa digite 0 ou um numero negativo====\n");

        while (n > 0) {
            System.out.println("Informe um numero");
            n = ler.nextDouble();
            
            if (n > 0) {
                quadrado = n * n;
                cubo = n * n * n;
                raiz = Math.sqrt(n);

                System.out.println("O quadrado de " + n + " é " + quadrado
                        + "\nO cubo de " + n + " é " + cubo
                        + "\nA raiz quadrada de " + n + " é " + raiz);
                linhas = linhas + 4;

                if (linhas == 20) {
                    System.out.println("=========Calcule o cubo, quadrado e raiz de seu número==========");
                    System.out.println("====Para finalizar o programa digite 0 ou um numero negativo====\n");
                    linhas = 0;
                }
            }
        }
    }
}
