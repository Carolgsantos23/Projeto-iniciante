package controle.de.fluxo;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {


        //Dia da semana

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual Dia da semana?");
        System.out.println();
        System.out.println("Digite um numero de 1 a 7");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido");
        }
        scanner.close();
    }
}
