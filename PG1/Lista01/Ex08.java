package lista01;

import java.util.Scanner;

/**
 * Faça um programa que leia um número e calcule o fatorial desse número
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n, fatorial;

        System.out.println("Qual o numero a ser fatorado?");
        n = ler.nextInt();

        for (fatorial = 1; n > 1; n--) {
            fatorial = fatorial * n;
        }

        System.out.println("O fatorial de " + n + " será: " + fatorial);

        ler.close();
    }
}
