package javaFiasco.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class desafioNinjaFiasco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nameNinja = new String[5];

        int option;

        do {

            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {

                case 1:

                    System.out.println("=======CADASTRO DE NINJAS=======");
                    int n;
                    System.out.println("Digite a quantidade de ninjas para cadastrar: ");
                    n = scanner.nextInt();

                    for (int i = 0; i < n; i++) {
                        System.out.println("Digite o nome do ninja " + i + " :");
                        nameNinja[i] = scanner.next();
                    }
                    break;
                case 2:

                    System.out.println("------------Ninjas Cadastrados-------------");
                    System.out.print(Arrays.toString(nameNinja));
                    break;
                case 3:

                    System.out.println("Deseja sair?: [1] sim | [0] não: ");
                    int choose = scanner.nextInt();

                    if (choose == 1) {
                        System.out.println("Saindo...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opção Inválida tente novamente!");
            }
        } while (true);
    }
}

