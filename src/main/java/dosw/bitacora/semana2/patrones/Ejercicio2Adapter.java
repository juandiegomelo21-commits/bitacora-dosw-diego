package dosw.bitacora.semana2.patrones;

import java.util.Date;

// --- 1. TARGET (Interfaz esperada) ---
interface Printer {
    void print(String message);
}

// --- 2. ADAPTEE (Lo que ya existe) ---
class SimplePrinter implements Printer {
    public void print(String message) {
        System.out.println("🖨️ (Simple): " + message);
    }
}

// --- 3. CLASE INCOMPATIBLE (La nueva) ---
class DetailedPrinter {
    public void printDetailed(String message, String author, Date date) {
        System.out.println("--- DETALLE ---");
        System.out.println("Autor: " + author);
        System.out.println("Fecha: " + date);
        System.out.println("Msg: " + message);
        System.out.println("---------------");
    }
}

// --- 4. ADAPTER ---
class PrinterAdapter implements Printer {
    private final DetailedPrinter detailedPrinter;

    public PrinterAdapter(DetailedPrinter detailedPrinter) {
        this.detailedPrinter = detailedPrinter;
    }

    @Override
    public void print(String message) {
        detailedPrinter.printDetailed(message, "Guest", new Date());
    }
}

// --- 5. CLASE PRINCIPAL ---
public class Ejercicio2Adapter {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 2: ADAPTER ===");
        Printer p = new PrinterAdapter(new DetailedPrinter());
        p.print("Probando adaptador");
    }
}