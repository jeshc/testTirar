package ico.fes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String input = teclado.nextLine();
        System.out.println("Tecleaste :" + input);

    }
}