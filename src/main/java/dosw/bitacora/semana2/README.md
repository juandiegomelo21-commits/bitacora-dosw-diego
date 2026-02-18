# Bitácora Semana 2: Patrones de Diseño & Principios SOLID

## 🛠️ Ejercicios Realizados

### 1. Patrón Factory Method (Creacional)
**Contexto:** Sistema de notificaciones (Email, SMS, Push).
**Solución:** Se implementó una clase `NotificationFactory` que centraliza la creación de las instancias. El cliente solo pide un "tipo" (String) y recibe una interfaz `Notification`, sin conocer la clase concreta.
**Beneficio:** Desacopla la lógica de creación de la lógica de negocio. Si agregamos "WhatsApp" en el futuro, solo modificamos la fábrica.

### 2. Patrón Adapter (Estructural)
**Contexto:** Integración de una impresora antigua (`SimplePrinter`) con una nueva y compleja (`DetailedPrinter`).
**Solución:** Se creó un `PrinterAdapter` que implementa la interfaz común `Printer`. Este adaptador envuelve a la impresora compleja y traduce las llamadas simples a llamadas detalladas (inyectando datos por defecto).
**Beneficio:** Permite reutilizar código legado incompatible sin modificarlo.

### 3. Patrón Memento (Comportamiento)
**Contexto:** Editor de texto con funcionalidad de "Deshacer" (Undo).
**Solución:**
* **Originator (`TextEditor`):** Crea y restaura estados.
* **Memento (`TextState`):** Objeto inmutable que guarda el contenido en un momento dado.
* **Caretaker (`History`):** Pila (Stack) que almacena la historia de cambios.
  **Beneficio:** Permite restaurar el estado anterior de un objeto sin violar su encapsulamiento (sin acceder directamente a sus variables privadas).

### 4. Calculadora SOLID
**Contexto:** Calculadora extensible y mantenible.
**Principios Aplicados:**
* **SRP (Responsabilidad Única):** Cada operación (`Suma`, `Resta`, etc.) es una clase separada.
* **OCP (Abierto/Cerrado):** La clase `Calculator` está cerrada a modificación pero abierta a extensión. Para agregar "Potencia", solo se crea una nueva clase sin tocar el código base.
* **LSP (Sustitución de Liskov):** Cualquier clase que implemente `Operation` funciona correctamente en la calculadora.

---

## 🧠 Autoevaluación Semanal

### ¿Qué entendía mal antes?
Pensaba que los **Patrones de Diseño** eran reglas estrictas que debían aplicarse siempre igual. No entendía que son "recetas" adaptables y que forzar su uso (sobre-ingeniería) puede hacer el código más difícil de leer si el problema es muy simple.

### ¿Qué entiendo ahora?
Entiendo la importancia de la **Inversión de Dependencias** (la "D" de SOLID). Al programar contra interfaces (como `Operation` o `Notification`) y no contra clases concretas, mi código se vuelve mucho más flexible y fácil de testear. También comprendí que el patrón **Memento** es ideal para historiales, aunque consume más memoria.

### ¿Qué me falta reforzar?
Necesito practicar más la diferencia entre **Factory Method** y **Abstract Factory**, ya que a veces los confundo. También quiero profundizar en cómo estos principios SOLID se aplican en frameworks reales como Spring Boot (por ejemplo, cómo la inyección de dependencias facilita cumplir con SOLID).