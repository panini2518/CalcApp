package jp.techacademy.hirohide.ishihara.calcapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        intent.putExtra("VALUE1", (Parcelable) editText1);
        intent.putExtra("VALUE2", (Parcelable) editText2);
        startActivity(intent);
    }
}
