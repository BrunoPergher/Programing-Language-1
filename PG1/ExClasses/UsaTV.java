/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula;

import java.util.Scanner;

/**
 *
 * @author bruno
 */
public class UsaTV {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        TV TV = new TV();
        int botao = 0;

        while (botao != 100) {
            System.out.print("""
                             =============================
                              O que voce deseja fazer ?
                              1- Botão ON/OFF TV
                              2- Setar Canal
                              3- Passar Canal
                              4- Voltar Canal
                              5- Aumentar Volume
                              6- Diminuir Volume
                              100- Fechar o programa
                             """);
            botao = ler.nextInt();

            switch (botao) {
                case 1 -> {
                    TV.Power();
                }
                case 2 -> {
                    if (TV.isLigado()) {
                        System.out.print("Qual o Canal desejado\n");
                        int canal = ler.nextInt();

                        TV.setCanal(canal);
                    } else {
                        System.out.print("TV Desligada, Pòr favor Ligue a tv clicando 1 no menu\n");
                    }
                }
                case 3 -> {
                    TV.incrementarCanal();
                }
                case 4 -> {
                    TV.decrementarCanal();
                }
                case 5 -> {
                    TV.incrementarVolume();
                }
                case 6 -> {
                    TV.decrementarVolume();
                }
                case 100 -> {
                    System.out.println("""
                                       =================================
                                       Obrigado Por utilizar o Programa
                                       =================================""");
                    break;
                }
                default ->
                    System.err.println("Valor invalido\n");
            }

        }

        ler.close();
    }
}
