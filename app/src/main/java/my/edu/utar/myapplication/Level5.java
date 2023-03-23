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

public class Level5 extends AppCompatActivity {


    private Button button60, button61, button62, button63, button64, button65, button66,
            button67, button68, button69, button70, button71, button72, button73, button74, button75,button76,
            button77,button78,button79,button80,button81,button82,button83,button84,button85,button86,button87,
            button88,button89,button90,button91,button92,button93,button94,button95,button96,button102;
    private int highlightedButton, successfulTouches;
    private Handler handler;
    private TextView scoreText,textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);

        TextView scoreTextView = findViewById(R.id.scoreTextView);

        button96 = findViewById(R.id.button96);
        button96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openScore();
            }
        });

        button102 = findViewById(R.id.button102);
        button102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });

        button60 = findViewById(R.id.button60);
        button61 = findViewById(R.id.button61);
        button62 = findViewById(R.id.button62);
        button63 = findViewById(R.id.button63);
        button64 = findViewById(R.id.button64);
        button65 = findViewById(R.id.button65);
        button66 = findViewById(R.id.button66);
        button67 = findViewById(R.id.button67);
        button68 = findViewById(R.id.button68);
        button69 = findViewById(R.id.button69);
        button70 = findViewById(R.id.button70);
        button71 = findViewById(R.id.button71);
        button72 = findViewById(R.id.button72);
        button73 = findViewById(R.id.button73);
        button74 = findViewById(R.id.button74);
        button75 = findViewById(R.id.button75);
        button76 = findViewById(R.id.button76);
        button77 = findViewById(R.id.button77);
        button78 = findViewById(R.id.button78);
        button79 = findViewById(R.id.button79);
        button80 = findViewById(R.id.button80);
        button81 = findViewById(R.id.button81);
        button82 = findViewById(R.id.button82);
        button83 = findViewById(R.id.button83);
        button84 = findViewById(R.id.button84);
        button85 = findViewById(R.id.button85);
        button86 = findViewById(R.id.button86);
        button87 = findViewById(R.id.button87);
        button88 = findViewById(R.id.button88);
        button89 = findViewById(R.id.button89);
        button90 = findViewById(R.id.button90);
        button91 = findViewById(R.id.button91);
        button92 = findViewById(R.id.button92);
        button93 = findViewById(R.id.button93);
        button94 = findViewById(R.id.button94);
        button95 = findViewById(R.id.button95);

        // Generate a random number between 1 and 36 to start the game
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
                textView1 = findViewById(R.id.textView21); // replace R.id.text_view with the ID of your TextView
                textView1.setText("Seconds left: " + secondsLeft);
            }
            public void onFinish() {
                // do something when the countdown finishes
                textView2 = findViewById(R.id.textView21); // replace R.id.text_view with the ID of your TextView
                textView2.setText("Countdown finished!");
            }
        }.start();

        // Set up click listeners for each button
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 1) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 2) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 3) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 4) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 5) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 6) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 7) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 8) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 9) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 10) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 11) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 12) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 13) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 14) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 15) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 16) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 17) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 18) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 19) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 20) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 21) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 22) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 23) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 24) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 25) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 26) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 27) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 28) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 29) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 30) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 31) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 32) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 33) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 34) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 35) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (highlightedButton == 36) {
                    successfulTouches++;
                    scoreTextView.setText("Score: " + successfulTouches);
                    highlightedButton = generateRandomButton();
                    highlightButton(highlightedButton);
                } else {
                    Toast.makeText(Level5.this, "Wrong Color!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void openScore(){
        Intent intent = new Intent(this,Level5Transfer.class);
        startActivity(intent);
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    private int generateRandomButton() {
        // Returns a random number between 1 and 36
        return new Random().nextInt(36) + 1;
    }

    private void highlightButton(int buttonNumber) {
        // Highlights the button with the given number
        switch (buttonNumber) {
            case 1:
                button60.setBackgroundColor(Color.YELLOW);
                break;
            case 2:
                button61.setBackgroundColor(Color.YELLOW);
                break;
            case 3:
                button62.setBackgroundColor(Color.YELLOW);
                break;
            case 4:
                button63.setBackgroundColor(Color.YELLOW);
                break;
            case 5:
                button64.setBackgroundColor(Color.YELLOW);
                break;
            case 6:
                button65.setBackgroundColor(Color.YELLOW);
                break;
            case 7:
                button66.setBackgroundColor(Color.YELLOW);
                break;
            case 8:
                button67.setBackgroundColor(Color.YELLOW);
                break;
            case 9:
                button68.setBackgroundColor(Color.YELLOW);
                break;
            case 10:
                button69.setBackgroundColor(Color.YELLOW);
                break;
            case 11:
                button70.setBackgroundColor(Color.YELLOW);
                break;
            case 12:
                button71.setBackgroundColor(Color.YELLOW);
                break;
            case 13:
                button72.setBackgroundColor(Color.YELLOW);
                break;
            case 14:
                button73.setBackgroundColor(Color.YELLOW);
                break;
            case 15:
                button74.setBackgroundColor(Color.YELLOW);
                break;
            case 16:
                button75.setBackgroundColor(Color.YELLOW);
                break;
            case 17:
                button76.setBackgroundColor(Color.YELLOW);
                break;
            case 18:
                button77.setBackgroundColor(Color.YELLOW);
                break;
            case 19:
                button78.setBackgroundColor(Color.YELLOW);
                break;
            case 20:
                button79.setBackgroundColor(Color.YELLOW);
                break;
            case 21:
                button80.setBackgroundColor(Color.YELLOW);
                break;
            case 22:
                button81.setBackgroundColor(Color.YELLOW);
                break;
            case 23:
                button82.setBackgroundColor(Color.YELLOW);
                break;
            case 24:
                button83.setBackgroundColor(Color.YELLOW);
                break;
            case 25:
                button84.setBackgroundColor(Color.YELLOW);
                break;
            case 26:
                button85.setBackgroundColor(Color.YELLOW);
                break;
            case 27:
                button86.setBackgroundColor(Color.YELLOW);
                break;
            case 28:
                button87.setBackgroundColor(Color.YELLOW);
                break;
            case 29:
                button88.setBackgroundColor(Color.YELLOW);
                break;
            case 30:
                button89.setBackgroundColor(Color.YELLOW);
                break;
            case 31:
                button90.setBackgroundColor(Color.YELLOW);
                break;
            case 32:
                button91.setBackgroundColor(Color.YELLOW);
                break;
            case 33:
                button92.setBackgroundColor(Color.YELLOW);
                break;
            case 34:
                button93.setBackgroundColor(Color.YELLOW);
                break;
            case 35:
                button94.setBackgroundColor(Color.YELLOW);
                break;
            case 36:
                button95.setBackgroundColor(Color.YELLOW);
                break;
        }
    }
}