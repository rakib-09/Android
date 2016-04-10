package developer_lab.com.currnecyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    public TextView title;
    public Spinner spinner1;
    public Spinner spinner2;
    public EditText txt1;
    public Button convert;
    public TextView result;

    public    String spin1,spin2,Value;
    public Double rs;
    public String txt;
    DecimalFormat round=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title=(TextView)findViewById(R.id.textView);
        spinner1 = (Spinner) findViewById(R.id.spinner1Id);
        txt1 = (EditText) findViewById(R.id.editTextId);
        spinner2 = (Spinner) findViewById(R.id.spinner2Id);
        convert = (Button) findViewById(R.id.buttonId);
        result = (TextView) findViewById(R.id.textView2Id);

        //get value from Spinner1
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin1 = parent.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin1 = "Dollar";
            }
        });

        //get value from spinner2


        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                spin2 = parent.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin2 = "Dollar";
            }
        });


        //button click
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculate();
                result.setText(Value);
            }
        });


    }



     void calculate() {


         //take value from spinner1
         /*
        spinner1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                spin1 = parent.getSelectedItem().toString();
                //Toast.makeText(MainActivity.this, parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });


        //take value from spinner2
        spinner2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                spin2 = parent.getSelectedItem().toString();
               // Toast.makeText(MainActivity.this,parent.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });

*/



         Double val=Double.parseDouble(txt1.getText().toString());

            /*
             if (spin1 == "Dollar" && spin2 == "Dollar") {
                rs = Double.parseDouble(txt);

                 Value=round.format(rs);
                 result.setText(Value);

            }
             if(spin1=="Taka" && spin2== "Taka")
            {
                rs = Double.parseDouble(txt);
                Value=round.format(rs);
                result.setText(Value);
            }
            */
             if (spin1 == "Dollar" && spin2 == "Taka") {
                //Double val = Double.parseDouble(txt);
                rs = val * 78.46;
                Value=round.format(rs);
                result.setText(Value);

            }
            else if (spin1 == "Taka" && spin2 == "Dollar") {
                //Double val = Double.parseDouble(txt);
                rs = val / 78.46;
                Value=round.format(rs);
                result.setText(Value);

            }
         /*
            if(spin1=="Rupee" && spin2=="Rupee")
            {
                //rs = Double.parseDouble(txt);
                Value=round.format(rs);
                result.setText(Value);
            }
            */
            else if(spin1=="Rupee" && spin2== "Taka")
            {
                //Double val = Double.parseDouble(txt);
                rs = val * 1.25;
                //Value=round.format(rs);
                String r=rs.toString();
                Toast.makeText(MainActivity.this, r, Toast.LENGTH_SHORT).show();
                result.setText(r);

            }
             else if(spin1=="Taka" && spin2=="Rupee")
            {
                //Double val = Double.parseDouble(txt);
                rs = val / 1.25;
                Value=round.format(rs);
                result.setText(Value);
            }
            else if(spin1=="Dollar" && spin2=="Rupee")
            {
                //Double val = Double.parseDouble(txt);
                rs = val * 65.66;
                Value=round.format(rs);
                result.setText(Value);
            }
            else if(spin1=="Rupee" && spin2=="Dollar")
            {
                //Double val = Double.parseDouble(txt);
                rs = val / 65.66;
                Value=round.format(rs);
                result.setText(Value);
            }
         else
               // rs = Double.parseDouble(txt);
                //Value=round.format(val);
             {
                 String vick = String.valueOf(val);
                 result.setText(vick);

             }

     }


}