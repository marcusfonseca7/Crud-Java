import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastroPessoa cad = new CadastroPessoa();
        int opcao = 1;

        do {
            System.out.println("╔════════════════════════════╗\n" +
                               "║       CRUD DE USUÁRIOS     ║\n" +
                               "╠════════════════════════════╣\n" +
                               "║   1- Adicionar Usuário     ║\n" +
                               "║   2- Listar Usuários       ║\n" +
                               "║   3- Editar Usuário        ║\n" +
                               "║   4- Deletar Usuário       ║\n" +
                               "║   5- Sair                  ║\n" +
                               "╚════════════════════════════╝");
            int opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {

                case 1:
                    cad.adicionarPessoa();
                    break;

                case 2:
                    cad.lerPessoas();
                    break;

                case 3:
                    cad.editarPessoa();
                    break;

                case 4:
                    cad.deletarPessoa();
                    break;
            }

            System.out.println("Deseja voltar ao menu? 1 - Sim | 2 - Não: ");
            opcao = sc.nextInt();
        } while (opcao == 1);

    }
}