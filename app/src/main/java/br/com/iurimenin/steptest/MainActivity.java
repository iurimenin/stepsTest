package br.com.iurimenin.steptest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonTextStep;
    private Button buttonProgressStep;
    private Button buttonDotsStep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTextStep = (Button) findViewById(R.id. buttonTextStep);
        buttonProgressStep = (Button) findViewById(R.id.buttonProgressStep);
        buttonDotsStep = (Button) findViewById(R.id.buttonDotsStep);

        buttonTextStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TextStep.class);
                startActivity(i);
            }
        });

        buttonProgressStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ProgressStep.class);
                startActivity(i);
            }
        });

        buttonDotsStep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, DotsSample.class);
                startActivity(i);
            }
        });
    }
}
