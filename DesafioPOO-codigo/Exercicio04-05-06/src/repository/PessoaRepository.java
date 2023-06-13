package repository;

import models.Pessoa;

import java.util.*;

public class PessoaRepository {
    private List<Pessoa> pessoas = new ArrayList<>();

    public List<Pessoa> getPessoas() {
        return Collections.unmodifiableList(this.pessoas);
    }

    public int getQuantidadePessoas(){
        return this.pessoas.size();
    }

    public void adicionarPessoa(Pessoa p) {
        this.pessoas.add(p);
    }

    public void removerPessoa(Pessoa p) {
        this.pessoas.remove(p);
    }

    public void listarPessoa() {
        this.pessoas.forEach(System.out::println);
    }

    public Pessoa retornarPessoaMaisVelha() {

        if (this.pessoas.isEmpty()) {
            return null;
        }

        return this.pessoas.stream()
                .max(Comparator.comparing(Pessoa::getIdade))
                .get();
    }

    public void excluirPessoasMenoresDeIdade() {

        this.pessoas = this.pessoas.stream()
                .filter(p1 -> p1.getIdade() >= 18)
                .toList();
    }

    public List<Pessoa> buscarPorNome(String nome) {
        return this.pessoas.stream()
                .filter((p) -> p.getNome().equals(nome))
                .toList();
    }


}
