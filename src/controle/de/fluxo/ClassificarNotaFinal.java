package controle.de.fluxo;

import java.util.Scanner;

public class ClassificarNotaFinal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua nota final 0 a 100 :");
        int nota = scanner.nextInt();

        switch (nota) {
            case 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100:
                System.out.println("Sua nota é A");
                break;
            case 80, 81, 82, 83, 84, 85, 86, 87, 88, 89:
                System.out.println("Sua nota é B");
                break;
            case 70, 71, 72, 73, 74, 75, 76, 77, 78, 79:
                System.out.println("Sua nota é C");
                break;
            case 60, 61, 62, 63, 64, 65, 66, 67, 68, 69:
                System.out.println("Sua nota é D");
                break;
            default:
                if (nota < 60) {
                    System.out.println("Sua nota é F");
                } else
                    System.out.println("Nota inválida");
                break;
        }
        scanner.close();
    }
}