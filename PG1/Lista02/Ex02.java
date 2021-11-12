package Lista02;

/*Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores*/

public class Ex02 {

    public static void main(String[] args) {
        final int TAM = 20;
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] v2 = {1, 2, 3, 7, 9, 11, 17, 21, 27, 33};
        int[] vf = new int[TAM];
        String out;

        int ivr = 0;
        boolean isEqualV1, isEqualV2;

        for (int i = 0; i < v1.length; i++) {
            isEqualV1 = true;
            isEqualV2 = true;

            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    isEqualV1 = false;
                    break;
                }

                if (v2[i] == v1[j]) {
                    isEqualV1 = false;
                    break;
                }
            }

            if (isEqualV1) {
                vf[ivr] = v1[i];
                ivr++;
            }
            if (isEqualV2) {
                vf[ivr] = v2[i];
                ivr++;
            }
        }

        out = "{ ";
        for (int i = 0; i < ivr; i++) {
            out += vf[i] + ", ";
        }
        out += "}";

        System.out.println("Não comuns entre os vetores:");
        System.out.println(out);
    }
}