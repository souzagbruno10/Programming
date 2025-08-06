package javaFiasco.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class desafioNinjaFiasco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] nameNinja = new String[5];


        System.out.println("=======CADASTRO DE NINJAS=======");
        for (int i = 0; i < 5; i++) {
            int counter = i;


            System.out.println("Digite o nome do ninja " + counter + " :");
            nameNinja[i] = scanner.nextLine();

            System.out.println("Deseja sair?: [1] sim | [0] não: ");
            int choose = scanner.nextInt();
            scanner.nextLine(); //limpa o buffer

            if(choose == 1)
            {
                break;
            }
        }
            System.out.println("------------Ninjas Cadastrados-------------");
            System.out.print(Arrays.toString(nameNinja));

        }

    }


