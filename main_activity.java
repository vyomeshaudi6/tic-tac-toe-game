package com.example.vyomesh.tictaktoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*
        Button btn1 = (Button)findViewById(R.id.btn1);


        View.OnClickListener click = new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Button btnn= (Button) v;

                 btnn.setText("");


                Toast.makeText(getApplicationContext(),,Toast.LENGTH_LONG).show();
            }
        };
        btn1.setOnClickListener(click);
       // btn2.setOnClickListener(click);
       // btn3.setOnClickListener(click);
      //  btn4.setOnClickListener(click);
       // btn5.setOnClickListener(click);
        //btn6.setOnClickListener(click);
        //btn7.setOnClickListener(click);
        //btn8.setOnClickListener(click);
        //btn9.setOnClickListener(click);


*/


        p=new Intent(MainActivity.this,Winner.class);
        //finish();

    }

    int j=0;
    int arr[] = new int[10];
    int flag =0;
    //View vv[] =new View[10];
    //Integer ids[]=new Integer[10];
    Intent p;
    public void click(View v) {

        String s = v.getTag().toString();
        Integer n = Integer.parseInt(s);

      //  vv[n-1]= v;

        if (n < 10)
        {
            ImageButton btn = (ImageButton) v;
            if (j % 2 == 0) {
                btn.setImageResource(R.mipmap.jerry);
                arr[n] = 1;
                 btn.setEnabled(false);
            } else {
                btn.setImageResource(R.mipmap.tom);
                arr[n] = 2;
                btn.setEnabled(false);
            }
            j++;

        }
        else
        {
            if (n>=10)
            {
                j = 0;
                arr[0]=0;
                arr[1]=0;
                arr[2]=0;
                arr[3]=0;
                arr[4]=0;
                arr[5]=0;
                arr[6]=0;
                arr[7]=0;
                arr[8]=0;
                arr[9]=0;
                flag=0;
               clear();
              //  vv= new View[10];
            }
        }

        if (j>=5 && flag==0)
        {
            for (int i = 1; i <= 7; i = i + 3)
            {
                if (arr[i]==arr[i+1] && arr[i]==arr[i+2] && arr[i]!=0)
                {
                    flag=1;
                    if (arr[i] == 1)
                    {
                        p= p.putExtra("who","tom");
                        startActivity(p);
                        //Toast.makeText(getApplicationContext(), "TOM WINS", Toast.LENGTH_LONG).show();
                        break;
                    }
                    if(arr[i]==2)
                    {
                       p= p.putExtra("who","jerry");
                        startActivity(p);
                        //Toast.makeText(getApplicationContext(), "JERRY WINS", Toast.LENGTH_LONG).show();
                        break;
                    }

                }

            }

            if (flag != 1)
            {
                 for (int i = 1; i <= 3; i = i + 1)
                 {
                    if (arr[i] == arr[i + 3] && arr[i] == arr[i + 6] && arr[i] != 0)
                    {
                        flag=1;
                        if (arr[i] == 1)
                        {
                         p = p.putExtra("who","tom");

                            startActivity(p);
                            //Toast.makeText(getApplicationContext(), "TOM WINS", Toast.LENGTH_LONG).show();
                             break;
                        }
                        if(arr[i]==2)
                        {
                           p= p.putExtra("who","jerry");
                            startActivity(p);
                            //Toast.makeText(getApplicationContext(), "JERRY WINS", Toast.LENGTH_LONG).show();
                             break;
                        }

                    }

                }

            }

             if(flag!=1)
             {

                 if (arr[1] == arr[5] && arr[1] == arr[9] && arr[1] != 0)
                 {
                     flag=1;
                     if (arr[1] == 1) {
                         p=p.putExtra("who","tom");
                         startActivity(p);
                         //    Toast.makeText(getApplicationContext(), "TOM WINS", Toast.LENGTH_LONG).show();

                     }
                     if(arr[1]==2)
                     {

                         p=p.putExtra("who","jerry");
                         startActivity(p);
                         //Toast.makeText(getApplicationContext(), "JERRY WINS", Toast.LENGTH_LONG).show();
                     }

                 }

                 if (arr[3] == arr[5] && arr[3] == arr[7] && arr[3] != 0)
                 {

                     if (arr[3] == 1)
                     {
                         p=p.putExtra("who","tom");
                         startActivity(p);
                         //Toast.makeText(getApplicationContext(), "TOM WINS", Toast.LENGTH_LONG).show();

                     }
                     if(arr[3]==2)
                     {

                         p=p.putExtra("who","jerry");
                         startActivity(p);
                         //Toast.makeText(getApplicationContext(), "JERRY WINS", Toast.LENGTH_LONG).show();

                     }
                 }
             }




            //Toast.makeText(getApplicationContext(), , Toast.LENGTH_LONG).show();


        }
    }
    public void clear() {

        /* for(int i=0;i<9;i++)
         {
             //View v=findViewById(R.id.btn1);
             if(vv[i]!=null){
                 //v =findViewById(ids[i]);
             }

        */
       // setContentView(R.layout.activity_main);
        // setContentView(R.layout.activity_main);


        ImageButton btn = (ImageButton)findViewById(R.id.btn1);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn2);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn3);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn4);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn5);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn6);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn7);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn8);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);

        btn = (ImageButton)findViewById(R.id.btn9);
        btn.setImageResource(R.mipmap.tapme);
        btn.setEnabled(true);


    }
}
