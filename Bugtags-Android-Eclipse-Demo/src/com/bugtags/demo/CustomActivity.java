package com.bugtags.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

import com.bugtags.demo.R;
import com.bugtags.library.Bugtags;

/**
 * Created by bugtags.com on 15/7/28.
 */
public class CustomActivity extends Activity {

    /**
     * 回调1
     *
     * @param var1
     */
    protected void onCreate(Bundle var1) {
        super.onCreate(var1);

        setContentView(R.layout.activity_custom);

        Bugtags.onCreate(this);
    }

    /**
     * 回调2
     */
    protected void onResume() {
        super.onResume();
        Bugtags.onResume(this);
    }

    /**
     * 回调3
     */
    protected void onPause() {
        super.onPause();
        Bugtags.onPause(this);
    }

    /**
     * 回调4
     */
    protected void onDestroy() {
        super.onDestroy();
        Bugtags.onDestroy(this);
    }

    /**
     * 回调5
     */
    public boolean dispatchTouchEvent(MotionEvent var1) {
        Bugtags.onDispatchTouchEvent(this, var1);
        return super.dispatchTouchEvent(var1);
    }

    public void onBack(View view) {
        finish();
    }
}
