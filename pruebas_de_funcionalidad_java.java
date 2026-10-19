import java.util.Scanner;

public class pruebas_de_funcionalidad_java {
    
    public static Scanner teclado = new Scanner(System.in);

    public static void pruebaDoWhile (){
        String numero = "";
        do {
            System.out.println("KK");
            System.out.println("0 para salir");
            numero = teclado.nextLine();
        } while (numero != "0");

    }
    public static void main(String[] args) {
        pruebaDoWhile();
    }



}
