package com.epam.behavioral.templatemethod.droid;

public abstract class Droid {
    private double hp;
    private double attack;

    public Droid(double hp, double attack) {
        this.hp = hp;
        this.attack = attack;
    }

    public void attack(Droid droid) {
        droid.setHp(droid.hp - this.attack);
    }

    public abstract void ultimateAbility();

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }
}
