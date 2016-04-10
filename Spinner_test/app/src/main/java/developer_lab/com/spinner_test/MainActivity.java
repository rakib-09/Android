package developer_lab.com.spinner_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spin1;
    private Spinner spin2;
    private TextView txt1;
    private TextView txt2;

    public String x=null,y=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin1=(Spinner)findViewById(R.id.spinner1Id);
        spin2=(Spinner)findViewById(R.id.spinner2Id);
        txt1=(TextView)findViewById(R.id.textView);
        txt2=(TextView)findViewById(R.id.textView2);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                x= spin2.getSelectedItem().toString();
                txt1.setText(x);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                y= spin2.getSelectedItem().toString();
                txt2.setText(y);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
//
//        dropdown();
        /*spin2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String y= spin2.getSelectedItem().toString();
                txt2.setText(y);
            }
        });*/
    }

//        void dropdown()
//        {
//        }
}
