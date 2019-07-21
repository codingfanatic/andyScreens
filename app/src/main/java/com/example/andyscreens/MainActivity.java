//Include the name of your package
package com.example.andyscreens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Act I");
/*        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
*/
    }

        public void Dunlaps(View View){
            String button_text;

            //Casts the View object as a Button
            // Uses the getText() getter method to obtain text in the button
            // Uses the toString() method to return text as a String
            // If the text reads Second Activity, create an Intent for starting the secondAct Activity
            // Else, if it reads Third Activity, repeat for the thirdAct Activity
            button_text = ((Button) View).getText().toString();

            if (button_text.equals("Second Activity")) {
                //Instantiate an Intent called secondAct using the SecondActivity class
                Intent secondAct = new Intent(this, SecondActivity.class);
                startActivity(secondAct);
            }

            else if (button_text.equals("Third Activity")) {
                //Instantiate an Intent called thirdAct using the ThirdActivity class
                Intent thirdAct = new Intent(this, ThirdActivity.class);
                startActivity(thirdAct);
            }


        }
}

