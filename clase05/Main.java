package clase05;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Calculadora edad de perros
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad del perro para saber cuantos años humanos tiene: ");
        int edad = scanner.nextInt();
        int edadHumana = edad * 7;
        System.out.println("Su perro tiene " + edadHumana + " años humanos.");

        // 2. Conversor de millas a kilómetros
        System.out.print("Ingrese la cantidad de millas: ");
        Double mill = scanner.nextDouble();

        Double millasKm = mill * 1.60934;
        System.out.println("La cantidad de millas: " + mill + ", equivalen a: " + millasKm + "Km");

        // 3. Calculadora de descuento:
        System.out.print("Ingrese el precio del producto: ");
        Double precioFinal = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        Double descuento = scanner.nextDouble();

        Double valorConDescuento = precioFinal * (descuento / 100);
        System.out.println("El valor del producto con descuento es de: $" + valorConDescuento);

        // 4. Calculadora de propinas
        System.out.print("Ingrese el valor de la cuenta: ");
        Double valorCuenta = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina: ");
        Double porcPropina = scanner.nextDouble();

        Double propina = valorCuenta * (porcPropina / 100);

        System.out.println("El valor de la propina es: $" + propina);

        // 5. Juego de adivinar el número
        Random random = new Random();
        Integer numeroAleatorio = random.nextInt(100) + 1;

        System.out.println(numeroAleatorio);

        System.out.print("Adivine el número: ");
        Integer number = scanner.nextInt();

        while (number != numeroAleatorio){
            System.out.print("Intentelo de nuevo, adivine el número: ");
            number = scanner.nextInt();
        }

        System.out.println("Muy bien, adivinaste el número, era el: " + number);


        scanner.close();





    }
}
