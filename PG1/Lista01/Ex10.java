/*
Faça um programa que leia um número inteiro e diga se ele é primo
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n, primo = 0;

        System.out.println("Qual o numero você quer saber se é primo?");
        n = ler.nextInt();
        if (n > 2) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    primo++;
                }
            }
        }
        if (primo == 1) {
            System.out.println("O numero " + n + " e primo");
        } else {
            System.out.println("O numero " + n + " nao e primo");
        }
    }
}
