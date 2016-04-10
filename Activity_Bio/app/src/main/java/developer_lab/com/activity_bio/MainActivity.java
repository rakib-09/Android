package developer_lab.com.activity_bio;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView ryan;
    private ImageView pianist;
    private ImageView kwai;
    private ImageView nuremberg;
    private ImageView redLine;
    private ImageView list;
    private ImageView escape;
    private ImageView downfall;
    private ImageView dasboot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ryan=(ImageView)findViewById(R.id.privateRyan);
        pianist=(ImageView)findViewById(R.id.pianist);
        kwai=(ImageView)findViewById(R.id.kwai);
        nuremberg=(ImageView)findViewById(R.id.nuremberg);
        redLine=(ImageView)findViewById(R.id.redLine);
        list=(ImageView)findViewById(R.id.list);
        escape=(ImageView)findViewById(R.id.greatEscape);
        downfall=(ImageView)findViewById(R.id.downFall);
        dasboot=(ImageView)findViewById(R.id.dasBoot);


        ryan.setOnClickListener(this);
        pianist.setOnClickListener(this);
        kwai.setOnClickListener(this);
        nuremberg.setOnClickListener(this);
        redLine.setOnClickListener(this);
        list.setOnClickListener(this);
        escape.setOnClickListener(this);
        downfall.setOnClickListener(this);
        dasboot.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.dasBoot:

                Intent dasIntent=new Intent(MainActivity.this,Details_Activity.class);
                dasIntent.putExtra("name","DAS BOOT");
                dasIntent.putExtra("rating","8.3");
                dasIntent.putExtra("director","Wolfgang Petersen ");
                dasIntent.putExtra("cast", "Jürgen Prochnow, Herbert Grönemeyer ");
                startActivity(dasIntent);
                break;
            case R.id.downFall:
                Intent downfall=new Intent(MainActivity.this,Details_Activity.class);
                downfall.putExtra("name","DOWN FALL");
                downfall.putExtra("rating","8.3");
                downfall.putExtra("director","Oliver Hirschbiegel ");
                downfall.putExtra("cast","Bruno Ganz,  Alexandra Maria Lara");
                startActivity(downfall);
                break;
            case R.id.greatEscape:
                Intent greatEscape=new Intent(MainActivity.this,Details_Activity.class);
                greatEscape.putExtra("name","THE GREAT ESCAPE");
                greatEscape.putExtra("rating","8.3");
                greatEscape.putExtra("director","John Sturges");
                greatEscape.putExtra("cast"," Steve McQueen,  James Garner");
                startActivity(greatEscape);
                break;
            case R.id.kwai:
                Intent kwai=new Intent(MainActivity.this,Details_Activity.class);
                kwai.putExtra("name","THE BRIDGE OVER THE RIVER OF KWAI");
                kwai.putExtra("rating","8.2");
                kwai.putExtra("director","David Lean ");
                kwai.putExtra("cast","William Holden,  Alec Guinness");

                startActivity(kwai);
                break;
            case R.id.list:
                Intent list=new Intent(MainActivity.this,Details_Activity.class);
               list.putExtra("name","SCHIELDLER'S LIST");
                list.putExtra("rating","8.9");
                list.putExtra("director"," Steven Spielberg");
                list.putExtra("cast"," Liam Neeson,  Ralph Fiennes");


                startActivity(list);
                break;
            case R.id.pianist:
                Intent pianist=new Intent(MainActivity.this,Details_Activity.class);
                pianist.putExtra("name","THE PIANIST");
                pianist.putExtra("rating","8.5");
                pianist.putExtra("director"," Roman Polanski");
                pianist.putExtra("cast"," Adrien Brody,  Thomas Kretschmann");

                startActivity(pianist);
                break;
            case R.id.privateRyan:
                Intent ryan=new Intent(MainActivity.this,Details_Activity.class);
                ryan.putExtra("name","SAVING PRIVATE RYAN");
                ryan.putExtra("rating","8.6");
                ryan.putExtra("director"," Steven Spielberg");
                ryan.putExtra("cast"," Adrien Brody,  Thomas Kretschmann");

                startActivity(ryan);
                break;
            case R.id.redLine:
                Intent redline=new Intent(MainActivity.this,Details_Activity.class);
                redline.putExtra("name","THE THIN RED LINE");
                redline.putExtra("rating","7.8");
                redline.putExtra("director"," Terrence Malick ");
                redline.putExtra("cast"," Jim Caviezel,  Sean Penn");
                startActivity(redline);
                break;
            case R.id.nuremberg:
                Intent nuremberg=new Intent(MainActivity.this,Details_Activity.class);
                nuremberg.putExtra("name","JUSTICE OF NUREMBERG");
                nuremberg.putExtra("rating","8.3");
                nuremberg.putExtra("director","Stanley Kramer ");
                nuremberg.putExtra("cast", " Spencer Tracy,  Burt Lancaster");
                startActivity(nuremberg);
                break;
        }


    }
}
