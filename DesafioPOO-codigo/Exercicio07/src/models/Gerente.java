package models;

public class Gerente extends Funcionario{
    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        double bonus = 10000.00;
        return super.bonificacao() + bonus;
    }

}
