package paf.garikaadventure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import paf.garikaadventure.Characters.Player;

/**
 * Created by PAF on 20/07/2017.
 */

public class SkillViewFragment extends Fragment {

    private Player player;

    public static SkillViewFragment newInstance (Player player) {
        SkillViewFragment skillViewFragment = new SkillViewFragment();
        skillViewFragment.setPlayer(player);

        return skillViewFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_player_skill, container, false);

        return rootview;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        TextView fightSkills = (TextView) view.findViewById(R.id.fightSkills);
        TextView personalSkills = (TextView) view.findViewById(R.id.personalSkills);

      /*private int strength;
        private int intelligence;
        private int agility;
        private int charisma;
        private int bravery;*/

        fightSkills.setText("\nHealth Points : " + player.getHealthPoint() +
                            "\nStamina : " + player.getStamina() +
                            "\nAttack: " + player.getStamina() +
                            "\nParry : " + player.getStamina()
        );

        personalSkills.setText( "\nIntelligence : " + player.getIntelligence() +
                                "\nCharisma : " + player.getCharisma() +
                                "\nStrength: " + player.getStrength() +
                                "\nBravery : " + player.getBravery() +
                                "\nAgility: " + player.getAgility()


        );
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
