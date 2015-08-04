package com.bugtags.demo;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bugtags.demo.R;
import com.bugtags.library.Bugtags;
import com.bugtags.wrapper.BugtagsAppCompatActivity;

/**
 * Created by bugtags.com on 15/7/29.
 */
public class FeedbackActivity extends BugtagsAppCompatActivity {

    private EditText mEditText;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        setContentView(R.layout.activity_feedback);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setTitle(R.string.main_feedback);
        }

        mEditText = (EditText) findViewById(R.id.inputText);
    }

    public void onPost(View view) {
        String message = mEditText.getText().toString();
        if (TextUtils.isEmpty(message)) {
            Toast.makeText(this, R.string.feedback_text_empty, Toast.LENGTH_SHORT).show();
            return;
        }

        Bugtags.sendFeedback(message);
        Toast.makeText(this, R.string.feedback_send_succeed, Toast.LENGTH_SHORT).show();

        finish();
    }
}
