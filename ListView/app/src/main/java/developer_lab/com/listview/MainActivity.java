package developer_lab.com.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listViewID);

        final String values[]= new String[]{
                "hello",
                "i am rakib",
                "who are you",
                "i am going to work with you",
                "do you love to work with me",
                "hello there",
                "is there anyone",
                "i am here"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,
        android.R.id.text1,values);

        //assign value into the listVIew
        listView.setAdapter(adapter);

        //set On item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int pos=position;

                Toast.makeText(MainActivity.this, values[pos], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
