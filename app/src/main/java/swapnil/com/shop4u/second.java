package swapnil.com.shop4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class second extends AppCompatActivity {
    ArrayList<String> selection = new ArrayList<String>();
    ArrayList<String> listcost = new ArrayList<String>();
    TextView showelements,displaycost;
    public final static String message_key="12345";
    public final static String costsending_key="45678";
    static String select;
    static int sum=0;
    String displaysum="";
    String addname;
    TextView showmethecost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void selectitem(View view){

        boolean checked=((CheckBox) view).isChecked();

        String prize="";

        switch (view.getId()){

            case R.id.lenovo:

                if(checked)
                {
                    prize="6999";
                    selection.add("Lenovo Vibe K5");
                    sum=sum+6999;

                    listcost.add(prize);
                }
                else{
                    prize="6999";
                    selection.remove("Lenovo Vibe K5");
                    sum=sum-6999;

                    listcost.remove(prize);

                }
                break;

            case R.id.samsung:
                if(checked)
                {
                    selection.add("samsung galaxy S7");
                    sum=sum+56000;
                    prize="56000";
                    listcost.add(prize);


                }
                else{
                    selection.remove("samsung galaxy S7");
                    sum=sum-56000;
                    prize="56000";
                    listcost.remove(prize);

                }
                break;

            case R.id.LG:
                if(checked)
                {
                    selection.add("LG efficient refrigerator");
                    sum=sum+15599;
                    prize="15599";
                    listcost.add(prize);

                }
                else{
                    selection.remove("LG efficient refrigerator");
                    sum=sum-15599;
                    prize="15599";
                    listcost.remove(prize);

                }
                break;
            case R.id.shoes:
                if(checked)
                {
                    selection.add("Freedom Daisy Men's Gray Casual Shoes ");
                    sum=sum+499;
                    prize="499";
                    listcost.add(prize);

                }
                else{
                    selection.remove("Freedom Daisy Men's Gray Casual Shoes ");
                    sum=sum-499;
                    prize="499";
                    listcost.remove(prize);

                }
                break;
            case R.id.dell:
                if(checked)
                {
                    selection.add("Dell Inspiron Mini");
                    sum=sum+30000;
                    prize="30000";
                    listcost.add(prize);

                }
                else{
                    selection.remove("Dell Inspiron Mini");
                    sum=sum-30000;
                    prize="30000";
                    listcost.remove(prize);

                }
                break;
            case R.id.shelf:
                if(checked)
                {
                    selection.add("Forzza Aldo Wall Shelf (Wenge)");
                    sum=sum+4499;
                    prize="4499";
                    listcost.add(prize);

                }
                else{
                    selection.remove("Forzza Aldo Wall Shelf (Wenge)");
                    sum=sum-4499;
                    prize="4499";
                    listcost.remove(prize);

                }
                break;
            case R.id.watch:
                if(checked)
                {
                    selection.add("Giordano Analog Multi-Colour Dial Men's Watch");
                    sum=sum+2000;
                    prize="2000";
                    listcost.add(prize);

                }
                else{
                    selection.remove("Giordano Analog Multi-Colour Dial Men's Watch");
                    sum=sum-2000;
                    prize="2000";
                    listcost.remove(prize);

                }
                break;
            case R.id.laptop:
                if(checked)
                {
                    selection.add("AmazonBasics Laptop Backpack");
                    sum=sum+1999;
                    prize="1999";
                    listcost.add(prize);

                }
                else{
                    selection.remove("AmazonBasics Laptop Backpack");
                    sum=sum-1999;
                    prize="1999";
                    listcost.remove(prize);

                }
                break;
            case R.id.sandisk:
                if(checked)
                {
                    selection.add("SanDisk Cruzer Blade-16GB");
                    sum=sum+329;
                    prize="329";
                    listcost.add(prize);

                }
                else{
                    selection.remove("SanDisk Cruzer Blade-16GB");
                    sum=sum-329;
                    prize="329";
                    listcost.remove(prize);

                }
                break;
            case R.id.speaker:
                if(checked)
                {
                    selection.add("Portronics Pure Sound POR-102 2.0 Portable Speaker");
                    sum=sum+2199;
                    prize="2199";
                    listcost.add(prize);

                }
                else{
                    selection.remove("Portronics Pure Sound POR-102 2.0 Portable Speaker");
                    sum=sum-2199;
                    prize="2199";
                    listcost.remove(prize);

                }
                break;


        }


    }
    public void finalselection(View view){

        select="";

        for(String addselected : selection){
            select=select + addselected + "\n";
        }
        String showthecost="";

        for(String newadd : listcost){
            showthecost=showthecost + newadd + "\n";
        }


        // showelements.setText(select);
        //showmethecost=(TextView)findViewById(R.id.showmethecost);
        // showmethecost.setText(showthecost);
        displaysum=Integer.toString(sum);
        //displaycost.setText(displaysum);
        Intent intent=new Intent(this,third.class);
        intent.putExtra("message_key",selection);
        intent.putExtra("costsending_key",listcost);

        startActivity(intent);



    }

}
