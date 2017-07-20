package paf.garikaadventure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import paf.garikaadventure.Characters.Foe;
import paf.garikaadventure.Characters.Player;

/**
 * Created by PAF on 14/07/2017.
 */

public class CharacterFragment extends Fragment {

    private Player player;
    private Foe foe;
    private TextView infoFight;

    public static CharacterFragment newInstance (Player player, Foe foe) {
        CharacterFragment characterFragment = new CharacterFragment();

        characterFragment.player = player;
        characterFragment.foe = foe;
        return characterFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_character_card, container, false);

        player = getPlayer();
        foe = getFoe();

        return rootview;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        infoFight = (TextView) view.findViewById(R.id.infoFight);
        ImageView foeImage = (ImageView) view.findViewById(R.id.foeImage);
        foeImage.setImageResource(R.drawable.foe);
        foeImage.setOnClickListener(foeAttack);
    }

    private View.OnClickListener foeAttack = new View.OnClickListener() {
        public void onClick(View v) {

            foe.attack();
            infoFight.setText("Foe has attack and gave " + foe.getDamage() + " damage" );
            player.looseLife();
            if (!player.isAlive()){
                infoFight.setText(player.getName() + " is dead");
            }
        }
    };

    //A supprimer

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Foe getFoe() {
        return foe;
    }

    public void setFoe(Foe foe) {
        this.foe = foe;
    }

    public TextView getInfoFight() {
        return infoFight;
    }

    public void setInfoFight(TextView infoFight) {
        this.infoFight = infoFight;
    }

}
