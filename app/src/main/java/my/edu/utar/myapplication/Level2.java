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

import java.util.Random;
import java.util.Timer;


public class Level2 extends AppCompatActivity {


    private Button button7, button8, button9, button10,button11,button12,button13,button14,button15,button16,button99;
    private int highlightedButton, successfulTouches,secondsLeft;
    private Handler handler;
    private TextView scoreText,textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        TextView scoreTextView = findViewById(R.id.scoreTextView);
        button16 = findViewById(R.id.button16);
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel3();
            }
        });

        button99 = findViewById(R.id.button99);
        button99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });

        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button14);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);

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
                textView1 = findViewById(R.id.textView15); // replace R.id.text_view with the ID of your TextView
                textView1.setText("Seconds left: " + secondsLeft);
            }
            public void onFinish() {
                // do something when the countdown finishes
                textView2 = findViewById(R.id.textView15); // replace R.id.text_view with the ID of your TextView
                textView2.setText("Countdown finished!");
            }
        }.start();

        // Set up click listeners for each button
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 1) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 2) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 3) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 4) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 5) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 6) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 7) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 8) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 9) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level2.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openLevel3(){
        Intent intent = new Intent(this,Level2Transfer.class);
        startActivity(intent);
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private int generateRandomButton() {
        // Returns a random number between 1 and 9
        return new Random().nextInt(9) + 1;
    }

    private void highlightButton(int buttonNumber) {
        // Highlights the button with the given number
        switch (buttonNumber) {
            case 1:
                button7.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                button8.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                button9.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                button10.setBackgroundColor(Color.YELLOW);
                break;
            case 5:
                button11.setBackgroundColor(Color.YELLOW);
                break;
            case 6:
                button12.setBackgroundColor(Color.YELLOW);
                break;
            case 7:
                button13.setBackgroundColor(Color.YELLOW);
                break;
            case 8:
                button14.setBackgroundColor(Color.YELLOW);
                break;
            case 9:
                button15.setBackgroundColor(Color.YELLOW);
                break;
        }
    }
}
