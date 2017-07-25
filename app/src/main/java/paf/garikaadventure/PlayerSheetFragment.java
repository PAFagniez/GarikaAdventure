package paf.garikaadventure;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import paf.garikaadventure.Characters.Player;

/**
 * Created by PAF on 20/07/2017.
 */

public class PlayerSheetFragment extends Fragment {

    private Player player;
    private SkillViewFragment skillViewFragment;
    private String dialogTitle = "Change name";
    private String dialogMessage = "Type the name of your character";
    private String errorMessage = "The name typed must contain at least 2 letters";
    private String dialogValidation = "Validate";
    private TextView heroName;
    private EditText heroNameEditor;

    private ImageView vImageSelected;

    public static PlayerSheetFragment newInstance (Player player) {
        PlayerSheetFragment playerSheetFragment = new PlayerSheetFragment();
        playerSheetFragment.setPlayer(player);

        return playerSheetFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.fragment_player_sheet, container, false);
        heroName = (TextView) rootview.findViewById(R.id.playerName);
        heroName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startDialogChangeName(null);
            }
        });

        skillViewFragment = SkillViewFragment.newInstance(player);
        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        ft.add(R.id.skillView, skillViewFragment).commit();

        return rootview;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
    }


    public void startDialogChangeName(final String error) {

        LayoutInflater linf = getActivity().getLayoutInflater();
        final View inflator = linf.inflate(R.layout.dialog_change_name, null);
        AlertDialog.Builder alert = new AlertDialog.Builder(getContext());

        if(error != null) {
            alert.setTitle(dialogTitle).setMessage(dialogMessage + "\n" + error);
        } else {
            alert.setTitle(dialogTitle).setMessage(dialogMessage);
        }
        alert.setView(inflator);

        heroNameEditor = (EditText) inflator.findViewById(R.id.heroNameEditor);

        alert.setPositiveButton(dialogValidation, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String nameEntered = heroNameEditor.getText().toString();
                if(nameEntered.length() < 2) {
                    startDialogChangeName(errorMessage);
                } else {
                    player.setName(nameEntered);
                    heroName.setText(nameEntered);
                }
            }
        });
        alert.show();
    }

    public void setTextSkillView(){
        skillViewFragment.setTextSkillView();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public SkillViewFragment getSkillViewFragment() {
        return skillViewFragment;
    }

    public ImageView getvImageSelected() {
        return vImageSelected;
    }

    public void setvImageSelected(ImageView vImageSelected) {
        this.vImageSelected = vImageSelected;
    }
}
