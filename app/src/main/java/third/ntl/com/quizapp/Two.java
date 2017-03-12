package third.ntl.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.two);
    }

    public void next (View v){

        int grade = getIntent().getExtras().getInt("GRADE");
        TextView textView = (TextView)findViewById(R.id.username_edit);
        String city = textView.getText().toString();
        if (city.matches("Giza") || city.matches("giza") ){
            grade++;
        }
        Intent intent = new Intent(this, Three.class);
        String username = getIntent().getExtras().getString("USERNAME");
        intent.putExtra("USERNAME", username);
        intent.putExtra("GRADE", grade);
        startActivity(intent);
    }
}
