package dosw.bitacora.semana2.solid;

// --- 1. INTERFAZ ---
interface Operation {
    double execute(double a, double b);
}

// --- 2. OPERACIONES (SRP) ---
class Suma implements Operation {
    public double execute(double a, double b) { return a + b; }
}

class Resta implements Operation {
    public double execute(double a, double b) { return a - b; }
}

class Multiplicacion implements Operation {
    public double execute(double a, double b) { return a * b; }
}

class Division implements Operation {
    public double execute(double a, double b) {
        if(b==0) throw new ArithmeticException("Div by Zero");
        return a / b;
    }
}

// --- 3. CALCULADORA (OCP) ---
class Calculator {
    public double calculate(Operation op, double a, double b) {
        return op.execute(a, b);
    }
}

// --- 4. CLASE PRINCIPAL ---
public class Ejercicio4Solid {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 4: SOLID ===");
        Calculator calc = new Calculator();
        System.out.println("Suma: " + calc.calculate(new Suma(), 10, 5));
        System.out.println("Div: " + calc.calculate(new Division(), 10, 2));
    }
}