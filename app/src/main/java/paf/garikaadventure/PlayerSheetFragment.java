package paf.garikaadventure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import paf.garikaadventure.Characters.Player;

/**
 * Created by PAF on 20/07/2017.
 */

public class PlayerSheetFragment extends Fragment {

    private Player player;

    public static PlayerSheetFragment newInstance (Player player) {
        PlayerSheetFragment playerSheetFragment = new PlayerSheetFragment();
        playerSheetFragment.setPlayer(player);

        return playerSheetFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_player_sheet, container, false);

        Fragment skillViewFragment = SkillViewFragment.newInstance(player);
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ft.add(R.id.skillView, skillViewFragment).commit();

        return rootview;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
