package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {      //activity is the mother
    TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //to show ui, "R" = is the resources that register the recource on the screen
        //textview is the display box only
        textViewMessage = (TextView)findViewById(R.id.textViewMesasge);//link the ui with the code/program
    }

    public void showMessage(View view){
        textViewMessage.setText(getText(R.string.app_name) +"" + getText(R.string.my_name));
    }




}
