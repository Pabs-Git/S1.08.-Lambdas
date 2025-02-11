package ejercicio_6.main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> frases = Arrays.asList(
                "Hola mundo!",
                "Esto es el ejercicio 6 de Lambdas",
                "esta cadena es corta o larga?"
        );

        frases.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .forEach(System.out::println);
    }
}

