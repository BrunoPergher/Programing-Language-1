/*
Faça um programa que leia dois números e apresente o fatorial de todos os números
que estejam dentro do intervalo definido pelos números que foram lidos

 */
package lista01;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, troca, fatorial;

        System.out.println("Qual o primeiro numero?");
        n1 = ler.nextInt();

        System.out.println("Qual o segundo numero?");
        n2 = ler.nextInt();

        if (n2 < n1) {
            troca = n1;
            n1 = n2;
            n2 = troca;
        }

        for (int i = n1 + 1; i < n2; i++) {
            int j = i;
            for (fatorial = 1; j > 1; j--) {
                fatorial = fatorial * j;
            }

            System.out.println("O fatorial de " + i + " será: " + fatorial + "\n");
        }

        ler.close();
    }
}
