package dosw.bitacora.semana2.patrones;

import java.util.Stack;

// --- 1. MEMENTO (Estado) ---
class TextState {
    private final String content;
    public TextState(String content) { this.content = content; }
    public String getContent() { return content; }
}

// --- 2. ORIGINATOR (Editor) ---
class TextEditor {
    private String content = "";

    public void write(String text) { this.content += text; }
    public String getContent() { return content; }

    public TextState save() { return new TextState(content); }
    public void restore(TextState state) { this.content = state.getContent(); }
}

// --- 3. CARETAKER (Historial) ---
class History {
    private final Stack<TextState> states = new Stack<>();
    public void push(TextState state) { states.push(state); }
    public TextState pop() { return states.isEmpty() ? null : states.pop(); }
}

// --- 4. CLASE PRINCIPAL ---
public class Ejercicio3Memento {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 3: MEMENTO ===");
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Hola");
        history.push(editor.save());

        editor.write(" Mundo");
        System.out.println("Actual: " + editor.getContent());

        editor.restore(history.pop());
        System.out.println("Restaurado: " + editor.getContent());
    }
}