package controle.de.fluxo;

import java.util.Scanner;

public class ClassificaçãoPorIdade {
    public static void main(String[] args) {

        //Faça um programa que recebe a idade de uma pessoa e classifique-a em:

        Scanner scanner = new Scanner(System.in);

        System.out.println("Classificação de Idade");
        System.out.println("Qual sua idade: ");
        int idade = scanner.nextInt();

        switch (idade) {

            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12:
                System.out.println("Você é uma criança");
                break;
            case 13, 14, 15, 16, 17:
                System.out.println("Você é um adolecente");
                break;
            default:
                if (idade >= 18 && idade <= 59) {
                    System.out.println("Você é adulto");
                } else if (idade >= 60) {
                    System.out.println("Você é idoso");
                } else {
                    System.out.println("Inválido");
                }
        }
        scanner.close();
    }
}