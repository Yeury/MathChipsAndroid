package com.example.kfont.mathchipsandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Link Numbers button2 to NumbersSubMenu
        final Button button2 = (Button)findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent continueIntent = new Intent(MainMenu.this, NumbersSubMenu.class);
                MainMenu.this.startActivity(continueIntent);
            }
        //End of link with Negative Numbers button2
        });

        //Link Operations button3 to  OperationsSubMenu
        final Button button3 = (Button)findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent continueIntent = new Intent(MainMenu.this, OperationsSubMenu.class);
                MainMenu.this.startActivity(continueIntent);
            }
            //End of link with Negative Numbers button2
        });

        //Link Ratios button4 to  RatiosSubMenu
        final Button button4 = (Button)findViewById(R.id.button4);

        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent continueIntent = new Intent(MainMenu.this, RatiosSubMenu.class);
                MainMenu.this.startActivity(continueIntent);
            }
            //End of link with Negative Numbers button2
        });

        //Link Percents button5 to  PercentsSubMenu
        final Button button5 = (Button)findViewById(R.id.button5);

        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent continueIntent = new Intent(MainMenu.this, PercentsSubMenu.class);
                MainMenu.this.startActivity(continueIntent);
            }
            //End of link with Negative Numbers button2
        });

        //Link Matrices button10 to  MatricesSubMenu
        final Button button10 = (Button)findViewById(R.id.button10);

        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent continueIntent = new Intent(MainMenu.this, MatricesSubMenu.class);
                MainMenu.this.startActivity(continueIntent);
            }
            //End of link with Negative Numbers button2
        });
    }
}
