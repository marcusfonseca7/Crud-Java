import java.util.ArrayList;

public class CadastroPessoa {

    ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa) {
        listaPessoa.add(pessoa);
    }

    public void lerPessoas() {
        for (Object pessoa : listaPessoa) {
            System.out.println(pessoa);
        }
    }

    public void editarPessoa() {

    }

    public void deletarPessoa() {

    }


}
