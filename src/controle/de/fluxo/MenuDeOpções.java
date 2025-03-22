package controle.de.fluxo;

import java.util.Scanner;

public class MenuDeOpções {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Selecione qual opção deseja escolher: ");
        System.out.println("1. Cadastrar usuário");
        System.out.println("2. Exibir usuário");
        System.out.println("3. Atualizar usuário");
        System.out.println("4. Deletar usuário");
        int escolha = scanner.nextInt();

        switch (escolha) {

            case 1:
                System.out.println("Cadastrar usuário");
                break;
            case 2:
                System.out.println("Exibir usuário");
                break;
            case 3:
                System.out.println("Atualizar usuário");
                break;
            case 4:
                System.out.println("Deletar usuário");
                break;
            default:
                System.out.println("numero inválido");
                break;

        }
        scanner.close();
    }
}
