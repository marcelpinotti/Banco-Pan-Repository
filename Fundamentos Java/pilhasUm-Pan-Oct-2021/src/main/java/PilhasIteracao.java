import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class PilhasIteracao {

    public static void main(String[] args) {

        Stack<Integer> pilhaList = new Stack<>();

        pilhaList.push(68);
        pilhaList.push(118);
        pilhaList.push(90);
        pilhaList.push(720);
        pilhaList.pop();

        ArrayList<String> listArray = new ArrayList<>();
        listArray.add("ArrayList 1");
        listArray.add("ArrayList 2");

        List<String> listList = new ArrayList<>();
        listList.add("Lista 1");
        listList.add("Lista 2");

        System.out.println("Iterar Lista");
        Iterator<String> iterList = listList.iterator();
        while(iterList.hasNext()){
            String iterado = iterList.next();
            System.out.println(iterado);
        }

        System.out.println("Iterar Array");
        Iterator<String> iterArray = listArray.iterator();
        while(iterArray.hasNext()){
            String iterado = iterArray.next();
            System.out.println(iterado);
        }

        System.out.println("Iterar Pilha");
        Iterator<Integer> iterPilha = pilhaList.iterator();
        while(iterPilha.hasNext()){
            Integer iterado = iterPilha.next();
            System.out.println(iterado);
        }
    }
}
