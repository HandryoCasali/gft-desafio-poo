package models;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        double bonus = 3000.0;
        return super.bonificacao() + bonus;
    }
}
