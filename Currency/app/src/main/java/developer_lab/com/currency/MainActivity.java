package developer_lab.com.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public Spinner spin1,spin2;
    public EditText edit;
    public Button btn;
    public TextView txt;
    public ArrayList al;
    public String s1,s2,b1;
    public  double r1,r2;
    public String rs;
    public ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        al=new ArrayList();
        al.add("Dollar");
        al.add("Taka");
        al.add("Rupee");

        aa=new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,al);




        spin1=(Spinner) findViewById(R.id.spinner);
        edit=(EditText) findViewById(R.id.editText);
        spin2=(Spinner) findViewById(R.id.spinner2);
        btn=(Button) findViewById(R.id.button);
        txt=(TextView) findViewById(R.id.textView);

        spin1.setAdapter(aa);
        spin2.setAdapter(aa);

        spin1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s1=spin1.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), s1, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spin2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                s2 = spin2.getSelectedItem().toString();
                Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
           // public String b1;

            @Override
            public void onClick(View v) {

               b1 = edit.getText().toString();
               // result(s1, s2);
                //Toast.makeText(getApplicationContext(), b1, Toast.LENGTH_SHORT).show();

                if (s1 == "Taka" && s2=="Rupee")

                {
                    r1 = Double.parseDouble(b1);
                    r2 = r1 / 1.25;
                    rs = String.valueOf(r2);
                    txt.setText(rs);
                }
                else if(s1=="Rupee" && s2=="Taka")
                {
                    r1 = Double.parseDouble(b1);
                    r2 = r1 * 1.25;
                    rs = String.valueOf(r2);
                    txt.setText(rs);
                }
                else if(s1=="Taka" && s2=="Dollar")
                {
                    r1 = Double.parseDouble(b1);
                    r2 = r1 / 78.46;
                    rs = String.valueOf(r2);
                    txt.setText(rs);
                }
                else if(s1=="Dollar" && s2=="Taka")
                {
                    r1 = Double.parseDouble(b1);
                    r2 = r1 * 78.46;
                    rs = String.valueOf(r2);
                    txt.setText(rs);
                }
                else if(s1=="Dollar" && s2=="Rupee")
                {
                    r1 = Double.parseDouble(b1);
                    r2 = r1 * 76.68;
                    rs = String.valueOf(r2);
                    txt.setText(rs);
                }
                else if(s1=="Rupee"&& s2=="Dollar")
                {
                    r1 = Double.parseDouble(b1);
                    r2 = r1 / 76.68;
                    rs = String.valueOf(r2);
                    txt.setText(rs);
                }
                else
                {
                    txt.setText(b1);
                }

            }
        });


    }

//        void result( String x, String y)
//        {
//
//
//
//
//
//        }
}
