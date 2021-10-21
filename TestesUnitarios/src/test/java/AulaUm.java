import org.junit.After;
import org.junit.Test;

public class AulaUm {

    @Test // A anotação @Test implementa o JUnit / Método sempre void / Método sempre public / Nome do teste deve ser auto-explicativo
    public void metodoDeExemploDeTesteValido(){
    }

    //@Test
    public String metodoDeExemploDeTesteInvalidoReturnString(){
        return "Hello World!";
    }

    //@Test
    private void metodoDeExemploDeTesteInvalidoVibilidadePrivate(){
    }

    //@Test
    protected void metodoDeExemploDeTesteInvalidoVibilidadeProtected(){
    }

    @After // Roda por último
    public void metodoDeImpressaoNaTelaUm(){
        System.out.println("Teste um executado!");
    }

    @Test
    public void metodoDeImpressaoNaTelaDois(){
        System.out.println("Teste dois executado!");
    }

    //@Test Sem a anotação ele não roda
    public void metodoNaoEhUmTeste(){
        System.out.println("Este teste não deve aparecer!");
    }


}
