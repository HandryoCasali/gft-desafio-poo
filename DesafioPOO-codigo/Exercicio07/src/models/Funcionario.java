package models;

public abstract class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade < 0){
            throw new IllegalArgumentException("Valor para idade não pode ser negativo");
        }
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario < 0){
            throw new IllegalArgumentException("Valor para salario não pode ser negativo");
        }
        this.salario = salario;
    }

    public Funcionario(){}

    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.setIdade(idade);
        this.setSalario(salario);
    }

    public double bonificacao(){
        return this.salario;
    }

    @Override
    public String toString() {
        return  "nome: " + this.nome +
                ", idade: " + this.idade + " anos" +
                ", salario: R$ " + this.salario +
                ", bonificacao: R$ " + this.bonificacao();
    }
}
