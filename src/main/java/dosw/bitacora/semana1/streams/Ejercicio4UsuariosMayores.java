package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio4UsuariosMayores {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("1", "Juan", 25, true),
                new User("2", "Pedro", 30, false),
                new User("3", "Ana", 22, true),
                new User("4", "Maria", 17, true)
        );

        List<String> mayoresDeEdad = users.stream()
                .filter(u -> u.getAge() >= 18)  // Filtrar edad >= 18
                .map(User::getName)             // Obtener solo el nombre
                .collect(Collectors.toList());

        System.out.println("Ejercicio 4 - Mayores de edad: " + mayoresDeEdad);
    }
}