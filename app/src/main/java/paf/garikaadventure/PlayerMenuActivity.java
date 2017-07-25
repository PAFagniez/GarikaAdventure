package paf.garikaadventure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import paf.garikaadventure.Characters.Foe;
import paf.garikaadventure.Characters.Player;
import paf.garikaadventure.Items.Weapons.WoodenAxe;

/**
 * Created by PAF on 22/07/2017.
 */

public class PlayerMenuActivity extends FragmentActivity implements View.OnClickListener {

    private Button bFindFoe;
    private Player player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_player_menu);
//        bFindFoe = (Button) findViewById(R.id.);
        Intent i = new Intent();
        player = getIntent().getExtras().getParcelable("player");
    }

    public void findFoe() {
        Foe foe = new Foe(player);
        foe.setWeapon(new WoodenAxe());
        foe.setTarget(player);

        Intent i = new Intent(PlayerMenuActivity.this, FightActivity.class);
        i.putExtra("foe", foe);
        i.putExtra("player", player);

        startActivity(i);
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.findFoe :
//                findFoe();
//                break;
//        }
    }
}
