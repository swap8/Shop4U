package swapnil.com.shop4u;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(MainActivity.this,second.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();

    }
    public void nextscreen(View view){
        Intent intent = new Intent(this,second.class);
        startActivity(intent);

    }
}
