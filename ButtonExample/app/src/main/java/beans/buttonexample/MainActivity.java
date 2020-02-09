package beans.buttonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Bn_1,Bn_2;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bn_1 = (Button)findViewById(R.id.button);
        Bn_2 = (Button)findViewById(R.id.button2);
        Bn_1.setOnClickListener(this);
        Bn_2.setOnClickListener(this);
        textView = (TextView)findViewById(R.id.hellowTextView);
    }

    @Override
    public void onClick(View v) {
        if(v == Bn_1)
        {
            textView.setText("Click Button one!");
        }
        else if(v == Bn_2)
        {
            textView.setText("Click Button two!");
        }
    }
}
