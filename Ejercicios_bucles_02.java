import java.sql.Time;
import java.util.Scanner;

public class Ejercicios_bucles_02 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException{
        Secuencia_fibonacci();
        
    }

    // EJERCICIO 1:
    // Diseñar un programa que pida un número por teclado y escriba
    // tantas líneas como diga el número. En cada línea escribirá
    // desde el número 1 hasta el número introducido.
    public static void ejercicio1() {

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {

            for (int j = 1; j <= i; j++) {
             System.out.print(j);
             
            }
            System.out.println("");
        }
       
    }

    // EJERCICIO 2:
    // Diseñar un programa que haga lo mismo que el anterior,
    // pero escribiendo los números en orden decreciente.
    public static void ejercicio2() {

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 0 ; j < numero; j++) {
                System.out.print(numero - j);
            }
            System.out.println();
        }
    }

    // EJERCICIO 3:
    // Diseñar un programa que imprima en la primera línea el número 1,
    // en la segunda el 1 y el 2, y así sucesivamente hasta llegar
    // al número introducido por teclado.
    public static void ejercicio3() {

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < numero; j++) {
                System.out.print(j);
            }
        }
    }

    // EJERCICIO 4:
    // Escribe todos los números del 100 al 0 de 7 en 7.
    // El enunciado indica 100, 93, 86... hasta 0.
    public static void ejercicio4() {

        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }

        // Restando 7 sucesivamente desde 100 se llega a 2,
        // no a 0. Se muestran todos los valores de esa secuencia.
    }

    // EJERCICIO 5:
    // Preguntar cuántos números se quieren leer, leer esa cantidad
    // de números y calcular el promedio de los valores introducidos.
    public static void ejercicio5() {
        double suma = 0;
        int cantidad = 0;
        

        System.out.print("¿Cuántos números quieres introducir? ");
        
        cantidad = teclado.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            
        }
        else{

            for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double numero = teclado.nextDouble();
            suma = suma + numero;
            }

        }

        double promedio = suma / cantidad;  

        System.out.println("El promedio es: " + promedio);
    }

    // EJERCICIO 6:
    // Leer un número por teclado e indicar si es primo o no.
    // Los números primos solo son divisibles por sí mismos y por 1.
    public static void ejercicio6() {
        int recuento_divisibles = 0;
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        



        for (int i = 1; i <= numero; i++) {
            int resto = numero%i;
            if (resto == 0){
                recuento_divisibles = recuento_divisibles + 1;
            }
        }

        if (recuento_divisibles == 2) {
            System.out.println("El numero es primo");
        }
        else{
            System.out.println("El numero no es primo");
        }

    }

        

    // EJERCICIO 7:
    // Leer números enteros hasta teclear 0 y mostrar el máximo,
    // el mínimo y la media de todos ellos.
    // El 0 solo sirve para finalizar y no se cuenta.
    public static void ejercicio7() {
        int numero;
        int suma = 0;
        int contador = 0;
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;

        do {
            System.out.print("Introduce un número (0 para terminar): ");
            numero = teclado.nextInt();

            if (numero != 0) {
                if (contador == 0) {
                    maximo = numero;
                    minimo = numero;
                } else {
                    if (numero > maximo) maximo = numero;
                    if (numero < minimo) minimo = numero;
                }

                suma += numero;
                contador++;
            }

        } while (numero != 0);

        if (contador > 0) {
            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + (double) suma / contador);
        } else {
            System.out.println("No has introducido ningún número.");
        }
    } 

    /*Ejercicio 9: Diseña un programa que calcule la letra de un DNI. Para ello: 
    o 1º Pediremos el DNI por teclado al usuario. 
    o 2º Para calcular la letra, cogeremos el DNI y lo dividiremos entre 23 quedándonos con el 
    resto de la división, que debe estar entre 0 y 22. 
    o Comprobaremos en la siguiente tabla, en función del resto obtenido en el paso anterior, cuál 
    es la letra que corresponde*/

    public static void ejercicio9 (){

        int numero_dni = 0;

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra_asignada = "";
        System.out.println("Introduce el numero del DNI: ");


        numero_dni = teclado.nextInt();

        String numero_dni_cadena = String.valueOf(numero_dni);

        if (numero_dni_cadena.length() == 7) {

            int resto = numero_dni%7;

            for (int i = 0; i <= 22; i++) {
                
                if (resto == i) {

                    char letra_DNI = letras.charAt(i);
                    letra_asignada = String.valueOf(letra_DNI);

                }

            }
            System.out.println(letra_asignada);
            
        }




    } 

    /*Ejercicio 13: Realiza un algoritmo que permita calcular un número determinado de elementos de la
    serie de Fibonacci, teniendo en cuenta que cada uno es la suma de los dos elementos anteriores, con
    la excepción de los dos primeros, que son 0 y 1. Así, la serie estaría formada por los números: 0, 1, 1,
    2, 3, 5, 8, 13, 21… */
    public static void Secuencia_fibonacci() throws InterruptedException {

        int numero_inicial = 1;
        int numero_siguiente = 0;
        
        int numero_anterior = 1;  

        System.out.print(0 + ", " + 1 + ", " + 1 + ", "); 
        
        boolean parar_recuento = false;

        

         while (parar_recuento == false) {

            
            numero_siguiente = numero_inicial + numero_anterior; // numero siguiente se transforma en n2 = n1 + n0

             //n2
            System.out.print(numero_siguiente + ", "); 

            numero_anterior = numero_inicial; // n0 = n1

            numero_inicial = numero_siguiente;   // n1 = n2
            
            Thread.sleep(500);
            
         }
        


    }

    public static void ejercicio13 (){


        

        boolean puerta = false;


        
        while (puerta == false) {

             

            

            
            
        }



    }



















 
}
