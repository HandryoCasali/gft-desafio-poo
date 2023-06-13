package models;

import interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPagina;

    public String getAutor(){
        return autor;
    }

    public void setAutor(String novoAutor){
        this.autor = novoAutor;
    }

    public String getTema(){
        return tema;
    }

    public void setTema(String novoTema){
        this.tema = novoTema;
    }

    public int getQtdPagina(){
        return qtdPagina;
    }

    public void setQtdPagina(int novaQtdPagina){
        if(novaQtdPagina < 0) {
            throw new IllegalArgumentException("Não é possivel setar um numero negativo para a quantidade de páginas!");
        }
        this.qtdPagina = novaQtdPagina;
    }

    public Livro(){}

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPagina){
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.setQtdPagina(qtdPagina);
    }

    @Override
    public double calculaImposto() {
        if(tema.equals("educativo")){
            System.out.println("Livro educativo não tem imposto: " + super.getPreco() + ".");
            return 0;
        }

        double imposto = this.getPreco() * 0.1;

        System.out.println("R$ " + imposto + " de impostos sobre o livro " + super.getPreco() + ".");
        return imposto;
    }

    @Override
    public String toString() {
        return "Titulo: " + super.getNome() + ", " +
                "preço: " + super.getPreco() + ", " +
                " quantidade: " + super.getQtd() + " em estoque." ;
    }
}
