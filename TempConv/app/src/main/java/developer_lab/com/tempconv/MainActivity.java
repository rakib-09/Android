package developer_lab.com.tempconv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //import data in java code
    private TextView title;
    private EditText txt1;
    private Button btn1;
    private Button btn2;
    private TextView result;

    DecimalFormat round =new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sync with XML and JAVA
        title=(TextView)findViewById(R.id.titleId);
        txt1=(EditText)findViewById(R.id.editTextId);
        btn1=(Button)findViewById(R.id.button1Id);
        btn2=(Button)findViewById(R.id.button2);
        result=(TextView)findViewById(R.id.result);
        setResult();

    }

    void setResult()
    {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Convert to Celsius
                String editTextVal=txt1.getText().toString();
                if(editTextVal.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Insert a Value", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double intTextVal=Double.parseDouble(editTextVal);
                    double resultVal = cToCel(intTextVal);

                    String rV=String.valueOf(round.format(resultVal));

                    result.setText(rV + " C");
                }

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Convert to Fahrenheit
                String editTextVal=txt1.getText().toString();
                
                if(editTextVal.isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Insert a Value !", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    double intTextVal=Double.parseDouble(editTextVal);
                    double resultVal = cToFar(intTextVal);

                    String rv=String.valueOf(round.format(resultVal));
                    result.setText(rv+" F");

                }

            }
        });
    }

    public double cToCel(double farVal)
    {
        double resultCel;
        resultCel=(farVal-32)*5/9;
        return resultCel;
    }
    public double cToFar(double celVal)
    {
        double resultFar;
        resultFar=(celVal*9/5)+32;
        return resultFar;
    }
}
