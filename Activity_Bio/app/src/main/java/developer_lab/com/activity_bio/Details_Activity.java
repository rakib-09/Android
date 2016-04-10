package developer_lab.com.activity_bio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details_Activity extends AppCompatActivity {

    private ImageView img;

    private TextView name,rate,dir,cast;
    private Bundle extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        img=(ImageView)findViewById(R.id.imageView);
        name=(TextView)findViewById(R.id.name);
        rate=(TextView)findViewById(R.id.textView4);
        dir=(TextView)findViewById(R.id.textView6);
        cast=(TextView)findViewById(R.id.textView8);

        extra= getIntent().getExtras();
        if(extra!=null)
        {
            String fname=extra.getString("name");
            details(fname);

        }




    }


    public void details(String mName)
    {
        if(mName.equals("DAS BOOT"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.das));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));

        }
        else if(mName.equals("DOWN FALL"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.down));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
        }
        else if(mName.equals("THE GREAT ESCAPE"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.escape));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
        }
        else if(mName.equals("THE BRIDGE OVER THE RIVER OF KWAI"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.kwai));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
        }

        else if(mName.equals("SCHIELDLER'S LIST"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.list));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
        }

        else if(mName.equals("THE PIANIST"))
         {
            img.setImageDrawable(getResources().getDrawable(R.drawable.pianist));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
         }
        else if(mName.equals("SAVING PRIVATE RYAN"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.ryan));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
         }

        else if(mName.equals("THE THIN RED LINE"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.redline));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
        }
        else if(mName.equals("JUSTICE OF NUREMBERG"))
        {
            img.setImageDrawable(getResources().getDrawable(R.drawable.nuremberg));
            name.setText(mName);
            rate.setText(extra.getString("rating"));
            dir.setText(extra.getString("director"));
            cast.setText(extra.getString("cast"));
        }

    }
}
