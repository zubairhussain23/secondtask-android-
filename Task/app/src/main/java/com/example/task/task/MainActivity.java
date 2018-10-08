package com.example.task.task;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText paasword;
    private EditText cpassword;
    private EditText phone;
    private Button register;
    private TextView hojao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUi();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String p1 = paasword.getText().toString();
                String p2 = cpassword.getText().toString();
//                if (paasword.getText().toString() == cpassword.getText().toString()) {
//                hojao.setText("bhai same password dona");
//                }
//                else {
//                    hojao.setText(cpassword.getText().toString()+paasword.getText().toString());
//
//                }
                hojao.setText(p1+" "+p2);
                if(p1 != p2)
                {
                    hojao.setText("Same");
                }

            }

        });

    }
    public void setupUi(){
        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        paasword = (EditText)findViewById(R.id.password);
        cpassword = (EditText)findViewById(R.id.cpassword);
        register = (Button)findViewById(R.id.btr);
        hojao = (TextView)findViewById(R.id.hojao);
    }
}
