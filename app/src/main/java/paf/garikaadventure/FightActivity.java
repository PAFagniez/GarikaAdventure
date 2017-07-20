package paf.garikaadventure;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import paf.garikaadventure.Characters.Foe;
import paf.garikaadventure.Characters.Player;
import paf.garikaadventure.Items.Weapons.WoodenAxe;

public class FightActivity extends FragmentActivity {

    private Player player;
    private Foe foe;
    private TextView infoFight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);
        player = new Player();
        player.setName("Aringoth");
        player.setWeapon(new WoodenAxe());

        foe = new Foe(player);
        foe.setWeapon(new WoodenAxe());
        foe.setTarget(player);
        player.setTarget(foe);

        TextView playerName = (TextView) findViewById(R.id.playerName);
        ImageView playerImage = (ImageView) findViewById(R.id.playerImage);
        Button attackButton = (Button) findViewById(R.id.attackButton);
        Button fleeButton = (Button) findViewById(R.id.fleeButton);

        playerName.setText(player.getName());
        playerImage.setImageResource(R.drawable.player);
        playerImage.setOnClickListener(playerAttack);

        infoFight = (TextView) findViewById(R.id.infoFight);
        attackButton.setOnClickListener(playerAttack);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment characterFragment = CharacterFragment.newInstance(player, foe);
        ft.add(R.id.FoeFragmtContainer, characterFragment);
        ft.commit();
    }

    private View.OnClickListener playerAttack = new View.OnClickListener() {
        public void onClick(View v) {
            player.attack();
            infoFight.setText("Player has attack and gave " + player.getDamage() + " damage" );
            foe.looseLife();
            if (!foe.isAlive()){
                infoFight.setText(" Enemy is dead");
            }
        }
    };


}
