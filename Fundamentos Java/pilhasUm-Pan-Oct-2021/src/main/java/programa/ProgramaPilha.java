package programa;

import java.util.Stack;

public class ProgramaPilha extends PilhaRepo {

    public static void main(String[] args) {

        Stack<String> pilha = new Stack<>();

        System.out.println("stack: " + pilha);

        inserindoPush(pilha, "Caixa Acústica 110");
        inserindoPush(pilha, "Caixa Acústica 220");
        inserindoPush(pilha, "Note");
        deletandoPop(pilha);
        deletandoPop(pilha);

        /* Outra forma de chamar o método sem extender a classe
        "método static void"
        PilhaRepo.inserindoPush("Fone de Ouvido");
         */
    }
}
