package swapnil.com.shop4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class fifth extends AppCompatActivity {

    String name,address,contact,email;
    public final static String details="54321";
    public static final String passitem="6789";
    public final static String message_key="12345";
    public final static String costsending_key="45678";


    ArrayList<String> getdetails = new ArrayList<String>();
    ArrayList<String> getitems = new ArrayList<String>();
    ArrayList<String> listcost = new ArrayList<String>();

    ListView showdetails,costprize;
    TextView givename,giveaddress,giveemail,givecontact,showthebillcost;
    String show;
    int select=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Intent intent = getIntent();
        getdetails=intent.getStringArrayListExtra("details");
        getitems=intent.getStringArrayListExtra("message_key");
        listcost=intent.getStringArrayListExtra("costsending_key");


        showdetails=(ListView)findViewById(R.id.showdetails);
        costprize=(ListView)findViewById(R.id.totalcostprize);

        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,getitems);
        showdetails.setAdapter(adapter);

        ArrayAdapter adapter1= new ArrayAdapter(this,android.R.layout.simple_list_item_1,listcost);
        costprize.setAdapter(adapter1);

        name=getdetails.get(0);
        address=getdetails.get(1);
        contact=getdetails.get(2);
        email=getdetails.get(3);

        givename=(TextView)findViewById(R.id.givename);
        givename.setText(name);
        giveaddress=(TextView)findViewById(R.id.giveaddress);
        giveaddress.setText(address);
        givecontact=(TextView)findViewById(R.id.givecontact);
        givecontact.setText(contact);
        giveemail=(TextView)findViewById(R.id.giveemail);
        giveemail.setText(email);


        int temp=0;
        for(String addselected : listcost){
            temp=Integer.parseInt(addselected);
            select=select + temp;
        }
        String showselect=Integer.toString(select);
        showthebillcost=(TextView) findViewById(R.id.paybill);
        showthebillcost.setText(showselect);




    }
}
