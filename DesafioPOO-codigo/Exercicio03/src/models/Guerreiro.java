package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem{
    private List<String> habilidades = new ArrayList<>();

    public List<String> getHabilidade() {
        return Collections.unmodifiableList(this.habilidades);
    }

    public void adicionaHabilidade(String habilidade){
        this.habilidades.add(habilidade);
    }

    public void listarHabilidades(){
        this.habilidades.forEach(System.out::println);
    }

    @Override
    public void lvlUp(){
        super.lvlUp();
        super.setVida(super.getVida() + 3);
        super.setForca(super.getForca() + 4);
        super.setMana(super.getMana() + 1);
        super.setInteligencia(super.getInteligencia() + 1);
    }

    @Override
    public int attack() {
        Random r = new Random();
        return (super.getForca() * super.getLevel()) + r.nextInt(301);

    }
}
