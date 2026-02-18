package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5Transacciones {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", 100.0, true),
                new Transaction("T2", 50.0, false), // Esta hará fallar el lote
                new Transaction("T3", 200.0, true)
        );

        // Lógica: El lote es válido solo si TODAS están aprobadas.
        // Usamos anyMatch para buscar si hay ALGUNA rechazada.
        boolean hayRechazadas = transactions.stream()
                .peek(t -> System.out.println("Procesando: " + t)) // Ver cada transacción
                .anyMatch(t -> !t.isApproved()); // ¿Existe alguna NO aprobada?

        boolean esLoteValido = !hayRechazadas;

        System.out.println("Ejercicio 5 - ¿El lote es válido?: " + esLoteValido);
    }
}