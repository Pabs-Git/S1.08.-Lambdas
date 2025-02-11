package ejercicio_8.main;

import ejercicio_8.interfaces.StringReverser;

public class Main {

    public static void main(String[] args) {

        StringReverser reversedWord = (s) -> new StringBuilder(s).reverse().toString();

        String result = reversedWord.reverse("Hola mundo");

        System.out.println(result);
    }
}

