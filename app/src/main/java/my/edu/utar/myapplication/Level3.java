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

public class Level3 extends AppCompatActivity {

    private Button button17, button18, button19, button20, button21, button22, button23, button24, button25, button26, button27, button28, button29, button30, button31, button32,button33,button100;
    private int highlightedButton, successfulTouches;
    private Handler handler;
    private TextView scoreText,textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);

        TextView scoreTextView = findViewById(R.id.scoreTextView);

        button33 = findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel4();
            }
        });

        button100 = findViewById(R.id.button100);
        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });

        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);

        // Generate a random number between 1 and 4 to start the game
        highlightedButton = generateRandomButton();
        highlightButton(highlightedButton);

        // Set up a handler to update the highlighted button every 5 seconds
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Unhighlight the current button and highlight a new random button
                unhighlightButton(highlightedButton);
                highlightedButton = generateRandomButton();
                highlightButton(highlightedButton);

                // Schedule the next update in 5 seconds
                handler.postDelayed(this, 2000);
            }

            private void unhighlightButton(int highlightedButton) {
            }
        }, 2000);

        new CountDownTimer(5000, 1000) {
            public void onTick(long millisUntilFinished) {
                long secondsLeft = millisUntilFinished / 1000;
                // display the remaining seconds in your app's user interface
                textView1 = findViewById(R.id.textView82); // replace R.id.text_view with the ID of your TextView
                textView1.setText("Seconds left: " + secondsLeft);
            }
            public void onFinish() {
                // do something when the countdown finishes
                textView2 = findViewById(R.id.textView82); // replace R.id.text_view with the ID of your TextView
                textView2.setText("Countdown finished!");
            }
        }.start();

        // Set up click listeners for each button
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 1) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 2) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 3) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 4) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 5) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 6) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 7) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 8) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 9) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 10) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 11) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 12) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 13) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 14) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 15) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 16) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level3.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openLevel4(){
        Intent intent = new Intent(this,Level3Transfer.class);
        startActivity(intent);
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private int generateRandomButton() {
        // Returns a random number between 1 and 9
        return new Random().nextInt(16) + 1;
    }

    private void highlightButton(int buttonNumber) {
        // Highlights the button with the given number
        switch (buttonNumber) {
            case 1:
                button17.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                button18.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                button19.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                button20.setBackgroundColor(Color.YELLOW);
                break;
            case 5:
                button21.setBackgroundColor(Color.YELLOW);
                break;
            case 6:
                button22.setBackgroundColor(Color.YELLOW);
                break;
            case 7:
                button23.setBackgroundColor(Color.YELLOW);
                break;
            case 8:
                button24.setBackgroundColor(Color.YELLOW);
                break;
            case 9:
                button25.setBackgroundColor(Color.YELLOW);
                break;
            case 10:
                button26.setBackgroundColor(Color.YELLOW);
                break;
            case 11:
                button27.setBackgroundColor(Color.YELLOW);
                break;
            case 12:
                button28.setBackgroundColor(Color.YELLOW);
                break;
            case 13:
                button29.setBackgroundColor(Color.YELLOW);
                break;
            case 14:
                button30.setBackgroundColor(Color.YELLOW);
                break;
            case 15:
                button31.setBackgroundColor(Color.YELLOW);
                break;
            case 16:
                button32.setBackgroundColor(Color.YELLOW);
                break;
        }
    }

}
