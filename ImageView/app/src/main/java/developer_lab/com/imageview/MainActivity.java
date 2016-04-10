package developer_lab.com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView image;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image=(ImageView)findViewById(R.id.imageViewId);
        txt=(TextView)findViewById(R.id.TextViewId);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x="Steve Jobs";
                txt.setText(x);
            }
        });
    }
}
