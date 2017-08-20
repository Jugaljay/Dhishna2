package taappscom.ta.dhishna;

import android.app.Activity;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;

/**
 * Created by Jugal on 12-08-2017.
 */

public class EventPageAdapter extends Fragment
{
    @Nullable

    @Override

    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {

        //       SharedPreferences sp = getSharedPreferences("your_prefs", Activity.MODE_PRIVATE);
   //     int myIntValue = sp.getInt("your_int_key", -1);
        return inflater.inflate(R.layout.event_gist_it, container, false);


    }
    @Override

    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {

        super.onViewCreated(view, savedInstanceState);


        final HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =

                (HorizontalInfiniteCycleViewPager) view.findViewById(R.id.hicvp);

        horizontalInfiniteCycleViewPager.setAdapter(new HorizontalPagerAdapter(this.getActivity(), false));


    }
    }
