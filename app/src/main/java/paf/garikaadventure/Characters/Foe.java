package paf.garikaadventure.Characters;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by PAF on 26/06/2017.
 */

public class Foe extends Character implements Parcelable {
    public Foe (Player player) {
        setTarget(player);
        setLifePoint(30);
    }

    protected Foe(Parcel in) {
    }

    public static final Creator<Foe> CREATOR = new Creator<Foe>() {
        @Override
        public Foe createFromParcel(Parcel in) {
            return new Foe(in);
        }

        @Override
        public Foe[] newArray(int size) {
            return new Foe[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
    }
}
