package ejercicio_3.main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> meses = Arrays.asList("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        meses.forEach(mes -> System.out.println(mes));
    }
}

