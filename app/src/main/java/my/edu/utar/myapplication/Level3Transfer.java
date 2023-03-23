package my.edu.utar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level3Transfer extends AppCompatActivity {

    private Button button108, button109;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_transfer);

        button108 = findViewById(R.id.button108);
        button108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel4();
            }
        });

        button109 = findViewById(R.id.button109);
        button109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });
    }

    public void openLevel4() {
        Intent intent = new Intent(this, Level4.class);
        startActivity(intent);
    }

    public void BackMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}