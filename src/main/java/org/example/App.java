package org.example;

import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 */
public class App {

    public boolean esPalindromo() {
        String txt = "reconocer";
        int palabra = txt.length() - 1;
        for (int i = 0, j = palabra; i <= j; i++, --j) {
            if (txt.charAt(i) == txt.charAt(j)) {

            } else {
                System.out.println("NO ES UN PALINDROMO");
                return false;
            }
        }
        System.out.println("ES PALINDROMO");
        return true;
    }

    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */
    public void fizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz");
                continue;
            } else if (i % 3 == 0) {
                System.out.println("fizz");
                continue;
            } else if (i % 5 == 0) {
                System.out.println("buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */

    public boolean esAnagrama(String word1, String word2) {

        char[] tex1 = word1.toLowerCase().toCharArray();
        char[] tex2 = word2.toLowerCase().toCharArray();
        Arrays.sort(tex1);
        Arrays.sort(tex2);
        if (word1.equals(word2)) {
            System.out.println("Son la misma palabra. Dos palabras iguales no son un anagrama");
            return false;
        }
        if (Arrays.equals(tex1, tex2)) {
            System.out.println("Es un anagrama.");
            System.out.println("Letras de la primera palabra: " + Arrays.toString(tex1) + "\n" +
                    "Letras de la segunda palabra: " + Arrays.toString(tex2));
            return true;
        }
        System.out.println("NO ES ANAGRAMA");
        System.out.println("Letras de la primera palabra: " + Arrays.toString(tex1) + "\n" +
                "Letras de la segunda palabra: " + Arrays.toString(tex2));
        return false;
    }

    /*
     * Reto #2
     * LA SUCESIÓN DE FIBONACCI
     * Fecha publicación enunciado: 10/01/22
     * Fecha publicación resolución: 17/01/22
     * Dificultad: DIFÍCIL
     *

     *
     * Información adicional:
     * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
     * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
     * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
     * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
     *
     */

    public void sucesionFibonacci(){
        long primero = 0;
        long segundo = 1;
        System.out.println("Los primeros 50 números de la sucesión de Fibonacci son:");
        System.out.println("0) " + primero);
        for (int i = 1; i < 50; i++) {
            System.out.println(i+") "+ segundo);
            long siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}