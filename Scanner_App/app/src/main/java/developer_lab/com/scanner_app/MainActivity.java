package developer_lab.com.scanner_app;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public ImageView thumbPrint;
    private TextView result;
    public Runnable runnable;
    private AnimationDrawable thumbAnimation;
    private String[] mood;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mood = new String[]
                {
                        "Its Your Day !",
                        "SomeOne is Cranky",
                        "Smile! Its Good for You",
                        "Sad !",
                        "Excited !",
                        "You are Stressed Out",
                        "Happy Camper :)",
                        "No Comments",
                        "Hold your Thumb Again !!",
                        "Not Your Day :(",

                };

        thumbPrint = (ImageView) findViewById(R.id.thumb_print);


        thumbPrint.setBackgroundResource(R.drawable.animation);
        thumbAnimation = (AnimationDrawable) thumbPrint.getBackground();
        


        result = (TextView) findViewById(R.id.result);





        thumbPrint.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                thumbAnimation.start(); //start the animation.
                showResult();
                return true;
            }
        });


    }

    public void showResult(){
        runnable = new Runnable() {
            @Override
            public void run() {
                int rand = (int) (Math.random()* mood.length);

                result.setText(mood[rand]);

                //after setting result animation stop

                thumbAnimation.stop();

            }
        };

        Handler mHandler = new Handler();

        mHandler.postDelayed(runnable, 3000); //3 secs.
    }
}
