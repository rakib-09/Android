package developer_lab.com.database;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    dbConnect mydb=new dbConnect(this);
    EditText name,surname,marks,id;
    Button insert,show,update,delete;
    TextView idname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb=new dbConnect(this);

        name=(EditText) findViewById(R.id.nameID);
        surname= (EditText) findViewById(R.id.surnameID);
        marks= (EditText) findViewById(R.id.marksID);
        insert=(Button) findViewById(R.id.addData);
        show=(Button)findViewById(R.id.showData);
        id=(EditText)findViewById(R.id.idedit);
        update=(Button)findViewById(R.id.updateID);
        idname=(TextView)findViewById(R.id.idview);
        delete=(Button)findViewById(R.id.deleteID);

        id.setVisibility(View.GONE);
        idname.setVisibility(View.GONE);

        addData();
        showData();
        updatedata();
        deletedata();



    }
    public void addData(){
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean inserted = mydb.insertData(name.getText().toString(), surname.getText().toString(), marks.getText().toString());

                if (inserted == true) {
                    Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Not Inserted", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void showData()
    {
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Cursor res=mydb.showData();
                if(res.getCount()==0)
                {
                    inbox("ERROR","NOTHING FOUND");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext())
                {
                    buffer.append("ID:"+res.getString(0)+"\n");
                    buffer.append("NAME:"+res.getString(1)+"\n");
                    buffer.append("SURNAME:"+res.getString(2)+"\n");
                    buffer.append("MARKS:"+res.getString(3)+"\n\n");

                }
                    inbox("DATA",buffer.toString());


            }
        });
    }
    public void inbox(String title,String message)
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.show();

    }

    public void updatedata()
    {
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id.setVisibility(View.VISIBLE);
                idname.setVisibility(View.VISIBLE);

                boolean isupdate = mydb.updateDta(id.getText().toString(), name.getText().toString(), surname.getText().toString(), marks.getText().toString());

                if (isupdate == true) {
                    Toast.makeText(MainActivity.this, "Data Updated", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Not deleted", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void deletedata()
    {
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id.setVisibility(View.VISIBLE);
                idname.setVisibility(View.VISIBLE);

                Integer isDelete=mydb.deleteData(id.getText().toString());

                if (isDelete > 0) {
                    Toast.makeText(MainActivity.this, "Data deleted", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Not deleted", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
