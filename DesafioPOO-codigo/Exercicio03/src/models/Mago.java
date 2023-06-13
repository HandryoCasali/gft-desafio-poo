package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem{
    private List<String> magias = new ArrayList<>();

    public List<String> getMagia() {
        return Collections.unmodifiableList(this.magias);
    }

    public void adicionaMagia(String magia) {
        this.magias.add(magia);
    }


    @Override
    public void lvlUp(){
        super.lvlUp();
        super.setVida(super.getVida() + 1);
        super.setForca(super.getForca() + 1);
        super.setMana(super.getMana() + 3);
        super.setInteligencia(super.getInteligencia() + 2);
    }

    @Override
    public int attack() {
        Random r = new Random();
        return (super.getInteligencia() * super.getLevel()) + r.nextInt(301);
    }
}
