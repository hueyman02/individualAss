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

public class Level4 extends AppCompatActivity {

    private Button button34, button35, button36, button37, button38, button39, button40,
            button41, button42, button43, button44, button45, button46, button47, button48, button49,button50,
            button51,button52,button53,button54,button55,button56,button57,button58,button59,button101;
    private int highlightedButton, successfulTouches;
    private Handler handler;
    private TextView scoreText,textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);

        TextView scoreTextView = findViewById(R.id.scoreTextView);

        button59 = findViewById(R.id.button59);
        button59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLevel5();
            }
        });

        button101 = findViewById(R.id.button101);
        button101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });

        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button40 = findViewById(R.id.button40);
        button41 = findViewById(R.id.button41);
        button42 = findViewById(R.id.button42);
        button43 = findViewById(R.id.button43);
        button44 = findViewById(R.id.button44);
        button45 = findViewById(R.id.button45);
        button46 = findViewById(R.id.button46);
        button47 = findViewById(R.id.button47);
        button48 = findViewById(R.id.button48);
        button49 = findViewById(R.id.button49);
        button50 = findViewById(R.id.button50);
        button51 = findViewById(R.id.button51);
        button52 = findViewById(R.id.button52);
        button53 = findViewById(R.id.button53);
        button54 = findViewById(R.id.button54);
        button55 = findViewById(R.id.button55);
        button56 = findViewById(R.id.button56);
        button57 = findViewById(R.id.button57);
        button58 = findViewById(R.id.button58);

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
                textView1 = findViewById(R.id.textView17); // replace R.id.text_view with the ID of your TextView
                textView1.setText("Seconds left: " + secondsLeft);
            }
            public void onFinish() {
                // do something when the countdown finishes
                textView2 = findViewById(R.id.textView17); // replace R.id.text_view with the ID of your TextView
                textView2.setText("Countdown finished!");
            }
        }.start();

        // Set up click listeners for each button
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 1) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 2) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 3) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 4) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 5) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 6) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 7) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 8) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 9) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 10) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 11) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 12) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 13) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 14) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 15) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 16) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 17) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 18) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 19) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 20) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 21) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 22) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 23) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 24) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 25) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level4.this, "Wrong button!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    public void openLevel5(){
        Intent intent = new Intent(this,Level4Transfer.class);
        startActivity(intent);
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private int generateRandomButton() {
        // Returns a random number between 1 and 25
        return new Random().nextInt(25) + 1;
    }

    private void highlightButton(int buttonNumber) {
        // Highlights the button with the given number
        switch (buttonNumber) {
            case 1:
                button34.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                button35.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                button36.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                button37.setBackgroundColor(Color.YELLOW);
                break;
            case 5:
                button38.setBackgroundColor(Color.YELLOW);
                break;
            case 6:
                button39.setBackgroundColor(Color.YELLOW);
                break;
            case 7:
                button40.setBackgroundColor(Color.YELLOW);
                break;
            case 8:
                button41.setBackgroundColor(Color.YELLOW);
                break;
            case 9:
                button42.setBackgroundColor(Color.YELLOW);
                break;
            case 10:
                button43.setBackgroundColor(Color.YELLOW);
                break;
            case 11:
                button44.setBackgroundColor(Color.YELLOW);
                break;
            case 12:
                button45.setBackgroundColor(Color.YELLOW);
                break;
            case 13:
                button46.setBackgroundColor(Color.YELLOW);
                break;
            case 14:
                button47.setBackgroundColor(Color.YELLOW);
                break;
            case 15:
                button48.setBackgroundColor(Color.YELLOW);
                break;
            case 16:
                button49.setBackgroundColor(Color.YELLOW);
                break;
            case 17:
                button50.setBackgroundColor(Color.YELLOW);
                break;
            case 18:
                button51.setBackgroundColor(Color.YELLOW);
                break;
            case 19:
                button52.setBackgroundColor(Color.YELLOW);
                break;
            case 20:
                button53.setBackgroundColor(Color.YELLOW);
                break;
            case 21:
                button54.setBackgroundColor(Color.YELLOW);
                break;
            case 22:
                button55.setBackgroundColor(Color.YELLOW);
                break;
            case 23:
                button56.setBackgroundColor(Color.YELLOW);
                break;
            case 24:
                button57.setBackgroundColor(Color.YELLOW);
                break;
            case 25:
                button58.setBackgroundColor(Color.YELLOW);
                break;
        }
    }

}