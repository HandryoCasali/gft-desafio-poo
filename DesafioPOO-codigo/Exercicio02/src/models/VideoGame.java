package models;

import interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    public VideoGame() {}

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    @Override
    public double calculaImposto() {
        double imposto = 0;
        if(this.isUsado){
            imposto = this.getPreco() * 0.25;
            System.out.println("Imposto " + super.getNome() + " " + this.modelo + " usado" + " R$ " + imposto);
        } else {
            imposto = getPreco() * 0.45;
            System.out.println("Imposto " + super.getNome() + " " + this.modelo + " R$ " + imposto);
        }

        return imposto;
    }

    @Override
    public String toString() {
        return "Video-game: " + this.getModelo() + ", " +
                "preço: " + super.getPreco() + ", " +
                " quantidade: " + super.getQtd() + " em estoque." ;
    }
}
