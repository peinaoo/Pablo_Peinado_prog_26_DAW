/**
 * Ejercicios_bucles_02
 */
import java.util.Scanner;

public class Ejercicios_bucles_02 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n===== EJERCICIOS DE BUCLES =====");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Ejercicio 6");
            System.out.println("7. Ejercicio 7");
            System.out.println("8. Ejercicio 8");
            System.out.println("9. Ejercicio 9");
            System.out.println("10. Ejercicio 10");
            System.out.println("11. Ejercicio 11");
            System.out.println("12. Ejercicio 12");
            System.out.println("13. Ejercicio 13");
            System.out.println("0. Salir");
            System.out.print("Elige un ejercicio: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

        teclado.close();
    }

    // EJERCICIO 1:
    // Diseñar un programa que pida un número por teclado y escriba
    // tantas líneas como diga el número. En cada línea escribirá
    // desde el número 1 hasta el número introducido.
    public static void ejercicio1() {

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // EJERCICIO 2:
    // Diseñar un programa que haga lo mismo que el anterior,
    // pero escribiendo los números en orden decreciente.
    public static void ejercicio2() {

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = numero; j >= 1; j--) {
                System.out.print(j);
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
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
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

        System.out.print("¿Cuántos números quieres introducir? ");
        int cantidad = teclado.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Introduce el número " + i + ": ");
            double numero = teclado.nextDouble();
            suma += numero;
        }

        double promedio = suma / cantidad;

        System.out.println("El promedio es: " + promedio);
    }

    // EJERCICIO 6:
    // Leer un número por teclado e indicar si es primo o no.
    // Los números primos solo son divisibles por sí mismos y por 1.
    public static void ejercicio6() {

        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        boolean primo = true;

        if (numero < 2) {
            primo = false;
        } else {
            for (int i = 2; i <= numero / i; i++) {
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numero + " es primo.");
        } else {
            System.out.println(numero + " no es primo.");
        }
    }

    // EJERCICIO 7:
    // Leer números enteros hasta teclear 0 y mostrar el máximo,
    // el mínimo y la media de todos ellos.
    // El 0 solo sirve para finalizar y no se cuenta.
    public static void ejercicio7() {

        int numero;
        int maximo = 0;
        int minimo = 0;
        int cantidad = 0;
        long suma = 0;

        System.out.println("Introduce números enteros (0 para terminar):");
        numero = teclado.nextInt();

        while (numero != 0) {

            if (cantidad == 0) {
                maximo = numero;
                minimo = numero;
            } else {
                if (numero > maximo) {
                    maximo = numero;
                }

                if (numero < minimo) {
                    minimo = numero;
                }
            }

            suma += numero;
            cantidad++;

            numero = teclado.nextInt();
        }

        if (cantidad == 0) {
            System.out.println("No has introducido ningún número.");
        } else {
            double media = (double) suma / cantidad;

            System.out.println("Máximo: " + maximo);
            System.out.println("Mínimo: " + minimo);
            System.out.println("Media: " + media);
        }
    }

    // EJERCICIO 8:
    // Implementar una calculadora simple con un menú de suma,
    // resta, multiplicación, división, comprobación de números
    // primos y salida. Repetir hasta seleccionar Salir.
    public static void ejercicio8() {

        int opcion;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Es primo");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();

            double numero1;
            double numero2;

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el primer número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = teclado.nextDouble();

                    System.out.println("Resultado: " + (numero1 + numero2));
                    break;

                case 2:
                    System.out.print("Introduce el primer número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = teclado.nextDouble();

                    System.out.println("Resultado: " + (numero1 - numero2));
                    break;

                case 3:
                    System.out.print("Introduce el primer número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = teclado.nextDouble();

                    System.out.println("Resultado: " + (numero1 * numero2));
                    break;

                case 4:
                    System.out.print("Introduce el primer número: ");
                    numero1 = teclado.nextDouble();
                    System.out.print("Introduce el segundo número: ");
                    numero2 = teclado.nextDouble();

                    if (numero2 == 0) {
                        System.out.println("No se puede dividir entre cero.");
                    } else {
                        System.out.println("Resultado: " + (numero1 / numero2));
                    }
                    break;

                case 5:
                    System.out.print("Introduce un número entero: ");
                    int numero = teclado.nextInt();

                    boolean primo = numero >= 2;

                    for (int i = 2; primo && i <= numero / i; i++) {
                        if (numero % i == 0) {
                            primo = false;
                        }
                    }

                    if (primo) {
                        System.out.println(numero + " es primo.");
                    } else {
                        System.out.println(numero + " no es primo.");
                    }
                    break;

                case 6:
                    System.out.println("Hasta pronto.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 6);
    }

    // EJERCICIO 9:
    // Pedir un DNI por teclado, dividir el número entre 23 y utilizar
    // el resto para calcular la letra correspondiente según la tabla.
    public static void ejercicio9() {

        System.out.print("Introduce el número del DNI: ");
        int dni = teclado.nextInt();

        if (dni < 0) {
            System.out.println("El DNI no puede ser negativo.");
            return;
        }

        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        char letra = letras.charAt(resto);

        System.out.println("DNI completo: " + dni + letra);
    }

    // EJERCICIO 10:
    // Solicitar una cadena y comprobar cuántas vocales tiene.
    // Utilizar charAt(i) para extraer cada carácter de la cadena.
    public static void ejercicio10() {

        teclado.nextLine(); // Limpiar el salto de línea pendiente.

        System.out.print("Introduce una cadena: ");
        String cadena = teclado.nextLine().toLowerCase();

        int vocales = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            if (caracter == 'a' || caracter == 'e'
                    || caracter == 'i' || caracter == 'o'
                    || caracter == 'u' || caracter == 'á'
                    || caracter == 'é' || caracter == 'í'
                    || caracter == 'ó' || caracter == 'ú'
                    || caracter == 'ü') {
                vocales++;
            }
        }

        System.out.println("Número de vocales: " + vocales);
    }

    // EJERCICIO 11:
    // Controlar el acceso a una caja fuerte con una combinación
    // de cuatro cifras. El usuario dispone de cuatro oportunidades.
    // Si falla, mostrar los intentos restantes; si acierta, indicar
    // que ha abierto la caja fuerte.
    public static void ejercicio11() {

        final int CLAVE = 1234;
        int intentos = 4;
        boolean abierta = false;

        while (intentos > 0 && !abierta) {

            System.out.print("Introduce la combinación de cuatro cifras: ");
            int claveIntroducida = teclado.nextInt();

            if (claveIntroducida == CLAVE) {
                abierta = true;
                System.out.println("Has abierto la caja fuerte.");
            } else {
                intentos--;

                if (intentos > 0) {
                    System.out.println(
                        "Clave incorrecta, le quedan "
                        + intentos + " intentos."
                    );
                } else {
                    System.out.println(
                        "Lo siento, has agotado las 4 oportunidades."
                    );
                }
            }
        }
    }

    // EJERCICIO 12:
    // Comprobar si dos números son amigos.
    // La suma de los divisores propios del primero debe ser el segundo,
    // y la suma de los divisores propios del segundo debe ser el primero.
    public static void ejercicio12() {

        System.out.print("Introduce el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = teclado.nextInt();

        if (numero1 <= 0 || numero2 <= 0) {
            System.out.println("Introduce números positivos.");
            return;
        }

        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i <= numero1 / 2; i++) {
            if (numero1 % i == 0) {
                suma1 += i;
            }
        }

        for (int i = 1; i <= numero2 / 2; i++) {
            if (numero2 % i == 0) {
                suma2 += i;
            }
        }

        if (suma1 == numero2 && suma2 == numero1) {
            System.out.println(numero1 + " y " + numero2 + " son amigos.");
        } else {
            System.out.println(numero1 + " y " + numero2 + " no son amigos.");
        }
    }

    // EJERCICIO 13:
    // Calcular un número determinado de elementos de la serie
    // de Fibonacci. Los dos primeros son 0 y 1; cada elemento
    // siguiente es la suma de los dos anteriores.
    public static void ejercicio13() {

        System.out.print("¿Cuántos elementos quieres mostrar? ");
        int cantidad = teclado.nextInt();

        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }

        int anterior = 0;
        int actual = 1;

        for (int i = 1; i <= cantidad; i++) {

            System.out.print(anterior);

            if (i < cantidad) {
                System.out.print(" ");
            }

            int siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }

        System.out.println();
    }
}
```