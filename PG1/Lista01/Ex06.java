package lista01;

import java.util.Scanner;
/*Fa�a uma calculadora de troco, baseado nas c�dulas da nossa moeda.*/
public class Ex06 {
        
    public static String calculaTroco(double conta, double pago) {

        if (pago < conta) {
            return ("\nPagamento insuficiente, faltam R$" + (conta - pago) + "\n");
        } else {
            int nota[] = {100, 50, 20, 10, 5, 2, 1};
            int centavos[] = {50, 25, 10, 5, 1};

            String result;
            double troco;
            int i, valor, ct;

            troco = pago - conta;
            result = "\n Troco = R$ " + (troco) + "\n\n";

            valor = (int) troco;
            i = 0;
            while (valor != 0) {
                ct = valor / nota[i]; 
                if (ct != 0) {
                    result = result + (ct + " nota(s) de R$ " + nota[i] + "\n");
                    valor = valor % nota[i]; 
                }
                i++;
            }

            result = result + "\n";

            valor = (int) Math.round((troco - (int) troco) * 100);
            i = 0;
            while (valor != 0) {
                ct = valor / centavos[i];
                if (ct != 0) {
                    result = result + (ct + " moeda(s) de " + centavos[i]
                            + " centavo(s)\n");
                    valor = valor % centavos[i]; // sobra
                }
                i = i + 1;
            }

            return (result);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double conta, pago;

        System.out.printf("Informe o Valor: ");
        conta = ler.nextDouble();

        System.out.printf("Informe o Valor Pago: ");
        pago = ler.nextDouble();

        System.out.printf("%s", calculaTroco(conta, pago));

        ler.close();
    }
}
