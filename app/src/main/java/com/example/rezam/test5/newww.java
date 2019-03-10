package com.example.rezam.test5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class newww extends Activity {
    public static final String EXTRA_MESSAGE="message";
TextView textView4,textView5,textView6;
String n1,n2,n3;
    double i1;
    double i2;
    double i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recived);
        TextView tv1=(TextView)findViewById(R.id.textView4);
        TextView tv2=(TextView)findViewById(R.id.textView5);
        TextView tv3=(TextView)findViewById(R.id.textView6);

        Bundle b=this.getIntent().getExtras();
        String str1=b.getString("convert");
        String str2=b.getString("nubmber");
        Float result = Float.valueOf(Integer.parseInt(str2));
        if (str1.equals("inch")){
    n1="CM";
    n2="KM";
    n3="Meter";
    i1= result*2.54;
    i2=i1/1000;
    i3=i1/100;
}
        if (str1.equals("cm")){
            n1="inch";
            n2="KM";
            n3="Meter";
            i1= result/2.54;
            i2=result/1000;
            i3=result/100;
        }
        if (str1.equals("km")){
            n1="inch";
            n2="CM";
            n3="Meter";
            i1= (result*1000)/2.54;
            i2=result*1000;
            i3=result*100;
        }
        if (str1.equals("meter")){
            n1="inch";
            n2="CM";
            n3="KM";
            i1= (result*100)/2.54;
            i2=result*100;
            i3=result/100;
        }
        tv1.setText(n1 +" "+i1);
        tv2.setText(n2 +" "+i2);
        tv3.setText(n3 +" "+i3);

    }
}

