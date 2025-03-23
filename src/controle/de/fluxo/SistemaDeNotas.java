package controle.de.fluxo;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota A, B, C, D, F: ");
        char nota = scanner.next().charAt(0);

        switch (nota) {

            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bom");
                break;
            case 'C':
                System.out.println("Normal");
                break;
            case 'D':
                System.out.println("Ruim");
                break;
            case 'F':
                System.out.println("Reprovado");
                break;
            default:
                System.out.println("Nota Invalida:");
        }
        scanner.close();


    }

}

