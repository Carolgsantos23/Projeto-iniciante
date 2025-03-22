package controle.de.fluxo;

import java.util.Scanner;

public class EstaçãoDoAno {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma estação do ano Favorita:");
        System.out.println("1 = Verão");
        System.out.println("2 = Outono");
        System.out.println("3 = Inverno");
        System.out.println("4 = Primavera");
        int nu = scanner.nextInt();

        switch (nu) {

            case 1:
                System.out.println("Você escolheu verão");
                break;
            case 2:
                System.out.println("Você escolheu outono");
                break;
            case 3:
                System.out.println("Você escolheu inverno");
                break;
            case 4:
                System.out.println("você escolheu primavera");
                break;
            default:
                System.out.println("numero invalido");
                break;
        }
        scanner.close();
    }
}
