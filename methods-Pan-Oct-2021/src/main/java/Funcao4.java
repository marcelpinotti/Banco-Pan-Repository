public class Funcao4 {

    //Incremento

    static int myMethods(int x){
        return ++x;
    }

    static int myMethods1(int y){
        return y++;
    }

    public static void main(String[] args){
        System.out.println(myMethods(4));
        System.out.println(myMethods1(4));

    }
}
