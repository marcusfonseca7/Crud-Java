public class Pessoa {

    private String nome;
    private int idade;
    private int telefone;

    public Pessoa(String nome, int idade, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "| Idade: " + idade + "| Número: " + telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
