package com.example.toastdisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

public class MainActivity<context> extends AppCompatActivity {

    private Toast toast;
    private int i ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toast = Toast.makeText(MainActivity.this,"Hi Shubham!", Toast.LENGTH_SHORT);

       Thread t =new Thread(new Runnable() {
           @Override
           public void run() {
               for (; ; ) {

                   try {
                      // Thread.sleep(10000);
                       toast.show();
                       Thread.sleep(10000);

                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }
       });


t.start();
    }
}

