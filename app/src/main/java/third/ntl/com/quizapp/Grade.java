package third.ntl.com.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class Grade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grade);

        int grade = getIntent().getExtras().getInt("GRADE");
        TextView textView = (TextView) findViewById(R.id.grade);
        textView.setText(grade + "/5");

        String username = getIntent().getExtras().getString("USERNAME");
        TextView usernameTextView = (TextView) findViewById(R.id.Congrats);
        if (grade > 2) {
            usernameTextView.setText("Well done " + username + "!");
        }
        else{
        usernameTextView.setText("Try again " + username + "!");
        }

        Toast.makeText(getApplicationContext(),"Your grade is"+ grade + "/5", Toast.LENGTH_LONG).show();

    }

}
