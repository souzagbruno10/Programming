package javaFiasco.Scanner;

import java.util.Scanner;

public class UserScanner {

    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        System.out.println("--------------DADOS----------------");
        System.out.println("Escreva seu nome: ");
        String name = text.nextLine();
        System.out.println("Nome: " + name);

        System.out.println("Escreva sua idade: ");
        int age = text.nextInt();
        System.out.println("Idade: " + age);

        System.out.println("Escreva seu peso: ");
        double weight = text.nextDouble();
        System.out.println("Peso: " + weight);

        System.out.println("------------------------------------");


        text.close();

    }
}
