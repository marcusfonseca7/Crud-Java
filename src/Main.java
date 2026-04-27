import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroPessoa cad = new CadastroPessoa();
        int opcao = 1;

        while (opcao == 1) {
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite seu telefone: ");
        int telefone = sc.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade, telefone);
        cad.adicionarPessoa(pessoa);

        System.out.println("Opcão: ");
        opcao = sc.nextInt();
        sc.nextLine();
        }

        cad.lerPessoas();
    }
}