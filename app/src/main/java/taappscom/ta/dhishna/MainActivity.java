package taappscom.ta.dhishna;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.avast.android.dialogs.fragment.SimpleDialogFragment;
import com.avast.android.dialogs.iface.INegativeButtonDialogListener;
import com.avast.android.dialogs.iface.ISimpleDialogListener;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

import java.util.zip.Inflater;

public class MainActivity extends FragmentActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setDefaultTab(R.id.tab_home);
        final Context context = this;
        // LinearLayout ll=(LinearLayout)findViewById(R.id.schedule_layout);
        final FrameLayout fl = (FrameLayout) findViewById(R.id.contents);
        final LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final FragmentManager fragmentManager = getFragmentManager();
        //  final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
       // TextView myTextView=(TextView)findViewById(R.id.title_price);
       // Typeface typeFace=Typeface.createFromAsset(getAssets(),"fonts/BebasNeue.otf");
       // myTextView.setTypeface(typeFace);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabID) {
                if (tabID == R.id.tab_eventCal) {

                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Scheduler fragment = new Scheduler();

                    fragmentTransaction.replace(R.id.contents, fragment);
                    //  fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commitAllowingStateLoss();

                    //fl.removeAllViews();
                    // LinearLayout ll=(LinearLayout)inflater.inflate(R.layout.schedule,null);
                    // fl.addView(ll);
                }
                if (tabID == R.id.tab_contact) {


                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    contactus fragment = new contactus();
                    String s = fragment.getTag();
                    fragmentTransaction.replace(R.id.contents, fragment);
                    //  fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commitAllowingStateLoss();

                    // LinearLayout ll=(LinearLayout)inflater.inflate(R.layout.contacts,null);
                    //  fl.removeAllViews();
                    // fl.addView(ll);

                }
                if (tabID == R.id.tab_events) {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                    Eventsall fragment = new Eventsall();
                    fragmentTransaction.replace(R.id.contents, fragment);
                    // fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commitAllowingStateLoss();

                }
                if (tabID == R.id.tab_home) {
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                    Home fragment = new Home();
                    fragmentTransaction.replace(R.id.contents, fragment);
                    // fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commitAllowingStateLoss();


                }

            }


        });
        fragmentManager.addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() {
            @Override
            public void onBackStackChanged() {
                if (getFragmentManager().getBackStackEntryCount() == 0) {
                    SimpleDialogFragment.createBuilder(context, getSupportFragmentManager()).setTitle("Dhishna").setMessage("Please don't go away ").setPositiveButtonText("cool").setNegativeButtonText("go to go").show();

                    // finish();
                }


            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                if (tabId == R.id.tab_events) {
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Eventsall fragment = new Eventsall();
                    fragmentTransaction.replace(R.id.contents, fragment);
                    fragmentTransaction.commit();
                    // The tab with id R.id.tab_favorites was reselected,
                    // change your content accordingly.
                }
            }
        });

    }
    public void onBackPressed()
    { SimpleDialogFragment.createBuilder(this, getSupportFragmentManager()).setTitle("Dhishna").setMessage("Please don't go away ").setPositiveButtonText("cool").setNegativeButtonText("go to go").show();


    }
}
