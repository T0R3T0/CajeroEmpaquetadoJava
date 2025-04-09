package cajero;
import java.util.Scanner;

public class Seguridad {
    private String pinCorrecto = "0101";

    public boolean validarPin(String pinIngresado){
        return pinCorrecto.equals(pinIngresado);
    }

    public void cambiarPin(Scanner scanner){
        System.out.print("Dame tu pin nuevo(Es confidencial🤫):");
        String nuevoPin = scanner.nextLine();
        pinCorrecto = nuevoPin;
        System.out.println("Cambio de pin éxitoso, no se le olvide otra vez papito🥳");
    }

}
