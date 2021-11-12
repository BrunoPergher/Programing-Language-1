package Lista02;

/*
 * Faça um programa que, dados 2 vetores,
 * gere um terceiro com todos os valores ordenados de maneira decrescente.
 * */

public class Ex01 {

    public static int[] bubbleSort(int n, int[] vr) {
        int t;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (vr[j - 1] < vr[j]) {
                    t = vr[j - 1];
                    vr[j - 1] = vr[j];
                    vr[j] = t;
                }
            }
        }

        return vr;
    }

    public static void main(String[] args) {
        int[] v1 = {1, 3, 5, 7, 9};
        int[] v2 = {2, 4, 6, 8, 10};
        int[] vr = new int[10];
        int indice = v2.length, i, n;
        String out;

        for (i = 0; i < v2.length; i++) {
            vr[i] = v2[i];
            vr[i + indice] = v1[i];
        }

        n = vr.length;

        vr = bubbleSort(n, vr);

        out = "{ ";
        for (i = 0; i < n; i++) {
            out += vr[i] + ", ";
        }
        out += "}";

        System.out.println("Ordenando por descrescimento: \n");
        System.out.println(out);
    }
}