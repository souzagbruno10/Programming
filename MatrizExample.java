package javaFiasco.Matriz;

public class MatrizExample {
    public static void main (String args[]){

        String[][] devices = new String[3][3];

        devices[0][0] = "notebook"; //primeiro colchete é a linha, o segundo é a coluna;
        devices[0][1] = "smartphones";
        devices[0][2] = "smartwatch";

        devices[1][0] = "pc";
        devices[1][1] = "pendrive";
        devices[1][2] = "tablet";

        devices[2][0] = "jammer";
        devices[2][1] = "switch";
        devices[2][2] = "router";

        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i][0]);
        }
    }
}
