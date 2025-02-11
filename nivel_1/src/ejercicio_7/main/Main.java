package ejercicio_7.main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> frases = Arrays.asList(
                "Hola mundo!",
                "Esto es el ejercicio 6 de Lambdas",
                "esta cadena es corta o larga?"
        );

        frases.stream()
                .sorted((s1, s2) -> Integer.compare(s2.length(),s1.length()))
                .forEach(System.out::println);
    }
}

