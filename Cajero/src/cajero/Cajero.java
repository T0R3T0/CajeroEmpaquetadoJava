package cajero;

import java.util.Scanner;

public class Cajero {
    private double saldo = 300.000;

    public void consultarSaldo(){
        System.out.println("Tienes disponible: $💸" + saldo);
    }
    public void retirar(Scanner scanner){
        System.out.println("¿Cuanta chichigua quieres derrochar?");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();
        if(cantidad <= saldo){
            saldo -= cantidad;
            System.out.println("Retiro éxitoso papito, ahora de party🥳"); 
        }else{
            System.out.println("Pero este parcero aparte de pobre,aguevado😒");
        }
    }

    public void depositar(Scanner scanner){
        System.out.println("¿Cuanto billete quieres depositar?💸💸");
        double cantidad = scanner.nextDouble();
        scanner.nextLine();
        saldo += cantidad;
        System.out.println("Acabaste de regalar tu platica, sinceramente usted si es muy ague...Déposito éxitoso. Tienes: $" + saldo);
    }

}
