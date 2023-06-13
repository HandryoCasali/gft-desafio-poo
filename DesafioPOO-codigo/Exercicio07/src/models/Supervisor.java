package models;

public class Supervisor extends Funcionario {
    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public double bonificacao() {
        double bonus = 5000.0;
        return super.bonificacao() + bonus;
    }
}
