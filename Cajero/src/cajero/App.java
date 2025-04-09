package cajero;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static Cajero cajero = new Cajero();
    private static Seguridad seguridad = new Seguridad();

    public static void main(String[] args) {    
        System.out.println(Colores.ROJO + "|Bienvenido a su cajero de confianza|°👌");

        if (!validarIntentosPin()) {
            System.out.println(Colores.ROJO + "Ah, este parcero es un hacker, pisate de aquí ome.👿");
            return;
        }

        while(true){
            mostrarMenu();
            String entrada = scanner.nextLine();
int opcion;

try {
    opcion = Integer.parseInt(entrada);
} catch (NumberFormatException e) {
    System.out.println(Colores.ROJO + "Eso no es un número válido, ome." + Colores.RESET);
    continue;
}

            switch (opcion) {
                case 1:
                    cajero.consultarSaldo();
                    break;
                case 2:
                    cajero.depositar(scanner);
                    break;
                case 3:
                    cajero.retirar(scanner);
                    break;
                case 4:
                    seguridad.cambiarPin(scanner);
                    System.out.println("Tiene que colocarlo otra vez papito, apenas seas un pato 🦆");
                    if (!validarIntentosPin()) {
                        System.out.println(Colores.ROJO + "SOS UN ESPÍA. 😤");
                        return;
                    }
                    break;
                case 5:
                    System.out.println(Colores.ROJO + "Pisate de aquí ome, ya me dio fue rabia🤐" + Colores.RESET);
                    return;
                default:
                    System.out.println(Colores.AMARILLO + "Papito usted aparte de pobre aguevado😂" + Colores.RESET);
            }
        }
    }

    private static boolean validarIntentosPin() {
        int intentos = 0;

        while (intentos < 3) {
            System.out.println(Colores.VERDE + "Ingrese su pin, cuidado se lo pillan socio:");
            String pin = scanner.nextLine();

            if (seguridad.validarPin(pin)) {
                return true;
            } else {
                intentos++;
                System.out.println(Colores.ROJO + "PIN INCORRECTO. INTENTO " + intentos + " DE 3.");
            }
        }

        return false;
    }

    private static void mostrarMenu(){
        System.out.println("\n" + Colores.VERDE + "---|MENÚ|---" + Colores.RESET);
        System.out.println(Colores.AMARILLO + "1) Consulte su platica💸");
        System.out.println("2) Cosingar, depositar cash, dinero, billete📬");
        System.out.println("3) Retirar platica, chichigua🤑");
        System.out.println("4) Cambiar pin🧩");
        System.out.println(Colores.BLANCO + "5) Salir");
        System.out.println(Colores.BLANCO + "Elige una opción terroncito de azúcar" + Colores.RESET);
    }
}
