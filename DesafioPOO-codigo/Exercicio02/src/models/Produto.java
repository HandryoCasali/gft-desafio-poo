package models;

public abstract class Produto {
    private String nome;
    private double preco;
    private int qtd;

    public String getNome(){
        return nome;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double novoPreco){
        if(novoPreco < 0){
            throw new IllegalArgumentException("Não é permitido setar valor negativo para o preço.");
        }
        this.preco = novoPreco;
    }

    public int getQtd(){
        return qtd;
    }

    public void setQtd(int novaQtd){
        if(novaQtd < 0){
            throw new IllegalArgumentException("Não é permitido setar valor negativo para a quantidade.");
        }
        this.qtd = novaQtd;
    }

    public Produto(){ }

    public Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.setQtd(qtd);
    }

}

