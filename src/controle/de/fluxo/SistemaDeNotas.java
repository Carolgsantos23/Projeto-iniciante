package controle.de.fluxo;

import java.util.Scanner;

public class SistemaDeNotas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Escreva um programa que receba uma nota de A a F e exiba a classificação:
        //
        //A = Excelente
        //
        //B = Bom
        //
        //C = Normal
        //
        //D = Ruim
        //
        //F = Reprovado
        //
        //Qualquer outra letra deverá exibir "Nota inválida".

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

