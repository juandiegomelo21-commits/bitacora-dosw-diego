package dosw.bitacora.semana2.patrones;

// --- 1. PRODUCTO (Interfaz) ---
interface Notification {
    void send(String message);
}

// --- 2. CONCRETOS ---
class EmailNotification implements Notification {
    public void send(String message) { System.out.println("📧 [Email] Enviando: " + message); }
}

class SMSNotification implements Notification {
    public void send(String message) { System.out.println("📱 [SMS] Enviando: " + message); }
}

class PushNotification implements Notification {
    public void send(String message) { System.out.println("🔔 [Push] Enviando: " + message); }
}

// --- 3. FÁBRICA ---
class NotificationFactory {
    public static Notification createNotification(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "email": return new EmailNotification();
            case "sms": return new SMSNotification();
            case "push": return new PushNotification();
            default: throw new IllegalArgumentException("Desconocido: " + type);
        }
    }
}

// --- 4. CLASE PRINCIPAL (Ejecución) ---
public class Ejercicio1Factory {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 1: FACTORY ===");
        Notification n1 = NotificationFactory.createNotification("email");
        n1.send("Hola Factory");

        Notification n2 = NotificationFactory.createNotification("push");
        n2.send("Alerta");
    }
}