package com.pentalog.pentastagiu.StrategyGame;

public class HumanCharacter
{
    String name;
    String position;
    int healthPoints;
    int energyPoints;

    public HumanCharacter(String name, String position, int healthPoints, int energyPoints) {
        this.name = name;
        this.position = position;
        this.healthPoints = healthPoints;
        this.energyPoints = energyPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getEnergyPoints() {
        return energyPoints;
    }

    public void setEnergyPoints(int energyPoints) {
        this.energyPoints = energyPoints;
    }

    @Override
    public String toString() {
        return "HumanCharacter{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", healthPoints=" + healthPoints +
                ", energyPoints=" + energyPoints +
                '}';
    }


}
