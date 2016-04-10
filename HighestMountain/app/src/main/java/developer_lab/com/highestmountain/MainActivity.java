package developer_lab.com.highestmountain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button mybtn;
    TextView lTxt;
    TextView mtxt;
    TextView stxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mybtn=(Button)findViewById(R.id.buttonId);
        lTxt=(TextView)findViewById(R.id.textViewId);
        mtxt=(TextView)findViewById(R.id.textView);
        stxt=(TextView)findViewById(R.id.textViewId3);

        mountain();
       }

    void mountain()
    {

        final String[] mountain ={"Everest","Daneli","Killimanjaro","Kamet","Trivor","K12","Distaghil Sar","Aoraki"};
        final  String[] msize={"29,029 ft","20,308 ft","19,341 ft","25,446 ft","24,859 ft","28,251 ft", "25,869 ft","12,218 ft" };
        final String[] mplace={"Nepal","Alaska","Tanzania","India","Pakistan","India","Pakistan","New Zeland" };

        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int x=rand.nextInt(mountain.length);
                lTxt.setText(mountain[x]);
                mtxt.setText(msize[x]);
                stxt.setText(mplace[x]);


            }
        });

    }

}
