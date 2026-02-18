# Bitácora Semana 1: Java Streams & Git Flow

## 🛠️ Ejercicios Realizados

### 1. Filtrado de Números Pares
**Descripción:** Se implementó un flujo para filtrar números enteros, conservando solo los pares mayores a 10.
**Conceptos:** `filter`, predicados lógicos.

### 2. Procesamiento de Cadenas
**Descripción:** Procesamiento de una lista de palabras para filtrar por longitud (>4), convertir a mayúsculas y ordenar alfabéticamente.
**Conceptos:** `map` (transformación), `sorted` (ordenamiento), `count` (operación terminal).

### 3. Filtrado de Objetos (Usuarios Activos)
**Descripción:** Manipulación de una lista de objetos `User`. Se filtraron los usuarios activos para extraer y ordenar sus nombres.
**Conceptos:** Referencia a métodos (`User::isActive`), inmutabilidad del flujo.

### 4. Mayores de Edad (Nuevo)
**Descripción:** Extracción de nombres de usuarios cuya edad es mayor o igual a 18 años.
**Conceptos:** Reutilización de la clase `User`, lógica de filtrado sobre atributos numéricos.

### 5. Validación de Transacciones (Nuevo)
**Descripción:** Validación de un lote de transacciones bancarias. El sistema determina si el lote es válido (todas aprobadas) o inválido (al menos una rechazada).
**Conceptos:**
* `peek`: Utilizado para trazar el flujo sin modificarlo (logging).
* `anyMatch`: Predicado de cortocircuito para eficiencia.

---

## 🧠 Autoevaluación

### ¿Qué entendía mal antes?
Antes pensaba que las operaciones de Streams modificaban la colección original (la lista de origen). No tenía claro que un Stream es una "vista" o tubería de datos y que la fuente permanece intacta a menos que yo guarde el resultado en una nueva lista explícitamente.

### ¿Qué entiendo ahora?
Ahora comprendo la diferencia entre **operaciones intermedias** (como `filter`, `map`, `peek`) que son "perezosas" (lazy) y no se ejecutan hasta que se llama a una **operación terminal** (como `collect`, `count`, `anyMatch`). También entiendo mejor cómo usar `peek` para depurar sin afectar el flujo de datos.

### ¿Qué me falta reforzar?
Necesito practicar más con **FlatMap** para listas anidadas y con los **Collectors** personalizados (como `groupingBy` o `partitioningBy`), ya que hasta ahora solo he usado `toList()`. También quiero mejorar mi manejo de ramas en Git Flow para evitar conflictos al fusionar.