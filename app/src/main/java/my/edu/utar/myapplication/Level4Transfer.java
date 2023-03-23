package my.edu.utar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level4Transfer extends AppCompatActivity {

    private Button button110,button111;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4_transfer);

        button110 = findViewById(R.id.button110);
        button110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel5();
            }
        });

        button111 = findViewById(R.id.button111);
        button111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });
    }

    public void openLevel5() {
        Intent intent = new Intent(this, Level5.class);
        startActivity(intent);
    }

    public void BackMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}