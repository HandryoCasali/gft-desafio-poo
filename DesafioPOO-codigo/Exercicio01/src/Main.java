import models.Veiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, vamos andar de carro? ");
        Veiculo v = new Veiculo();
        v.pintar("azul");
        v.ligar();
        v.acelerar();
        v.acelerar();
        System.out.println("O carro está com a velocidade de " + v.getVelocidade() + "Km/h");
        v.frear();
        v.frear();
        v.desligar();
        v.abastecer(40);

    }
}