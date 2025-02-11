package ejercicio_5.main;

import ejercicio_5.interfaces.PiProvider;

public class Main {

    public static void main(String[] args) {

        PiProvider piProvider = () -> 3.1415;

        System.out.println("El valor de Pi es: " + piProvider.getPiValue());
    }
}


