import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

    Scanner sc = new Scanner(System.in);
    ArrayList<Pessoa> listaPessoa = new ArrayList<>();
    int contador;

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
        sc.nextLine();
    }

    public void lerPessoas() {
        for (Object pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }

    public void editarPessoa() {
        System.out.println("Qual deseja editar? ");
        contador = 1;
        for (Object pessoa : listaPessoa) {
            System.out.println(contador + " - " + pessoa);
            contador++;
        }
        int opcaoEditar = sc.nextInt();

        System.out.println("Sua escolha: " + listaPessoa.get(opcaoEditar - 1) + "\nO que deseja editar? 1 - Nome | 2 - Idade | 3 - Telefone");
        int opcaoEditarAtributo = sc.nextInt();
        sc.nextLine(); // limpar scanner

        switch (opcaoEditarAtributo){
            case 1:
                System.out.println("Digite o nome para substituir: ");
                String novoNome = sc.nextLine();
                listaPessoa.get(opcaoEditar - 1).setNome(novoNome);
                System.out.println("Nome Editado com Sucesso!");
                break;

            case 2:
                System.out.println("Digite a idade para substituir: ");
                int novaIdade = sc.nextInt();
                listaPessoa.get(opcaoEditar - 1).setIdade(novaIdade);
                System.out.println("Idade Editado com Sucesso!");
                break;

            case 3:
                System.out.println("Digite o telefone para substituir: ");
                int novoTelefone = sc.nextInt();
                listaPessoa.get(opcaoEditar - 1).setTelefone(novoTelefone);
                System.out.println("Telefone Editado com Sucesso!");
                break;
        }

    }

    public void deletarPessoa() {
        System.out.println("Qual deseja deletar? ");
        contador = 1;
        for (Object pessoa : listaPessoa) {
            System.out.println(contador + " - " + pessoa);
            contador++;
        }
        int opcaoDeletar = sc.nextInt();
        listaPessoa.remove(opcaoDeletar - 1);
        System.out.println("Usuário Deletado com Sucesso! ");

        sc.nextLine(); // limpar scanner
    }

}
