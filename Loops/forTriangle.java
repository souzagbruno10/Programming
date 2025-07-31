package javaFiasco.Loops;

import java.util.Scanner;

public class forTriangle {

    public static void main(String[] args) {

        int n;
        int formula = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do triangulo: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++)
        {
            formula = (n - i); // aqui gera as linhas do triangulo...ex: 10 - 1, 10 - 2...

            for (int spaces = 1; spaces <= formula; spaces++) //regreesivo em relacao ao tamanho 10 - 1 = 9...
            {
                System.out.print(" ");
            }
                for (int j = 1; j <= (2 * i -1); j++)// 2 x 1 - 1 = qtd de caracter na linha, todos impares
                {
                    System.out.print("#");
                }
            System.out.println();
        }
    }
}
