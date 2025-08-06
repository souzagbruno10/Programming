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

        System.out.println("---------------------------------------------------------------------");

        String[] musics = new String[5];

        musics[0] = "Espadas y Serpentes";
        musics[1] = "Hacelo por Mi";
        musics[2] = "Vuelve a casa";
        musics[3] = "America";
        musics[4] = "El Cielo puede esperar";

        for (int i = 0; i < 5; i++){
            int counter = i;
            System.out.println(counter + " - Música do A77aque que eu mais gosto: " + musics[i]);
        }
    }
// se sobrescrita a variavel do array ja criado em um novo tipo, o garbage collector apaga os dados anteriores da
//memoria.
}
