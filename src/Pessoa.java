public class Pessoa {

    private String nome;
    private int idade;
    private int telefone;

    public Pessoa(String nome, int idade, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }


    public void exibir() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(telefone);
    }
}
