package paf.garikaadventure;

import android.support.v4.app.DialogFragment;
import android.widget.LinearLayout;

/**
 * Created by PAF on 22/07/2017.
 */

public class PlayerPictureSelectionFragment extends DialogFragment {

    private LinearLayout layout;
    private PlayerSheetFragment playerSheetFragment;

    public static PlayerPictureSelectionFragment newInstance (PlayerSheetFragment playerSheetFragment) {
        PlayerPictureSelectionFragment playerPictureSelectionFragment = new PlayerPictureSelectionFragment();
//        playerPictureSelectionFragment.setPlayerSheetFragment(playerSheetFragment);
        return playerPictureSelectionFragment;
    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View rootview = inflater.inflate(R.layout.fragment_picture_selection, container, false);
//
//        layout = (LinearLayout) rootview.findViewById(R.id.picturesHolder);
//
//        ImageView imageView = new ImageView(getContext());
//        imageView.setId(R.id.foeImage);
//        imageView.setPadding(2, 2, 2, 2);
//        imageView.setImageBitmap(BitmapFactory.decodeResource(
//                rootview.getResources(), R.drawable.foe));
//        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
//        layout.addView(imageView);
//        imageView.setOnClickListener(getImage);
//
//        ImageView imageView2 = new ImageView(getContext());
//        imageView2.setId(R.id.playerImage);
//        imageView2.setPadding(2, 2, 2, 2);
//        imageView2.setImageBitmap(BitmapFactory.decodeResource(
//                rootview.getResources(), R.drawable.player));
//        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
//        layout.addView(imageView2);
//        imageView2.setOnClickListener(getImage);
//
//        ImageView imageView3 = new ImageView(getContext());
//        imageView3.setId(R.id.heroName);
//        imageView3.setPadding(2, 2, 2, 2);
//        imageView3.setImageBitmap(BitmapFactory.decodeResource(
//                rootview.getResources(), R.drawable.ic_launcher));
//        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);
//        layout.addView(imageView3);
//        imageView3.setOnClickListener(getImage);
//
//        return rootview;
//    }


//    View.OnClickListener getImage = new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            playerSheetFragment.setvImageSelected((ImageView) view);
//            playerSheetFragment.getPlayer().setPicture(playerSheetFragment.getvImageSelected());
//            onDestroy();
//        }
//    };

    public PlayerSheetFragment getPlayerSheetFragment() {
        return playerSheetFragment;
    }

//    public void setPlayerSheetFragment(PlayerSheetFragment playerSheetFragment) {
//        this.playerSheetFragment = playerSheetFragment;
//    }
}
