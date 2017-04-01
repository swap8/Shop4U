package swapnil.com.shop4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class fourth extends AppCompatActivity {

    EditText name,address,email,contact;
    public final static String details="54321";
    public final static String message_key="12345";
    public final static String costsending_key="45678";


    String getname,getaddress,getemail,getcontact;
    ArrayList<String> senddetails = new ArrayList<String>();
    ArrayList<String> senditems = new ArrayList<String>();
    ArrayList<String> listcost = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void generatebill(View view){


        name=(EditText)findViewById(R.id.editname);
        address=(EditText)findViewById(R.id.editaddress);
        email=(EditText)findViewById(R.id.editemail);
        contact=(EditText)findViewById(R.id.editcontact);

        getname=name.getText().toString();
        getaddress=address.getText().toString();
        getemail=email.getText().toString();
        getcontact=contact.getText().toString();


        senddetails.clear();

        senddetails.add(getname);
        senddetails.add(getaddress);
        senddetails.add(getcontact);
        senddetails.add(getemail);

        Intent take=getIntent();
        senditems=take.getStringArrayListExtra("message_key");
        listcost=take.getStringArrayListExtra("costsending_key");

        Intent intent=new Intent(this,fifth.class);
        intent.putExtra("details",senddetails);
        intent.putExtra("message_key",senditems);
        intent.putExtra("costsending_key",listcost);

        startActivity(intent);



    }
}
