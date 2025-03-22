package controle.de.fluxo;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.println("Digite o primeiro numero:");
        int n1 = scanner.nextInt();

        System.out.println("Escolha seu operador logico: ");
        System.out.println();
        System.out.println(" Soma { + }");
        System.out.println("Subtração { - }");
        System.out.println("Multiplicação { * }");
        System.out.println("Divisão { / }");
        char operado = scanner.next().charAt(0);

        System.out.println("Digite o segundo numero: ");
        int n2 = scanner.nextInt();

        switch (operado) {

            case '+':
                System.out.println("A Soma dessa conta é: " + (n1 + n2));
                break;
            case '-':
                System.out.println("A Subtração dessa conta é: " + (n1 - n2));
                break;
            case '*':
                System.out.println("A Multiplicação dessa conta é: " + (n1 * n2));
                break;
            case '/':

                if (n2 != 0) {
                    System.out.println("A Divisão dessa conta é: " + (n1 / n2));
                } else
                    System.out.println("Erro: divisão por zero");
                break;
            default:
                System.out.println("Operador invalido");
                break;
        }
        scanner.close();
    }
}