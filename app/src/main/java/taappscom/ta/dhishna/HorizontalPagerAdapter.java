package taappscom.ta.dhishna;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static taappscom.ta.dhishna.Utils.setupItem;

/**
 * Created by Jugal on 12-08-2017.
 */

public class HorizontalPagerAdapter extends PagerAdapter {


    private final Utils.LibraryObject[] EVENTS = new Utils.LibraryObject[]{

            new Utils.LibraryObject(
                    R.drawable.comp,
                    "IT_Event1"
            ),

            new Utils.LibraryObject(
                    R.drawable.comp,
                    "IT_Event2"

            ),

            new Utils.LibraryObject(
                    R.drawable.comp,
                    "IT_Event3"

            ),

            new Utils.LibraryObject(
                    R.drawable.comp,
                    "IT_Event4"

            )

    };

    private Context mContext;


    private LayoutInflater mLayoutInflater;



    private boolean mIsTwoWay;



    public HorizontalPagerAdapter(final Context context, final boolean isTwoWay) {

        mContext = context;

        mLayoutInflater = LayoutInflater.from(context);

        mIsTwoWay = isTwoWay;

    }



    @Override

    public int getCount() {

        return mIsTwoWay ? 6 : EVENTS.length;

  }



    @Override

    public int getItemPosition(final Object object) {

        return POSITION_NONE;

    }



    @Override

    public Object instantiateItem(final ViewGroup container, final int position) {

        final View view;

        if (mIsTwoWay) {
            view = mLayoutInflater.inflate(R.layout.items_horizontalpager, container, false);
   //         view = mLayoutInflater.inflate(R.layout.two_way_item, container, false);



          //  final VerticalInfiniteCycleViewPager verticalInfiniteCycleViewPager =

            //        (VerticalInfiniteCycleViewPager) view.findViewById(R.id.vicvp);

            //verticalInfiniteCycleViewPager.setAdapter(

              //      new VerticalPagerAdapter(mContext)

            //);

 //           verticalInfiniteCycleViewPager.setCurrentItem(position);

        } else {
            //SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(this.mContext);
            //int branch_id=sharedPreferences.getInt("Branch_Name",-1);
            //if(branch_id==0)
                view=mLayoutInflater.inflate(R.layout.items_horizontalpager,container,false);
            //else
              //  view=null;
           // SharedPreferences sharedPreferences= PreferenceManager.getDefaultSharedPreferences(mContext);
           // int branch_id=sharedPreferences.getInt("Branch_Name",-1);

           // if(branch_id==0)
            setupItem(view, EVENTS[position]);

        }



        container.addView(view);

        return view;

    }



    @Override

    public boolean isViewFromObject(final View view, final Object object) {

        return view.equals(object);

    }



    @Override

    public void destroyItem(final ViewGroup container, final int position, final Object object) {

        container.removeView((View) object);

    }


}

