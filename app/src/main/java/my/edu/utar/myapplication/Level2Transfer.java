package my.edu.utar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level2Transfer extends AppCompatActivity {

    private Button button106, button107;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_transfer);


        button106 = findViewById(R.id.button106);
        button106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel3();
            }
        });

        button107 = findViewById(R.id.button107);
        button107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });
    }

    public void openLevel3() {
        Intent intent = new Intent(this, Level3.class);
        startActivity(intent);
    }

    public void BackMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}