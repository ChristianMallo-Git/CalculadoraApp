import java.util.Scanner;

public class CalculadoraApp {

    public static void main(String[] args) {

        System.out.println(" **** Aplicación Calculadora **** \n");
        mostrarMenu();
        System.out.println("Seleccione el número de la operación que desea realizar = ");
        seleccionarMenu();

    }

    public static void mostrarMenu() {

        System.out.println("1.Sumar 2.Restar 3.Multiplicar 4.Dividir 5.Apagar \n");
    }

    public static void seleccionarMenu() {

        try {
            Scanner consola = new Scanner(System.in);
            int numero = consola.nextInt();
            if (numero >= 1 && numero <= 5) {

                switch (numero) {

                    case 1:
                        sumar();
                        break;
                    case 2:
                        restar();
                        break;
                    case 3:
                        multiplicar();
                        break;
                    case 4:
                        dividir();
                        break;
                    case 5:
                        salir();
                        break;
                }
            } else {
                System.out.println("Número no válido " + "\n");
                mostrarMenu();
                System.out.println("Seleccione el número de la operación que desea realizar = " + "\n");
                seleccionarMenu();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ocurrió un error: " + e.getMessage() + "\n");
            System.out.println(" **** Aplicación Calculadora **** \n");
            mostrarMenu();
            System.out.println("Seleccione el número de la operación que desea realizar = ");
            seleccionarMenu();
        }
    }

    public static void sumar() {
        System.out.println("Introduce el primer número= ");
        Scanner consola = new Scanner(System.in);
        double numero1 = consola.nextDouble();
        System.out.println("Introduce el segundo número= ");
        double numero2 = consola.nextDouble();
        double resultado = numero1 + numero2;
        System.out.println("El resultado de la suma ha sido = " + resultado + "\n");
        System.out.println("¿Que operación desea realizar? \n");
        mostrarMenu();
        System.out.println("Seleccione el número de la operación que desea realizar = ");
        seleccionarMenu();

    }

    public static void restar() {
        System.out.println("Introduce el primer número= ");
        Scanner consola = new Scanner(System.in);
        double numero1 = consola.nextDouble();
        System.out.println("Introduce el segundo número= ");
        double numero2 = consola.nextDouble();
        double resultado = numero1 - numero2;
        System.out.println("El resultado de la resta ha sido = " + resultado + "\n");
        System.out.println("¿Que operación desea realizar? \n");
        mostrarMenu();
        System.out.println("Seleccione el número de la operación que desea realizar = ");
        seleccionarMenu();
    }

    public static void multiplicar() {
        System.out.println("Introduce el primer número= ");
        Scanner consola = new Scanner(System.in);
        double numero1 = consola.nextDouble();
        System.out.println("Introduce el segundo número= ");
        double numero2 = consola.nextDouble();
        double resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación ha sido = " + resultado + "\n");
        System.out.println("¿Que operación desea realizar? \n");
        mostrarMenu();
        System.out.println("Seleccione el número de la operación que desea realizar = ");
        seleccionarMenu();

    }

    public static void dividir() {
        System.out.println("Introduce el primer número= ");
        Scanner consola = new Scanner(System.in);
        double numero1 = consola.nextDouble();
        System.out.println("Introduce el segundo número=3 ");
        double numero2 = consola.nextDouble();
        double resultado = numero1 / numero2;
        System.out.println("El resultado de la división ha sido = " + resultado + "\n");
        System.out.println("¿Que operación desea realizar? \n");
        mostrarMenu();
        System.out.println("Seleccione el número de la operación que desea realizar = ");
        seleccionarMenu();
    }

    public static void salir() {
        System.out.println("Calculadora apagada");
    }
}
