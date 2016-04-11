package developer_lab.com.custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by RAKIB on 4/11/2016.
 */
public class listVIew_Adapter extends BaseAdapter {

    private Context mcontext;
    private ArrayList<HashMap<String, String>> books;
    private LayoutInflater inflater =null;

    public listVIew_Adapter(Context context, ArrayList<HashMap<String,String>> data)
    {
        mcontext=context;
        books=data;
        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return books.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view =convertView;
        if(convertView==null)
        {
            view=inflater.inflate(R.layout.list_row,null);
            TextView book=(TextView) view.findViewById(R.id.bookID);
            TextView author=(TextView) view.findViewById(R.id.authorID);
            TextView page=(TextView) view.findViewById(R.id.pageID);
            ImageView bookpic=(ImageView)view.findViewById(R.id.bookpic);

            HashMap<String, String> mbook =new HashMap<>();

            mbook=books.get(position);

            book.setText(mbook.get("book"));
            author.setText(mbook.get("author"));
            page.setText(mbook.get("page"));
            bookpic.setImageDrawable(mcontext.getResources().getDrawable(R.drawable.logo));


        }
        return view;
    }
}
