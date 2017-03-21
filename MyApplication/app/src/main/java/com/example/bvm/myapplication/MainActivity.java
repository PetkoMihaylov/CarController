package com.example.bvm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method




    }
    public int i=0;

    public void pressed_up(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        i=90;
        tv.setText(String.valueOf(i));
    }

    public void pressed_down(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        i=270;
        tv.setText(String.valueOf(i));
    }

    public void pressed_left(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        i=180;
        tv.setText(String.valueOf(i));

    }
    public void pressed_right(View view) {
        TextView tv = (TextView) findViewById(R.id.textView);
        i=0;
        tv.setText(String.valueOf(i));

    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
}

