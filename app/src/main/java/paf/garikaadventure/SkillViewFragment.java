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
    private TextView fightSkills;
    private TextView personalSkills;

    public static SkillViewFragment newInstance (Player player) {
        SkillViewFragment skillViewFragment = new SkillViewFragment();
        skillViewFragment.setPlayer(player);

        return skillViewFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_player_skill, container, false);
        fightSkills = (TextView) rootview.findViewById(R.id.fightSkills);
        personalSkills = (TextView) rootview.findViewById(R.id.personalSkills);

        return rootview;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        setTextSkillView();

    }

    public void setTextSkillView () {

        fightSkills.setText("\nHealth Points : " + player.getHealthPoint() +
                "\nStamina : " + player.getStamina() +
                "\nAttack: " + player.getAttack() +
                "\nParry : " + player.getParry()
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

    public TextView getFightSkills() {
        return fightSkills;
    }

    public TextView getPersonalSkills() {
        return personalSkills;
    }
}
