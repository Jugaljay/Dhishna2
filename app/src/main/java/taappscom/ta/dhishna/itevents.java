package taappscom.ta.dhishna;


import android.app.Fragment;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.HamButton;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;
import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;
import com.nightonke.boommenu.*;
/**
 * Created by Jugal on 05-08-2017.
 */

public class itevents extends Fragment{
    ResideMenu resideMenu;
View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.popup_it, container, false);
        BoomMenuButton bmb = (BoomMenuButton)view.findViewById(R.id.bmb);
        bmb.setButtonEnum(ButtonEnum.Ham);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.HAM_2);
        bmb.setButtonTopMargin(10);
        bmb.setButtonBottomMargin(10);
        bmb.setButtonLeftMargin(10);
        bmb.setButtonRightMargin(10);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.HAM_2);
        bmb.getCustomButtonPlacePositions().add(new PointF(Util.dp2px(-80), Util.dp2px(-80)));
        bmb.getCustomButtonPlacePositions().add(new PointF(0, 0));
        bmb.getCustomButtonPlacePositions().add(new PointF(Util.dp2px(+80), Util.dp2px(+80)));

        for (int i = 0; i < bmb.getPiecePlaceEnum().pieceNumber(); i++) {
            HamButton.Builder builder = new HamButton.Builder()
                    .normalImageRes(R.drawable.ic_launcher)
                    .normalText("Butter Doesn't fly!")
                    .subNormalText("Little butter Doesn't fly, either!");
            bmb.addBuilder(builder);
        }





        return view;
    }
    public void setUpViews() {

     /*   resideMenu = new ResideMenu(this.getActivity());
        resideMenu.setBackground(R.drawable.ic_launcher);
        resideMenu.attachToActivity(this.getActivity());
        String titles[] = {"home", "Events", "Schedule"};
        int icon[] = {R.drawable.ic_launcher, R.drawable.ic_launcher, R.drawable.ic_launcher};
        for (int i = 0; i < 2; i++) {
            ResideMenuItem item = new ResideMenuItem(this.getActivity(), icon[i], titles[i]);
            ResideMenuItem itemrt = new ResideMenuItem(this.getActivity(), icon[i], titles[i]);
            //item.setOnClickListener();
            resideMenu.addMenuItem(item, ResideMenu.DIRECTION_LEFT);
            resideMenu.addMenuItem(itemrt, ResideMenu.DIRECTION_RIGHT);

*/
        }



    }




