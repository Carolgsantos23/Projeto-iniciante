package controle.de.fluxo;

import java.util.Scanner;

public class CalculoDeDesconto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int descontoDinheiro = 10;
        int descontoDebito = 5;

        System.out.println("Valor da compra:");
        double compra = scanner.nextDouble();

        System.out.println("Qual a forma de pagamento:");
        System.out.println("1 - Dinheiro ");
        System.out.println("2 - Débito");
        System.out.println("3 - Crédito");
        int pg = scanner.nextInt();

        switch (pg) {

            case 1:
                System.out.println("Dinheiro (1O% DE DESCONTO): " + (compra * descontoDinheiro / 100));
                System.out.println("Total a pagar:" + (compra - (compra * descontoDinheiro / 100)));
                break;
            case 2:
                System.out.println("Débito (5% DE DESCONTO): " + (compra * descontoDebito / 100));
                System.out.println("Total a pagar:" + (compra - (compra * descontoDebito / 100)));
                break;
            case 3:
                System.out.println("Crédito (SEM DESCONTO): " + compra);
                break;
            default:
                System.out.println("Invalido");
                break;
        }
        scanner.close();
    }
}
