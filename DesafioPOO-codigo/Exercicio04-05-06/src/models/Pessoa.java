package models;

public class Pessoa{
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("Idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.setIdade(idade);
    }

    @Override
    public String toString() {
        return this.getNome() + " tem " + this.getIdade() + " anos de idade.";
    }
}
