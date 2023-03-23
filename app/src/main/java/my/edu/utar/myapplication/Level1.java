package my.edu.utar.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Level1 extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3, button6;
    private Button button4, button98;
    private int highlightedButton, successfulTouches,secondsLeft;
    private Handler handler;
    TextView textView1,textView2;
    //private TextView scoreText;
    //TextView scoreTextView = findViewById(R.id.scoreTextView);

    public Level1() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openLevel1Transfer();
            }
        });

        button98 = findViewById(R.id.button98);
        button98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BackMain();
            }
        });

        TextView scoreTextView = findViewById(R.id.scoreTextView);
        //timerTextView = findViewById(R.id.timer_text_view);
        //scoreTextView = findViewById(R.id.score_text_view);
        button1 = findViewById(R.id.button2);
        button2 = findViewById(R.id.button3);
        button3 = findViewById(R.id.button4);
        button4 = findViewById(R.id.button5);
        //scoreText = findViewById(R.id.score.text);




        // Generate a random number between 1 and 4 to start the game
        highlightedButton = generateRandomButton();
        highlightButton(highlightedButton);

        // Set up a handler to update the highlighted button every 2 seconds
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Unhighlight the current button and highlight a new random button
                unhighlightButton(highlightedButton);
                highlightedButton = generateRandomButton();
                highlightButton(highlightedButton);

                // Schedule the next update in 2 seconds
                handler.postDelayed(this, 2000);
            }

            private void unhighlightButton(int highlightedButton) {
            }
        }, 2000);

        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                long secondsLeft = millisUntilFinished / 1000;
                // display the remaining seconds in your app's user interface
                textView1 = findViewById(R.id.textView14); // replace R.id.text_view with the ID of your TextView
                textView1.setText("Seconds left: " + secondsLeft);
            }
            public void onFinish() {
                // do something when the countdown finishes
                textView2 = findViewById(R.id.textView14); // replace R.id.text_view with the ID of your TextView
                textView2.setText("Countdown finished!");
            }
        }.start();

        // Set up click listeners for each button
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 1) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);

                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);



                } else {
                    Toast.makeText(Level1.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 2) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);

                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);


                } else {
                    Toast.makeText(Level1.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 3) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);

                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);


                } else {
                    Toast.makeText(Level1.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 4) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);

                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);


                } else {
                    Toast.makeText(Level1.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Repeat for button2, button3, and button4
    }



    public void openLevel1Transfer(){
        Intent intent = new Intent(this,Level1Transfer.class);
        startActivity(intent);
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private int generateRandomButton() {
        // Returns a random number between 1 and 4
        return new Random().nextInt(4) + 1;
    }

    private void highlightButton(int buttonNumber) {
        // Highlights the button with the given number
        switch (buttonNumber) {
            case 1:
                button1.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                button2.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                button3.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                button4.setBackgroundColor(Color.YELLOW);
                break;
        }
    }
}

