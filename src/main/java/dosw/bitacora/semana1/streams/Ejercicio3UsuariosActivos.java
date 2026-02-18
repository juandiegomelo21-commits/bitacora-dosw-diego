package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3UsuariosActivos {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("1", "Juan", 25, true),
                new User("2", "Pedro", 30, false),
                new User("3", "Ana", 22, true),
                new User("4", "Maria", 17, true)
        );

        List<String> nombresActivos = users.stream()
                .filter(User::isActive)         // Solo activos
                .map(User::getName)             // Obtener nombre
                .map(String::toUpperCase)       // Convertir a mayúscula
                .sorted()                       // Ordenar
                .collect(Collectors.toList());

        System.out.println("Ejercicio 3 - Nombres Activos: " + nombresActivos);
    }
}