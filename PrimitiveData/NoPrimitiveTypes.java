package javaFiasco.PrimitiveData;

public class NoPrimitiveTypes {

    public static void main(String[] args) {

        /*Dados não primitivos: String, Array, class, enum
        * recebem métodos;
        * */

        String name = "Dexter";
        String catName = name.toUpperCase();
        System.out.println("CAPSLOCK: " + catName);
        System.out.println(name);

        System.out.println("---------------------------------------");

        String race = "VIRA-LATA";
        String raceLow = race.toLowerCase();
        System.out.println(raceLow);
        System.out.println(race);
    }
}
