package paf.garikaadventure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

import paf.garikaadventure.Characters.Player;

/**
 * Created by PAF on 15/07/2017.
 */

public class PlayerCreationActivity extends FragmentActivity {

    private Player player;
    private String dialogTitle = "Change character";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_creation);

        player = new Player();
        TextView nameEditor = (TextView) findViewById(R.id.playerName);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment playerSheet = PlayerSheetFragment.newInstance(player);
        ft.add(R.id.fragContainer, playerSheet);
        ft.commit();
    }


    private View.OnClickListener diplayDialogNameEditor = new View.OnClickListener() {
        public void onClick(View v) {
            AlertDialog.Builder builder = new AlertDialog.Builder(PlayerCreationActivity.this);
            builder.setTitle(dialogTitle);
        }
    };
}
