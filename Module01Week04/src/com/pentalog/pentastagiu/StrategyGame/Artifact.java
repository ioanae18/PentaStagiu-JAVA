package com.pentalog.pentastagiu.StrategyGame;

public class Artifact
{
//    String name;
    String position;
    int extraPoints;

    public Artifact(String position, int extraPoints) {
        this.position = position;
        this.extraPoints = extraPoints;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExtraPoints() {
        return extraPoints;
    }

    public void setExtraPoints(int extraPoints) {
        this.extraPoints = extraPoints;
    }

    @Override
    public String toString() {
        return "Artifact{" +
                "position='" + position + '\'' +
                ", extraPoints=" + extraPoints +
                '}';
    }
}
