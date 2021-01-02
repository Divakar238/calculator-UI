package com.test.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btndot,btnsin,btncos,btntan,btnlog,btnln,btnac,btnclear,btnb1,btnb2,btnmultiply
            ,btndivide,btnminus,btnadd,btnequal,btnfact,btndiv,btnsquare,btnroot,btnn;
    TextView tvsec,tvmain;
    String pie="3.14159265";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btndot=findViewById(R.id.btndot);
        btnsin=findViewById(R.id.btnsin);
        btncos=findViewById(R.id.btncos);
        btntan=findViewById(R.id.btntan);
        btnlog=findViewById(R.id.btnlog);
        btnln=findViewById(R.id.btnIn);
        btnfact=findViewById(R.id.btnfactorial);
        btnsquare=findViewById(R.id.btnsqaure);
        btnroot=findViewById(R.id.btnroot);
        btndiv=findViewById(R.id.div);
        btndivide=findViewById(R.id.divide);
        btnmultiply=findViewById(R.id.btnmultiply);
        btnminus=findViewById(R.id.btnminus);
        btnadd=findViewById(R.id.btnplus);
        btnequal=findViewById(R.id.btnequal);
        btnn=findViewById(R.id.btnn);
        btnac=findViewById(R.id.btnac);
        btnclear=findViewById(R.id.btnclear);
        btnb1=findViewById(R.id.btnb1);
        btnb2=findViewById(R.id.btnb2);
        tvmain=findViewById(R.id.tvmain);
        tvsec=findViewById(R.id.tvsec);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"4");
            }
        }); btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText("");
                tvsec.setText("");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String var=tvmain.getText().toString();
                var=var.substring(0,var.length()-1);
                tvmain.setText(var);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        btnmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"x");
            }
        });
        btndivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              tvsec.setText(btnn.getText());
              tvmain.setText(tvmain.getText()+pie);
            }
        });
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(btnn.getText());
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(btnn.getText());
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(btnn.getText());
                tvmain.setText(tvmain.getText()+"tan");
            }
        });

        btnfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int var=Integer.parseInt(tvmain.getText().toString());
               int fact=factorial(var);
               tvmain.setText(String.valueOf(fact));
               tvsec.setText(var+"!");f
            }
        });
        btnsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(tvmain.getText().toString());
                double square=d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
       btnroot.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String var=tvmain.getText().toString();
               double r=Math.sqrt(Double.parseDouble(var));
               tvmain.setText(String.valueOf(r));
           }
       });






    }


    //        factorial function
    int factorial(int n){
        return(n==1||n==0)?1:n*factorial(n-1);
    }

}