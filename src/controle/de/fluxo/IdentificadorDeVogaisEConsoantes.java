package controle.de.fluxo;

import java.util.Scanner;

public class IdentificadorDeVogaisEConsoantes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra:");
        char letra = scanner.next().charAt(0);

        switch (letra) {

            case 'a', 'e', 'i', 'o', 'u':
                System.out.println(letra + " é uma vogal.");
                break;
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y',
                 'z':
                System.out.println(letra + " é uma Consoante");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
        scanner.close();
    }
}