/*
Faça um programa que receba dez números inteiros e mostre a quantidade de números
primos dentre os número que foram digitados.
 */
package lista01;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n, tot = 0, primo;
        var numeros = "";

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número: ");
            n = ler.nextInt();
            primo = 0;
            if (n > 2) {
                for (int j = 2; j <= n; j++) {
                    if (n % j == 0) {
                        primo++;
                    }
                }
            }
            if (primo == 1) {
                tot++;
                numeros += "O numero " + n + " é primo \n";
            }
        }

        System.out.println(numeros);
        System.out.println("\nA quantidade de numeros primos foi de " + tot + "/10 ");

        ler.close();
    }
}
