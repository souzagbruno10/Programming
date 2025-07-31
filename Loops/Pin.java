package javaFiasco.Loops;

public class Pin {

    public static void main(String[] args) {

        for (int i = 1; i <= 40; i++)
        {
            if (i % 4 == 0)
            {
                System.out.println(" PIN");
            }
            else
            {
                System.out.print( " "  + i + " - " );
            }
        }
    }
}
