package developer_lab.com.alert_dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private AlertDialog.Builder dialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button) findViewById(R.id.buttonID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //create own dialog
                dialog= new AlertDialog.Builder(MainActivity.this);

                //set Title
                dialog.setTitle(getResources().getString(R.string.title));

                //set message
                dialog.setMessage(getResources().getString(R.string.message));

                //set cancelable
                dialog.setCancelable(false);

                //set positive Button
                dialog.setPositiveButton(getResources().getString(R.string.pos), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.this.finish();
                    }
                });

                //set negative button
                dialog.setNegativeButton(getResources().getString(R.string.neg), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                //create alert
                AlertDialog alert = dialog.create();

                // alert show
                alert.show();




            }
        });
    }
}
