package javaFiasco.Loops;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        int n;
        char c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------");
        System.out.println("Digite o tamanho do quadrado: ");
        n = scanner.nextInt();
        System.out.println("Digite o caractere especial desejado: ");
        c = scanner.next().charAt(0);
        System.out.println("-------------------------------------------");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print( " " + c );
            }
            System.out.println();
        }
    }
}
