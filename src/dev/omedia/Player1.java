package dev.omedia;

import java.util.ArrayList;
import java.util.List;

public class Player1 implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player1(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        if (hitPoints > 0) {
            this.hitPoints = hitPoints;
        }
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        if (strength > 0) {
            this.strength = strength;
        }
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        if (weapon != null && !weapon.isEmpty()) {
            this.weapon = weapon;
        }
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", hitPoints=" + hitPoints +
                ", strength=" + strength + ", weapon=" + weapon + "]";
    }

    @Override
    public List<String> write() {
        List<String> data = new ArrayList<>();
        data.add(this.name);
        data.add(Integer.toString(this.hitPoints));
        data.add(Integer.toString(this.strength));
        data.add(this.weapon);
        return data;
    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() == 4) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}