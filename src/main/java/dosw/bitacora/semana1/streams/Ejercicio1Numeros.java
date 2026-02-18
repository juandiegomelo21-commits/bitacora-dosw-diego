package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1Numeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 12, 14, 8, 20, 3, 9, 2);

        List<Integer> resultado = numeros.stream()
                .filter(n -> n > 10)       // Mayores a 10
                .filter(n -> n % 2 == 0)   // Pares
                .collect(Collectors.toList());

        System.out.println("Ejercicio 1 - Pares > 10: " + resultado);
    }
}