package taappscom.ta.dhishna;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

/**
 * Created by Jugal on 05-08-2017.
 */

public class itevents extends Fragment{
    ResideMenu resideMenu;
View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.it_events, container, false);
        setUpViews();

        return view;
    }
    public void setUpViews() {

        resideMenu = new ResideMenu(this.getActivity());
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


        }



    }


    }

