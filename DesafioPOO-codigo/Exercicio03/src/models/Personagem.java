package models;

import java.util.Random;

public abstract class Personagem {

    private static int qntPersonagens = 0;

    private String nome;
    private int vida;
    private int mana;
    private int inteligencia;
    private int forca;
    private int level;
    private float xp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public static int getQntPersonagens(){
        return Personagem.qntPersonagens;
    }
    public Personagem(){
        Personagem.qntPersonagens++;
    }

    public void lvlUp(){
        this.level++;
    }

    public abstract int attack();
}
