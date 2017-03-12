package third.ntl.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class Four extends AppCompatActivity {

    int trueFalse = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forth);
    }
    public void onRadioButtonClicked(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch (v.getId()) {
            case R.id.first_radio:
                if (checked)
                    trueFalse = 1 ;
                break;
            case R.id.second_radio:
                if (checked)

                break;
        }
    }
    public void submit(View v) {
        int grade = getIntent().getExtras().getInt("GRADE");
            Intent intent = new Intent(this, Grade.class);
            String username = getIntent().getExtras().getString("USERNAME");
            intent.putExtra("USERNAME", username);

            intent.putExtra("GRADE", grade + trueFalse);
            startActivity(intent);
    }

}
