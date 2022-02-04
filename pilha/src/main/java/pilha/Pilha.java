package pilha;

import java.util.Stack;

public class Pilha {
    int size;
    Stack<String> stack;
    String result;

    public Pilha(int size) {
        result = "";
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

    public String stack_pop() {
        if(!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println(element + " removido");
            return element;
        }
        else {
            System.out.println("Pilha vazia");
            return "";
        }
    }

    public Integer stack_verify(String element) {
        Integer position = (Integer) stack.search(element);
        if(position == -1) {
            System.out.println("Item não encontrado na pilha");
        }
        else {
            System.out.println("Elemento na posição: " + position);
        }
        return position;
    }

    public String stack_print() {
        int i = 0;
        for(String element : stack) {
            if(i == stack.size() - 1)
                result += element;
            else
                result += element + "\n";
        i++;
        }

        return result;
    }
}
