package paf.garikaadventure.Characters;

/**
 * Created by PAF on 26/06/2017.
 */

public class Foe extends Character {
    public Foe (Player player) {
        setTarget(player);
        setLifePoint(30);
    }
}
