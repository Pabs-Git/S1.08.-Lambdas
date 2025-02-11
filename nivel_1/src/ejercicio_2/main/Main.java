package ejercicio_2.main;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hola", "pasaporte", "mundo", "java", "contenedor", "stream", "lambda");

        List<String> result = strings.stream().filter(s -> s.contains("o") && s.length() >= 5).collect(Collectors.toList());

        System.out.println(result);
    }
}
