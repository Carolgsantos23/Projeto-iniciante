package controle.de.fluxo;

import java.util.Scanner;

public class EscolhaUmNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Escola um nomero de 1 a 5:");
        int num = scanner.nextInt();

        switch (num){

            case 1:
                System.out.println("Você digitou o numero UM - 1");
                break;
            case 2:
                System.out.println("Você digitou o numero DOIS - 2");
                break;
            case 3:
                System.out.println("Você digitou o numero TRÊS - 3");
                break;
            case 4:
                System.out.println("Você digitou o numero QUATRO - 4");
                break;
            case 5:
                System.out.println("Você digitou o numero CINCO - 5");
                break;
            default:
                System.out.println("Numero invalido:");
        }
        scanner.close();
    }
}