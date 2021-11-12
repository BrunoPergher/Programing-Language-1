/*
Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:
• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa
Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque.
 */
package Lista02;

import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int cod[] = new int[5];
        double saldo[] = new double[5];
        int op = 1, codigo;
        double valor, ativoBancario = 0;
        boolean isValid = false;

        for (int i = 0; i < 5; i++) {
            isValid = false;
            System.out.print("Qual o codigo da conta ?\n");
            cod[i] = ler.nextInt();
            for (int j = 0; j < i; j++) {
                if (cod[i] == cod[j]) {
                    System.out.println("Valor Invalido");
                    i--;
                    isValid = true;
                }
            }
            if (!isValid) {
                System.out.print("Qual Saldo da conta ?\n");
                saldo[i] = ler.nextDouble();
            }
        }

        while (op > 0) {
            System.out.print("""
                             =============================
                              O que voce deseja fazer ?
                              1- deposito
                              2 -Efetuar Saque
                              3- consultar ativo bancario
                              4- consultar saldo
                              0- Fechar o programa
                             """);
            op = ler.nextInt();

            switch (op) {
                case 1 -> {
                    System.out.print("Qual o codigo da conta ?\n");
                    codigo = ler.nextInt();

                    System.out.print("Qual o valor a ser depositado ?\n");
                    valor = ler.nextDouble();

                    for (int i = 0; i < 5; i++) {
                        if (codigo == cod[i]) {
                            saldo[i] += valor;

                            System.out.println("Novo saldo da conta " + codigo + " é de " + saldo[i] + "\n");
                            isValid = true;
                            break;
                        }
                    }

                    if (isValid = false) {
                        System.out.println("codigo invalido\n");
                    }
                }
                case 2 -> {
                    System.out.print("Qual o codigo da conta ?\n");
                    codigo = ler.nextInt();

                    System.out.print("Qual o valor a ser sacado ?\n");
                    valor = ler.nextDouble();

                    for (int i = 0; i < 5; i++) {
                        if (codigo == cod[i]) {
                            isValid = true;
                            if (saldo[i] - valor <= 0) {
                                System.out.println("Saldo insuficiente\n");
                            } else {
                                saldo[i] -= valor;
                                System.out.println("Novo saldo da conta " + codigo + " é de " + saldo[i] + "\n");
                            }

                            break;
                        }

                        if (isValid = false) {
                            System.out.println("codigo invalido\n");
                        }
                    }
                }

                case 3 -> {
                    for (int i = 0; i < 5; i++) {
                        ativoBancario += saldo[i];
                    }

                    System.out.println("O ativo bancario é de " + ativoBancario + "\n");
                }
                case 4 -> {
                    System.out.print("Qual o codigo da conta ?\n");
                    codigo = ler.nextInt();

                    for (int i = 0; i < 5; i++) {
                        if (codigo == cod[i]) {
                            System.out.println("O saldo da conta " + codigo + " é de " + saldo[i] + "\n");
                            
                            isValid = true;
                            break;
                        }

                        if (isValid = false) {
                            System.out.println("codigo invalido\n");
                        }
                    }
                }
                case 0 -> {
                    System.out.println("""
                                       =================================
                                       Obrigado Por utilizar o Programa
                                       =================================""");
                }
                default -> System.err.println("Valor invalido\n");
            }
        }
    }
}
