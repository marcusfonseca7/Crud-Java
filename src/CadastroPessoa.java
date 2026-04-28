import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    Scanner sc = new Scanner(System.in);
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    public void adicionarPessoa() {
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu telefone: ");
        int telefone = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade, telefone);

        System.out.println("Usuário cadastrado: " + pessoa.getNome());
        listaPessoa.add(pessoa);
    }

    public void lerPessoas() {
        for (Object pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }

    public void editarPessoa() {
        System.out.println("Qual deseja editar? ");
        for (Object pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }

    public void deletarPessoa() {
        System.out.println("Qual deseja deletar? ");
        for (Object pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }


}
