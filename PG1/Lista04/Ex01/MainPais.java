/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex01;

/**
 *
 * @author bruno
 */
public class MainPais {

    public static void main(String[] args) {
        Pais pais[] = new Pais[2];

        pais[0] = new Pais("BRA", "Brazil", 416545646, "Brasilia", 13215);
        pais[1] = new Pais("USA", "Estados unidos", 50000, "Washington", 1000);

        pais[0].ImprimePais();
        pais[1].ImprimePais();

        System.out.printf("Densidade do(a) " + pais[0].getNome() + ": " + (pais[0].CalculaDensidade()) + " hab/km² \n");
        System.out.printf("Densidade do(a) " + pais[1].getNome() + ": " + (pais[1].CalculaDensidade()) + " hab/km² \n");

    }
}
