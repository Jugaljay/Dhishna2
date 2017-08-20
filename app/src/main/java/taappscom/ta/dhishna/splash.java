package taappscom.ta.dhishna;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Animation animation1;
      //  LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.animation_view);
       // animationView.setAnimation("data.json");
        //animationView.loop(true);
        //animationView.playAnimation();
        // animation1= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.animation);
        // animation1.start();
        Thread logoTimer = new Thread() {
            public void run(){
                try{
                    int logoTimer = 0;
                    while(logoTimer < 2000){
                        sleep(100);
                        logoTimer = logoTimer +100;
                    }
                    startActivity(new Intent("taappscom.ta.CLEARSCREEN"));
                }

                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

                finally{
                    finish();
                }
            }
        };

        logoTimer.start();
    }


}
