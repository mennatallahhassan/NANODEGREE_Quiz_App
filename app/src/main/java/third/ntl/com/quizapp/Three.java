package third.ntl.com.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;

public class Three extends AppCompatActivity {
    private int gradeSea = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);
    }

    public void onCheckboxClicked(View v) {
        boolean checked = ((CheckBox) v).isChecked();

        switch (v.getId()) {
            case R.id.first_check:
                if (checked)
                    if (gradeSea == 1)
                        gradeSea++;
                    else
                        gradeSea = 1;
                break;
            case R.id.second_check:
                if (checked)
                    gradeSea = 0;
                break;
            case R.id.third_check:
                if (checked)
                    if (gradeSea == 1)
                        gradeSea++;
                    else
                        gradeSea = 1;
                break;
            case R.id.forth_check:
                if (checked)
                    gradeSea = 0;
                break;
        }
    }

    public void next(View v) {
        int grade = getIntent().getExtras().getInt("GRADE");
        Intent intent = new Intent(this, Four.class);
        String username = getIntent().getExtras().getString("USERNAME");
        intent.putExtra("USERNAME", username);
        intent.putExtra("GRADE", grade + gradeSea);
        startActivity(intent);
    }

}
