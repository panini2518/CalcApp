package jp.techacademy.hirohide.ishihara.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;
    String editText1c;
    String editText2c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener((View.OnClickListener) this);

        Button minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener((View.OnClickListener) this);

        Button multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener((View.OnClickListener) this);

        Button divide = (Button) findViewById(R.id.divide);
        divide.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View v){
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText1c = editText1.getText().toString();
        editText2c = editText2.getText().toString();
        double Evalue1 = Double.parseDouble(editText1c);
        double Evalue2 = Double.parseDouble(editText2c);

        if(v.getId() == R.id.plus){
            Intent intent = new Intent(this, Main2Activity.class);
            String Rvalue = String.valueOf(Evalue1 + Evalue2);
            intent.putExtra("rVALUE", Rvalue);
            startActivity(intent);
        }else if(v.getId() == R.id.minus){
            Intent intent = new Intent(this, Main2Activity.class);
            String Rvalue = String.valueOf(Evalue1 - Evalue2);
            intent.putExtra("rVALUE", Rvalue);
            startActivity(intent);
        }else if(v.getId() == R.id.multiply) {
            Intent intent = new Intent(this, Main2Activity.class);
            String Rvalue = String.valueOf(Evalue1 * Evalue2);
            intent.putExtra("rVALUE", Rvalue);
            startActivity(intent);
        }else if(v.getId() == R.id.divide) {
            Intent intent = new Intent(this, Main2Activity.class);
            String Rvalue = String.valueOf(Evalue1 / Evalue2);
            intent.putExtra("rVALUE", Rvalue);
            startActivity(intent);
        }
    }
}
