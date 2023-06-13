import models.Pessoa;
import repository.PessoaRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        PessoaRepository pessoaRepository = new PessoaRepository();

        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jessica", 18);

        pessoaRepository.adicionarPessoa(p1);
        pessoaRepository.adicionarPessoa(p2);
        pessoaRepository.adicionarPessoa(p4);
        pessoaRepository.adicionarPessoa(p3);

        pessoaRepository.listarPessoa();

        Pessoa pessoaMaisVelha = pessoaRepository.retornarPessoaMaisVelha();

        if (pessoaMaisVelha == null) {
            System.out.println("Não foi encontrado nenhuma pessoa.");
        } else {
            System.out.println("A pessoa mais velha da lista é o(a) " + pessoaMaisVelha.getNome());
        }

        System.out.println("Removendo pessoas menores de idade...");
        System.out.println("Quantidade de pessoas antes da remoção: " + pessoaRepository.getQuantidadePessoas());
        pessoaRepository.excluirPessoasMenoresDeIdade();
        System.out.println("Quantidade de pessoas após a remoção: " + pessoaRepository.getQuantidadePessoas());

        String nomeBuscar = "Handryo";
        List<Pessoa> pessoaBuscar = pessoaRepository.buscarPorNome(nomeBuscar);
        System.out.println("Buscando pessoa com nome " + nomeBuscar + " na lista.");
        if (pessoaBuscar.isEmpty()) {
            System.out.println("Não foi encontrado alguem com nome de " + nomeBuscar + " na lista.");
        } else {
            pessoaBuscar.forEach(pessoa -> {
                System.out.println(nomeBuscar + " foi encontrado(a) na lista e sua idade é " + pessoa.getIdade() + " anos.");
            });
        }

    }
}