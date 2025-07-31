package javaFiasco.SwitchCase;

import java.util.Scanner;

public class Choose {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("============TokTakeSoda==============");
        System.out.println("Escolha seu refrigerante: ");
        System.out.println("[1] - Coca");
        System.out.println("[2] - Fanta-uva");
        System.out.println("[3] - Guaraná");
        System.out.println("[4] - Fanta-Laranja");
        System.out.println("[5] - Tubaína");
        System.out.println("[6] - Guaraná Jesus");
        System.out.println("[7] - Dolly Guaraná");
        System.out.println("[8] - Pepsi");
        System.out.println("[9] - Sprite");
        System.out.println("[10] - Monster");
        int option = scanner.nextInt();
        System.out.println("--------------------------------------------");

        switch (option)
        {
            case 1:
                System.out.println("Coca-Cola");
                break;

            case 2:
                System.out.println("Fanta-uva");
                break;

            case 3:
                System.out.println("Guaraná");
                break;

            case 4:
                System.out.println("Fanta-Laranja");
                break;

            case 5:
                System.out.println("Tubaína");
                break;

            case 6:
                System.out.println("Guaraná-Jesus");
                break;

            case 7:
                System.out.println("Dolly-Guarná");
                break;

            case 8:
                System.out.println("Pepsi");
                break;

            case 9:
                System.out.println("Sprite");
                break;

            case 10:
                System.out.println("Monster");
                break;

            default:
                System.out.println("Opcao Inexistente");
        }
        System.out.println("--------------------------------------------");
        System.out.println("Volte Sempre!");

    }
}
