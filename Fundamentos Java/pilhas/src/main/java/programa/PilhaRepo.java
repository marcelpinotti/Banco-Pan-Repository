package programa;

import java.util.Stack;

public class PilhaRepo {

    public static void inserindoPush(Stack pilha, String x){
        pilha.push(x);
        System.out.println("push -> " + x);
        System.out.println("stack -> " + pilha);
    }

    public static void deletandoPop(Stack pilha){
        System.out.println("pop -> ");
        String x = (String) pilha.pop();
        System.out.println("stack -> " + pilha);
    }

}
