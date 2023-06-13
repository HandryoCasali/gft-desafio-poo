package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros = new ArrayList<>();
    private List<VideoGame> videoGames = new ArrayList<>();

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return Collections.unmodifiableList(this.livros);
    }

    public List<VideoGame> getVideoGames() {
        return Collections.unmodifiableList(this.videoGames);
    }

    public Loja(){}

    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void adicionaLivro(Livro livro){
        this.livros.add(livro);
    }

    public void adicionaVideoGame(VideoGame vg){
        this.videoGames.add(vg);
    }

    public void listaLivros(){
        System.out.println("-------------------------------------------------------------");
        if(this.livros.isEmpty()){
            System.out.println("A loja " + this.getNome() + " não tem livros no seu estoque.");
            return;
        }
        System.out.println("A loja " + this.getNome() + "  possui estes livros para venda: ");
        this.livros.forEach(System.out::println);
    }

    public void listaVideoGames(){
        System.out.println("-------------------------------------------------------------");
        if(this.videoGames.isEmpty()){
            System.out.println("A loja " + this.getNome() + " não tem video-games no seu estoque.");
            return;
        }
        System.out.println("A loja " + this.getNome() + " possui estes video-games para venda: ");
        this.videoGames.forEach(System.out::println);
    }

    public double calculaPatrimonio(){
        double valorTotal = 0;

        for(Livro l : livros){
            valorTotal += (l.getPreco() * l.getQtd());
        }
        for(VideoGame vg : videoGames){
            valorTotal += (vg.getPreco() * vg.getQtd());
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("O patrimonio da loja: " + getNome() + " é de R$ " + valorTotal);
        return valorTotal;
    }
}
