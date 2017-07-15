package paf.garikaadventure.Items.Weapons;

import android.widget.ImageView;

/**
 * Created by PAF on 26/06/2017.
 */

public class Weapon {
    private int damage;
    private int resistance;
    ImageView picture;

    public Weapon () {

    }

    public int giveDamage (){
        return damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public ImageView getPicture() {
        return picture;
    }

    public void setPicture(ImageView picture) {
        this.picture = picture;
    }
}
