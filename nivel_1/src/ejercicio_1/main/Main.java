package ejercicio_1.main;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("hola", "mundo", "java", "stream", "lambda");

        List<String> result = strings.stream().filter(s -> s.contains("o")).collect(Collectors.toList());

        System.out.println(result);
    }
}
