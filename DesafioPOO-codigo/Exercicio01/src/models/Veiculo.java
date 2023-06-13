package models;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private double preco;
    private final int CAPACIDADE_TANQUE_COMBUSTIVEL = 60;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;


    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String novaMarca){
        this.marca = novaMarca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String novoModelo){
        this.modelo = novoModelo;
    }

    public String getPlaca(){
        return this.placa;
    }

    public void setPlaca(){
        this.placa = placa;
    }

    public String getCor(){
        return this.cor;
    }


    public Double getPreco(){
        return this.preco;
    }

    public void setPreco(double novoPreco){
        if(novoPreco < 0){
            throw new IllegalArgumentException("O valor para preco não pode ser negativo!");
        }
        this.preco = novoPreco;
    }

    public int getTanque(){
        return this.CAPACIDADE_TANQUE_COMBUSTIVEL;
    }

    public float getKm(){
        return this.km;
    }

    public boolean getIsLigado(){
        return this.isLigado;
    }

    public int getLitrosCombustivel(){
        return this.litrosCombustivel;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public void acelerar(){
        if(!this.isLigado){
            System.out.println("O Carro precisa estar ligado para acelerá-lo");
            return;
        }
        this.velocidade += 20;
    }

    public void abastecer(int combustivel){
        if(this.isLigado){
            System.out.println("Não é possivel abastecer com o carro ligado!");
            return;
        }
        if(combustivel < 0) {
            throw new IllegalArgumentException("O valor para Combustível não pode ser negativo!");
        }

        int qntCompletarTanque = CAPACIDADE_TANQUE_COMBUSTIVEL - litrosCombustivel;

        if(combustivel > qntCompletarTanque){
            System.out.println("Não foi possivel abastecer " + combustivel + "L");
            System.out.println("O tanque de combustível só consegue aceitar mais "
                    + qntCompletarTanque + "Litros");
            return;
        }
        this.litrosCombustivel += combustivel;
    }

    public void frear(){
        if(this.velocidade == 0){
            System.out.println("Veiculo já está parado!");
            return;
        }
        this.velocidade -= 20;
    }

    public void pintar(String novaCor){
        this.cor = novaCor;
    }

    public void ligar(){
        if(this.isLigado){
            System.out.println("Veículo já está ligado!");
            return;
        }
        this.isLigado = true;
    }

    public void desligar(){
        if(!this.isLigado){
            System.out.println("Veiculo já está desligado!");
            return;
        }
        if(velocidade > 0){
            System.out.println("Veiculo em movimento, não é possível desligar!");
        }

        this.isLigado = false;
    }
}
