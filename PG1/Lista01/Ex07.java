/*
7. Em um campeonato de futebol existem cinco times e cada um possui 11 jogadores.
Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores,
calcule e mostre:
• a quantidade de jogadores com idade inferior a 18 anos;
• a média das idades dos jogadores de cada time;
• a média das alturas de todos os jogadores do campeonato;
• a porcentagem de jogadores com mais de 80kg entre todos os jogadores do campeonato.
 */
package lista01;

import java.util.Scanner;

public class Ex07 {

    /*public static void calculaSal(double horas, double salMin) {
        double valorHora = (salMin / 2) / horas;
        double valorBruto = horas * valorHora;
        double salario = valorBruto - (valorBruto * 0.03);

        System.out.println("O Valor por hora é: " + valorHora
                + "\n O Valor bruto a ser pago é de:" + valorBruto
                + "\n A Salario com desconto:" + salario);
    }*/

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int i, j, idade, menores18=0, qtdMaior80=0, totPessoas, numTime, numJogadores;
        float peso, altura, idadeMedia=0, alturaMedia=0, acima80;
        
        System.out.println("Quantos times?");
        numTime = ler.nextInt();
        
        System.out.println("Quantos Jogadores?");
        numJogadores = ler.nextInt();
        
        totPessoas = numTime * numJogadores;

        for (i = 0; i < numTime; i++) {
            idadeMedia=0;
            for (j = 0; j < numJogadores; j++) {
                System.out.println("Digite a idade do jogador " + (j+1) + " do time " + (i+1));
                idade = ler.nextInt();
                
                System.out.println("Digite o peso do jogador " + (j+1) + " do time " + (i+1));
                peso = ler.nextFloat();
                
                System.out.println("Digite a altura do jogador " +(j+1)+ " do time " + (i+1));
                altura = ler.nextFloat();
                
                idadeMedia += idade;
                alturaMedia += altura;
                
                if (idade < 18) {
                    menores18++; /* quando o if possui apenas um comando, e curto, pode-se escrever tudo na mesma linha */
                }
                if (peso > 80) {
                    qtdMaior80++;
                }

            }
            idadeMedia = idadeMedia / numJogadores;
            System.out.println("A média das idades do time "+i+" é " + idadeMedia);
        }

        alturaMedia = alturaMedia / totPessoas;
        acima80 = qtdMaior80*100 / totPessoas;

        System.out.println("A média das alturas é " + alturaMedia);
        System.out.println("\n O número de jogadores com menos de 18 anos é " + menores18);
        System.out.println("\n A porcentagem de jogadores com mais de 80kgs é " + acima80);
        
        ler.close();
    }
}
