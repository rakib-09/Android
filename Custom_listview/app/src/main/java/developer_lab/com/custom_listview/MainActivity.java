package developer_lab.com.custom_listview;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListView listview;
    private listVIew_Adapter listVIew_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String [] book = new String [] {
                "The Alchemist",
                "To Kill a Mocking Bird",
                "Titanic",
                "Lost in Paradise",
                "The Hobbit",
                "Lord of The rings",
                "The Social Networks",
                "Game Of thrones",
                "White Fang",
                "scarface"
        };

        final String [] author=new String[]{
                "Paulo Coelho",
                "John Nash",
                "jhon Cameron",
                "Jhon Milton",
                "Stephan Jovetic",
                "Mark Jukerberg",
                "Khaled Al Hossaini",
                "J.J Fitkets",
                "Jul Varn",
                "Mario Puzo"


        };

        final String [] page=new String []{
                "200 Pages",
                "1200 Pages",
                "320 Pages",
                "230 Pages",
                "230 Pages",
                "201 Pages",
                "210 Pages",
                "650 Pages",
                "120 Pages",
                "443 Pages",
        };

        ArrayList<HashMap<String ,String>> authors = new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            HashMap<String, String> data = new HashMap<>();
            data.put("book",book[i]);
            data.put("author",author[i]);
            data.put("page",page[i]);

            authors.add(data);

        }
        listview=(ListView) findViewById(R.id.listID);
        listVIew_adapter =new listVIew_Adapter(getApplicationContext(),authors);
        listview.setAdapter(listVIew_adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int pos= position;

                Toast.makeText(MainActivity.this, "id Clicked: "+pos, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
