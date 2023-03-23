package my.edu.utar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button,button97;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel1();
            }
        });

        button97 = findViewById(R.id.button97);
        button97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScore();
            }
        });

    }
    public void openLevel1(){
        Intent intent = new Intent(this,Level1.class);
        startActivity(intent);
    }

    public void openScore(){
        Intent intent = new Intent(this,Score.class);
        startActivity(intent);
    }
}