package com.android.learnjapanese;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About extends AppCompatActivity {
    TextView info;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        info = (TextView) findViewById(R.id.info);
        back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


        Typeface custom_font = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/GoogleSans-Regular.ttf");
        Typeface custom_font_bold = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/GoogleSans-Bold.ttf");
        info.setTypeface(custom_font);
        //back.setTypeface(custom_font);

    }
}
