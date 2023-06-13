import models.Guerreiro;
import models.Mago;
import models.Personagem;

public class Main {
    public static void main(String[] args) {

        Mago m1 = new Mago();

        Mago m2 = new Mago();
        Mago m3 = new Mago();

        Guerreiro g1 = new Guerreiro();
        Guerreiro g2 = new Guerreiro();
        Guerreiro g3 = new Guerreiro();

        System.out.println("No total há " + Personagem.getQntPersonagens() + " personagens criados.");
    }
}