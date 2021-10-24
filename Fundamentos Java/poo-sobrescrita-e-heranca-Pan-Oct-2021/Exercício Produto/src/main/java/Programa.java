public class Programa {

    public static void main(String[] args) {

        Livro livroUm = new Livro();
        livroUm.setCodigo(1);
        livroUm.setDescricao("O Senhor dos Anéis");
        livroUm.setPreco(120.0);

        livroUm.exibirDados();
    }
}
