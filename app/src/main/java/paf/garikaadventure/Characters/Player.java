package paf.garikaadventure.Characters;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

import paf.garikaadventure.Items.Item;

/**
 * Created by PAF on 26/06/2017.
 */

public class Player extends Character implements Parcelable{
    private int weight;
    private int weightCapacity;
    private ArrayList <Item> inventory;

    public Player (){
    }

    protected Player(Parcel in) {
        weight = in.readInt();
        weightCapacity = in.readInt();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(weight);
        parcel.writeInt(weightCapacity);
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
