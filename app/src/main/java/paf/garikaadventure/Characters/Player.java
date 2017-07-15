package paf.garikaadventure.Characters;

import java.util.ArrayList;

import paf.garikaadventure.Items.Item;

/**
 * Created by PAF on 26/06/2017.
 */

public class Player extends Character {
    private int weight;
    private int weightCapacity;
    private ArrayList <Item> inventory;

    public Player (){
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity + (getStrength()/10);
    }
}
