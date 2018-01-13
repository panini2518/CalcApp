package jp.techacademy.hirohide.ishihara.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value3 = intent.getStringExtra("rVALUE");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(String.valueOf(value3));

    }
}
