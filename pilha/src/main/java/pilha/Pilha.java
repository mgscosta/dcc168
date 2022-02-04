package pilha;

import java.util.Stack;

public class Pilha {
    int size;
    Stack<String> stack;

    public Pilha(int size) {
        this.size = size;
        stack = new Stack<String>();
    }

    public void stack_push(String element) {
        if(stack.size() != size) {
            stack.push(element);
        }
        else {
            System.out.println("Pilha lotada");
        }
    }

    public void stack_pop() {
        String element = stack.pop();
        System.out.println(element + " removido");
    }

    public void stack_verify(String element) {
        Integer position = (Integer) stack.search(element);
        if(position == -1) {
            System.out.println("Item não encontrado na pilha");
        }
        else {
            System.out.println("Elemento na posição: " + position);
        }
    }

    public void stack_print() {
        stack.forEach(System.out::println);
    }
}
