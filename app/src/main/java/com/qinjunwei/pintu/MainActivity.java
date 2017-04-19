package com.qinjunwei.pintu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qinjunwei.pintu.view.GamePintuLayout;

public class MainActivity extends AppCompatActivity {

    private GamePintuLayout mGameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGameView = (GamePintuLayout) findViewById(R.id.id_gameview);
    }
}
