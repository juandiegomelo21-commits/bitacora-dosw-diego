# 📘 Bitácora de Aprendizaje - DOSW
**Estudiante:** Juan Diego Melo Suarez
**Curso:** Desarrollo Orientado a Servicios Web (DOSW)
**Tecnologías:** Java 17, Maven, JUnit, Git Flow

---

## 📅 Registro de Actividades

Esta bitácora documenta mi progreso semanal, los ejercicios técnicos resueltos y mi autoevaluación sobre los conceptos aprendidos.

---

## 🚀 Semana 1: Java Streams & Git Flow
**Enfoque:** Programación funcional y manejo de ramas.

### 🛠️ Ejercicios Realizados
1.  **Filtrado de Números:** Uso de `filter` para obtener pares mayores a 10.
2.  **Procesamiento de Cadenas:** `map` y `sorted` para transformar y ordenar palabras.
3.  **Usuarios Activos:** Manipulación de objetos y referencias a métodos (`User::isActive`).
4.  **Validación de Transacciones:** Uso de `peek` para logging y `anyMatch` para validación de reglas de negocio.

### 🧠 Autoevaluación Semana 1
* **Aprendizaje Clave:** Entendí que los Streams son "perezosos" (lazy) y no ejecutan nada hasta la operación terminal.
* **Corrección Mental:** Antes creía que el Stream modificaba la lista original; ahora sé que crea una nueva vista o colección.
* **Por mejorar:** Profundizar en `flatMap` y `Collectors` personalizados.

---

## 🏗️ Semana 2: Patrones de Diseño & SOLID
**Enfoque:** Arquitectura de software limpia y desacoplamiento.

### 🛠️ Ejercicios Realizados
1.  **Factory Method (Creacional):**
    * *Caso:* Sistema de Notificaciones (Email, SMS, Push).
    * *Logro:* Centralizar la creación de objetos para no depender de clases concretas.
2.  **Adapter (Estructural):**
    * *Caso:* Integración de Impresoras (Simple vs. Detallada).
    * *Logro:* Conectar clases incompatibles mediante una interfaz común.
3.  **Memento (Comportamiento):**
    * *Caso:* Editor de texto con "Deshacer" (Ctrl+Z).
    * *Logro:* Restaurar estados anteriores sin violar el encapsulamiento.
4.  **Calculadora SOLID:**
    * *Caso:* Operaciones matemáticas extensibles.
    * *Logro:* Aplicar **SRP** (clases separadas por operación) y **OCP** (abierto a extensión, cerrado a modificación).

### 🧠 Autoevaluación Semana 2
* **Aprendizaje Clave:** La **Inversión de Dependencias** es vital; programar contra interfaces hace que el código sea mantenible.
* **Corrección Mental:** Dejé de ver los patrones como "reglas rígidas" y empecé a verlos como herramientas adaptables.
* **Por mejorar:** Diferenciar mejor entre *Factory Method* y *Abstract Factory* en escenarios complejos.

---

> *Repositorio mantenido siguiendo la estrategia Git Flow: Feature -> Develop -> Main.*
