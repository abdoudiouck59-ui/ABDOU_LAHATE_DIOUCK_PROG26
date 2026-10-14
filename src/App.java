import java.util.Scanner;

    public class App {

    static Scanner sc = new Scanner(System.in);

    
         /**
         * Ejercicio 1:  Realizar un programa que imprima en pantalla los números del 1 al 100.
         *  (Debes hacerlo con las tres estructuras iterativas vistas: while, do while y for). 
         */
    public static void ejercicio1() {

        System.out.println("Ejercicio 1: Imprimir números del 1 al 100");

        // Usando while
        int i = 1;

        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        // Usando do while
        i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 100);

        System.out.println();

        // Usando for
        for (i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }




    /**
     * Ejercicio 2: : Escribir un programa que solicite un valor positivo y nos muestre desde 1 hasta el valor ingresado de uno en uno. 
     */
    public static void ejercicio2() {
    System.out.println("Ejercicio 2: Mostrar números desde 1 hasta un valor positivo ingresado");

    int valor;

    do {
        System.out.print("Ingrese un valor positivo: ");
        valor = sc.nextInt();
    } while (valor <= 0);

    for (int i = 1; i <= valor; i++) {
        System.out.print(i + " ");
    }

    System.out.println();
}
/**
 * Ejercicio 3: Desarrollar un programa que permita la carga de 10 valores por teclado y nos muestre posteriormente la suma de los valores ingresados y su promedio. 
 */
public static void ejercicio3() {
    System.out.println("Ejercicio 3: Cargar 10 valores y mostrar la suma y el promedio");

    int suma = 0;
    int cantidad = 10;

    for (int i = 1; i <= cantidad; i++) {
        System.out.print("Ingrese el valor " + i + ": ");
        int valor = sc.nextInt();
        suma += valor;
    }

    double promedio = (double) suma / cantidad;

    System.out.println("La suma de los valores ingresados es: " + suma);
    System.out.println("El promedio de los valores ingresados es: " + promedio);
}
    /**
     * Ejercicio 4: Diseña una aplicación o programa que consista en lo siguiente:  Guarda en una variable tu nombre. Pide al usuario que intente adivinar tu nombre pidiendo que lo introduzca por teclado.  El programa finaliza cuando el usuario adivina tu nombre. Sino el programa debe continuar pidiendo al usuario que lo intente otra vez. 
     */
    public static void ejercicio4() {
        System.out.println("Ejercicio 4: Adivina mi nombre");
        String miNombre = "Juan";
        String nombreUsuario;

        do {
            System.out.print("Intenta adivinar mi nombre: ");
            nombreUsuario = sc.next();
        } while (!nombreUsuario.equals(miNombre));

        System.out.println("¡Correcto! Has adivinado mi nombre.");
    }

    /**
     * Ejercicio 5: Diseña una aplicación que simule la tirada de dos dados y muestre al usuario el resultado de la tirada. 
     * Si los dos dados tienen el mismo número debe mostrar un mensaje indicando que el resultado es el mismo.
     *  La aplicación se debe repetir hasta que el usuario indique que no quiere tirar más (preguntando por ‘s’ o ‘n’, o “si” o “no”). 
     */
    public static void ejercicio5() {
        System.out.println("Ejercicio 5: Simulación de tirada de dos dados");
        String respuesta;

        do {
            int dado1 = (int) (Math.random() * 6) + 1;
            int dado2 = (int) (Math.random() * 6) + 1;

            System.out.println("Resultado de la tirada: Dado 1 = " + dado1 + ", Dado 2 = " + dado2);

            if (dado1 == dado2) {
                System.out.println("¡Los dos dados tienen el mismo número!");
            }

            System.out.print("¿Desea tirar los dados nuevamente? (s/n): ");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("Gracias por jugar. ¡Hasta luego!");
    }

    /**
     * Ejercicio 6: Realizar un juego para adivinar un número. Para ello primero, el programa debe guardar un número en una variable y el usuario debe introducir números hasta acertarlos. 
     * Para darle pistas al usuario se le indicará “mayor” o “menor” según sea mayor o menor con respecto al número guardado.
     *  El proceso termina cuando el usuario acierta. 
     */
    public static void ejercicio6() {
        System.out.println("Ejercicio 6: Juego para adivinar un número");
        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int intento;

        do {
            System.out.print("Adivina el número (entre 1 y 100): ");
            intento = sc.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        } while (intento != numeroSecreto);

    }

    /**
     * Diseña una aplicación que simule un reloj digital que muestre la hora sin parar. 
     * . Debe esperar un segundo real para darle más realismo. Pasos: Pide al usuario que introduzca la hora y los minutos. , Inicializa el reloj a esa hora con esos minutos y 0 segundos. , Cada vez que transcurra un segundo incrementa la hora comprobando si hay cambio de minuto y hora , Muéstralo por pantalla.
     * (Nota: La función Thread.sleep(1000) hace que la aplicación se interrumpa durante 1000 milisegundos = 1 segundo). 
     */
    public static void ejercicio7() {
        System.out.println("Ejercicio 7: Simulación de un reloj digital");
        System.out.print("Ingrese la hora (0-23): ");
        int hora = sc.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        int minutos = sc.nextInt();

        int segundos = 0;

        while (true) {
            System.out.printf("%02d:%02d:%02d\n", hora, minutos, segundos);
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
                if (minutos == 60) {
                    minutos = 0;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
        }
    }
    
    /**
     * Ejercicio 8: Escriba un programa que calcule el factorial de un número. 
     * El factorial de un número es igual al producto de todos los números enteros positivos desde 1 hasta dicho número. 
     */
    public static void ejercicio8() {
        System.out.println("Ejercicio 8: Calcular el factorial de un número");
        System.out.print("Ingrese un número entero positivo: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
            return;
        }

        long factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    /**
     * Ejercicio 9: Escriba un programa que dibuje una escalera de asteriscos. 
     *  La altura de la escalera se lee por teclado. 
     *  Ejemplo: Si introducimos un 5 nos queda: 
* 
** 
*** 
**** 
***** 
Posteriormente hacer lo mismo, pero con la pirámide invertida.
     */
    public static void ejercicio9() {
        System.out.println("Ejercicio 9: Dibujar una escalera de asteriscos");
        System.out.print("Ingrese la altura de la escalera: ");
        int altura = sc.nextInt();

        // Escalera normal
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Escalera invertida
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  



        }    }
       public static void main(String[] args) {
             ejercicio1(); 
             ejercicio2(); 
             ejercicio3();
             ejercicio4(); 
             ejercicio5(); 
             ejercicio6(); 
             ejercicio7(); 
             ejercicio8(); 
             ejercicio9(); 

        }
    }
            
