package javaFiasco.Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        int password;

        Scanner scanner = new Scanner(System.in);

        do
        {
            System.out.println("Digite a senha de acesso: ");
            password = scanner.nextInt();
            System.out.println("-------------------------------------------");
            if(password == 1234)
            {
                System.out.println("Acesso Autorizado!");
            }
            else
            {
                System.out.println("Acesso Negado!");
            }

        } while (password != 1234);
        }
    }

