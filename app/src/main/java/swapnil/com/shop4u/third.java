package swapnil.com.shop4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class third extends AppCompatActivity {

    Button proceed;
    public final static String message_key="12345";
    public final static String costsending_key="45678";
    TextView result;
    ArrayList<String> selection = new ArrayList<String>();
    ArrayList<String> listcost = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent intent= getIntent();
        selection=intent.getStringArrayListExtra("message_key");
        listcost=intent.getStringArrayListExtra("costsending_key");
        ListView listView=(ListView)findViewById(R.id.listView);

        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,selection);
        listView.setAdapter(adapter);


        proceed=(Button)findViewById(R.id.proceed);
    }


    public void proceedselection(View view){

        Intent checkout = new Intent(this,fourth.class);
        checkout.putExtra("message_key",selection);
        checkout.putExtra("costsending_key",listcost);
        startActivity(checkout);

    }
}
