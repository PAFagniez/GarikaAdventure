package paf.garikaadventure

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.View
import android.widget.Button

import paf.garikaadventure.Characters.Foe
import paf.garikaadventure.Characters.Player
import paf.garikaadventure.Items.Weapons.WoodenAxe

/**
 * Created by PAF on 22/07/2017.
 */

class PlayerMenuActivity : FragmentActivity(), View.OnClickListener {

    private val bFindFoe: Button? = null
    private var player: Player? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //        setContentView(R.layout.activity_player_menu);
        //        bFindFoe = (Button) findViewById(R.id.);
        val i = Intent()
        player = intent.extras.getParcelable<Player>("player")
    }

    fun findFoe() {
        val foe = Foe(player)
        foe.weapon = WoodenAxe()
        foe.target = player

        //val i = Intent(PlayerMenuActivity.this, FightActivity.class)
       // i.putExtra("foe", foe)
       // i.putExtra("player", player)

        //startActivity(i)
    }

    override fun onClick(v: View) {
        //        switch (v.getId()) {
        //            case R.id.findFoe :
        //                findFoe();
        //                break;
        //        }
    }
}
