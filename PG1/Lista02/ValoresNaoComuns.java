package Lista02;

public class ValoresNaoComuns {

    public static void main(String[] args) {
        //v1 tem tamanho 10
        int[] v1 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        //v2 tem tamanho 10
        int[] v2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        final int TAM = 20; //v1.length + v2.length;

        int[] vr = new int[TAM];
        int ivr = 0;
        boolean diferente = true;

        for (int i = 0; i < v1.length; i++) {
            diferente = true;
            for (int j = 0; j < v2.length; j++) {
                if (v1[i] == v2[j]) {
                    diferente = false;
                }
            }
            if (diferente) {
                vr[ivr] = v1[i];
                ivr++;
            }
        }

        for (int i = 0; i < v1.length; i++) {
            diferente = true;
            for (int j = 0; j < v2.length; j++) {
                if (v2[i] == v1[j]) {
                    diferente = false;
                }
            }
            if (diferente) {
                vr[ivr] = v2[i];
                ivr++;
            }
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < ivr; i++) {
            System.out.println(vr[i]);

        }
    }
}
