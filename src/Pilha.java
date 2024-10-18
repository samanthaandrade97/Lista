import java.util.Stack;

public class Pilha {
    private Stack<Pagina> pilha;

    public Pilha() {
        pilha = new Stack<>();
    }

    public void push(Pagina pagina) {
        pilha.push(pagina);
    }

    public Pagina pop() {
        if (!empty()) {
            return pilha.pop();
        }
        return null;
    }

    public Pagina top() {
        if (!empty()) {
            return pilha.peek();
        }
        return null;
    }

    public int size() {
        return pilha.size();
    }

    public boolean empty() {
        return pilha.isEmpty();
    }
}