package rakib.calc;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v)
    {
        //2textfield
        EditText a1= (EditText) findViewById(R.id.num1);
        EditText a2= (EditText) findViewById(R.id.num2);
        //result-show
        TextView tv= (TextView) findViewById(R.id.result);

        double x,y,z;
        x=Double.parseDouble(a1.getText().toString());
        y=Double.parseDouble(a2.getText().toString());
        z=0;


        if(v.getId()==R.id.add)
        {
            z=x+y;

        }
        else if(v.getId()==R.id.sub)
        {

            z=x-y;
        }
        else if(v.getId()==R.id.mul)
        {
            z=x*y;

        }
        else if(v.getId()==R.id.div)
        {
            z=x/y;

        }
        tv.setText(z+"");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
