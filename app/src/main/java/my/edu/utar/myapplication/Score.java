package my.edu.utar.myapplication;

import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.database.SQLException;



public class Score<mySQLiteAdapter> extends AppCompatActivity {

    //private SQLiteAdapter mySQLiteAdapter;
    private Button button103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        button103 = findViewById(R.id.button103);
        button103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackMain();
            }
        });
    }

    public void BackMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

        /*mySQLiteAdapter = new SQLiteAdapter(this);
        mySQLiteAdapter.openToWrite();
        mySQLiteAdapter.deleteAll();

        mySQLiteAdapter.insert("Tan Hui Hui",22);
        mySQLiteAdapter.insert("Tan Huey Man",21);
        mySQLiteAdapter.insert("Ng Jin Jin",20);
        mySQLiteAdapter.insert("Oui Yui Theng",20);
        mySQLiteAdapter.insert("Poh Xiao Hui",20);
        mySQLiteAdapter.insert("Tan Wei Ming",19);
        mySQLiteAdapter.insert("Wong Chan Cheng",22);
        mySQLiteAdapter.insert("Tan Kang Xuan",24);

        mySQLiteAdapter.openToRead();

        mySQLiteAdapter.close();

        TextView tv=findViewById(R.id.textView14);
        setContentView(tv);*/

}