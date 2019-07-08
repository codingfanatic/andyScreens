//Include the name of your package
package com.example.andyscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);

    }

    public void Ganesh(View View) {
        String button_text;
        button_text =((Button)View).getText().toString();
        if(button_text.equals("Second Activity")) {
            //Instantiate an Intent called secondAct using the SecondActivity class
            Intent secondAct = new Intent(this,SecondActivity.class);
            startActivity(secondAct);
        }

        else if (button_text.equals("Third Activity")) {
            //Instantiate an Intent called thirdAct using the ThirdActivity class
            Intent thirdAct = new Intent(this,ThirdActivity.class);
            startActivity(thirdAct);
        }
    }
}