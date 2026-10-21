import java.util.Scanner;

public class Ejercicios_bucles_03 {

    public static Scanner teclado = new Scanner(System.in);
    /*Ejercicio 5: Crea un programa que pida al usuario un número entero positivo y calcule la suma de
    todos los números primos hasta ese número.
    ejercicio*/

    public static int calcularNumeroPrimo (int numero_introducido){

        int suma_primos = 0;
    
        for (int i = 2; i < numero_introducido; i++) {

            int resultado_divisores = numero_introducido%i;
            if (resultado_divisores == 0) {
                
                for (int j = 1; j < i; j++) {

                    int resultado_divisores_divisor = i%j;
                    if (resultado_divisores_divisor == 2) {
                        suma_primos = suma_primos + i;
                    }
                    
                }
                
            }   
            
        }
        return suma_primos;
        
    }


    public static void ejercicio_05(){

        int respuesta_numero = 0;
        boolean respuesta_es_valida = false;

        do {
            System.out.println("Introduce un numero entero: ");
            if (teclado.hasNextInt()) {
                respuesta_numero = teclado.nextInt();
                respuesta_es_valida = true;
            }
            else{
                System.out.println("El numero introducido no es válido");
            }
        } while (respuesta_es_valida = false);
        
        
        System.out.println("La suma de los numeros primos es: " +  calcularNumeroPrimo(respuesta_numero));

        
    }


    public static void main(String[] args) {
        ejercicio_05();
    }
}
