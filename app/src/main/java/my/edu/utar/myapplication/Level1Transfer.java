package my.edu.utar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Level1Transfer extends AppCompatActivity {

    private Button button104,button105;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_transfer);

        button104 = findViewById(R.id.button104);
        button104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel2();
            }
        });

        button105 = findViewById(R.id.button105);
        button105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();

            }
        });
    }

    public void openLevel2(){
        Intent intent = new Intent(this,Level2.class);
        startActivity(intent);
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}