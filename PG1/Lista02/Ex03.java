package Lista02;

/*Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
calcule e mostre 2 vetores resultantes:
• no primeiro vetor resultante, cada elemento será composto pela soma de cada
número par do primeiro vetor somado a todos os números do segundo vetor;
• o segundo vetor resultante será composto pela quantidade de divisores que cada
número ímpar do primeiro vetor tem no segundo vetor.
 */
public class Ex03 {

    public static void main(String[] args) {
        int v1[] = {1, 3, 5, 7, 9, 10, 12, 14, 16, 18};
        int v2[] = {1, 2, 3, 4, 5};
        int par = 0, impar = 0, somav2 = 0;

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 != 0) {
                impar++;
            } else {
                par++;
            }
        }

        int[] v3 = new int[par];
        int[] v4 = new int[impar];

        //VR1
        for (int i = 0; i < v2.length; i++) {
            somav2 += v2[i];
        }

        int ipar = 0, iImpar = 0;

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 0) {
                v3[ipar] = v1[i] + somav2;
                ipar++;
            }
        }

        // VR2
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 != 0) {
                v4[iImpar] = v1[i];
                iImpar++;
            }
        }

        for (int i = 0; i < v4.length; i++) {
            int qntDiv = 0;
            for (int j = 0; j < v2.length; j++) {
                if (v4[i] % v2[j] == 0) {
                    qntDiv++;
                }
            }
            v4[i] = qntDiv;
        }

        // Imprime Vetor 1
        System.out.println("Elemento Pares de v1 somados com todos os valores de v2:");
        String out1 = "{ ";
        for (int i = 0; i < v3.length; i++) {
            out1 += v3[i] + ", ";
        }
        out1 += "}\n";
        System.out.println(out1);

        // imprime Vetor 2
        System.out.println("Divisores do impares quantos divisores");
        String out2 = "{ ";
        for (int i = 0; i < v4.length; i++) {
            out2 += v4[i] + ", ";
        }
        out2 += "}";

        System.out.println(out2);
    }
}
