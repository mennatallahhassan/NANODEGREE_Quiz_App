package third.ntl.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void startBtn(View view) {
        Intent intent = new Intent(this, One.class);
        EditText editText = (EditText) findViewById(R.id.username_edit);
        String username = editText.getText().toString();
        intent.putExtra("USERNAME", username);
        startActivity(intent);
    }
}
