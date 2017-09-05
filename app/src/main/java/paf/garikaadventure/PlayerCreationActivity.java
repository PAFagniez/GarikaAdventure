package paf.garikaadventure;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.Random;

import paf.garikaadventure.Characters.Player;
import paf.garikaadventure.Items.Weapons.WoodenAxe;

/**
 * Created by PAF on 15/07/2017.
 */

public class PlayerCreationActivity extends FragmentActivity implements View.OnClickListener{

    private final int MIN = 1;
    private final int MAX = 6;
    private Random rand;
    private Player player;
    private Button skillGenerator;
    private Button validate;
    private FrameLayout pictureSelection;
    private PlayerSheetFragment playerSheet;
    private PlayerPictureSelectionFragment pictureSelectionFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_creation);
        rand = new Random();

        player = new Player();
        player.setWeapon(new WoodenAxe());
        skillGenerator = (Button) findViewById(R.id.generateSkill);
//        pictureSelection = (FrameLayout) findViewById(R.id.pictureSelectionFL);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        playerSheet = PlayerSheetFragment.newInstance(player);
        ft.add(R.id.fragContainer, playerSheet);
        ft.commit();

        skillGenerator = (Button) findViewById(R.id.generateSkill);
        validate = (Button) findViewById(R.id.validate);

        generateSkills();
    }

    public void generateSkills() {
        player.setLifePoint((rand.nextInt(35 - 20 + 1) + 20));
        player.setStamina((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setAttack((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setParry((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setIntelligence((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setCharisma((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setStrength((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setBravery((rand.nextInt(MAX - MIN + 1) + MIN)+7);
        player.setAgility((rand.nextInt(MAX - MIN + 1) + MIN)+7);

    }

    public void startPictureSelectionFragment () {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        FrameLayout fl = (FrameLayout) findViewById(R.id.fragContainer);
        pictureSelectionFragment = PlayerPictureSelectionFragment.newInstance(playerSheet);
        ft.add(R.id.pictureHolderFL, pictureSelectionFragment);
        validate.setVisibility(View.GONE);
        skillGenerator.setVisibility(View.GONE);;
        skillGenerator.setVisibility(View.GONE);
        fl.setVisibility(View.GONE);
    }

    public void destroyPictureSelectionFragment () {

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        if(pictureSelection != null) {
            ft.remove(pictureSelectionFragment).commit();
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.generateSkill :
                generateSkills();
                playerSheet.getSkillViewFragment().setTextSkillView();
                break;

            case R.id.validate :
           //     Intent intent = new Intent(PlayerCreationActivity.this, PlayerMenuActivity.class);
         //       intent.putExtra("player", player);
       //         startActivity(intent);
                break;

            case R.id.playerImage :
                    startPictureSelectionFragment();
                break;

            case R.id.pictureHolderFL :
                destroyPictureSelectionFragment();
                break;
            }


    }
}
