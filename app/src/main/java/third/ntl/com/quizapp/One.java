package third.ntl.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class One extends AppCompatActivity {

    private int grade = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one);
    }

    public void onRadioButtonClicked(View v) {
        boolean checked = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.first_radio:
                if (checked)
                    grade = 1;
                break;
            case R.id.second_radio:
                if (checked)
                    grade = 0;
                break;
            case R.id.third_radio:
                if (checked)
                    grade = 0;
                break;
        }
    }

    public void next(View v) {
        Intent intent = new Intent(this, Two.class);
        String username = getIntent().getExtras().getString("USERNAME");
        intent.putExtra("USERNAME", username);
        intent.putExtra("GRADE", grade);
        startActivity(intent);
    }
}
