package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2Palabras {
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Java", "Stream", "Code", "Bitacora", "Spring", "Git", "Web");

        long cantidad = palabras.stream()
                .filter(p -> p.length() > 4)    // Más de 4 caracteres
                .map(String::toUpperCase)       // Convertir a mayúsculas
                .sorted()                       // Ordenar alfabéticamente
                .peek(System.out::println)      // (Opcional) Ver el flujo
                .count();                       // Contar total

        System.out.println("Ejercicio 2 - Cantidad total: " + cantidad);
    }
}