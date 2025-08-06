package javaFiasco.Arrays;

public class Arrays {

    public static void main(String[] args) {

        String[] foods = new String[3];

        foods[0] = "pizza";
        foods[1] = "hamburguer";
        foods[2] = "pasta";

        for (int i = 0; i < 3; i++) {
            int count = i;
            System.out.println("Comida - " + count + ": " + foods[i]);
        }


    }
}
