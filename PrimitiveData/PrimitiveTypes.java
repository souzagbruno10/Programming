package javaFiasco.PrimitiveData;

public class PrimitiveTypes {

    public static void main(String[] args) {
        //tipos primitivos não recebem metódos

        char firstLetter = 'B';
        int intMax = 2147483647;
        double dolar = 500.0;
        boolean dev = true;
        Long futureEarns = 34555768797L;

        System.out.println("A primeira letra do meu nome é " + firstLetter );
        System.out.println("O maior número inteiro é " + intMax);
        System.out.println("Eu ganho " + dolar + " $ dolares como dev na gringa: " + dev );
        System.out.println("Pretendo ganhar " + futureEarns );
    }
}
