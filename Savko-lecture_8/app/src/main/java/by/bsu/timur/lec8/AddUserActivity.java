package by.bsu.timur.lec8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddUserActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.android.wordlistsql.REPLY";

    private EditText editUserNameView;
    private EditText editUserSurnameView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user_activity);
        editUserNameView = findViewById(R.id.edit_name);
        editUserSurnameView = findViewById(R.id.edit_surname);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(editUserNameView.getText()) || TextUtils.isEmpty(editUserSurnameView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String[] user = new String[2];
                    user[0] = editUserNameView.getText().toString();
                    user[1] = editUserSurnameView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, user);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });
    }
}
