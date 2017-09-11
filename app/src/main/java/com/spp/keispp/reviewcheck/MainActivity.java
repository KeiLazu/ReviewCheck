package com.spp.keispp.reviewcheck;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView keiTxtDisplay;

    Button keiBtnChanger, keiBtnSecondChanger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        keiTxtDisplay = (TextView) findViewById (R.id.keiTxtCustom);

        keiBtnChanger = (Button) findViewById (R.id.keiBtnCustomizer);
        keiBtnSecondChanger = (Button) findViewById (R.id.keiBtnSecondCustomizer);

        keiBtnChanger.setOnClickListener(this);
        keiBtnSecondChanger.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.keiBtnCustomizer :
                keiTxtDisplay.setText("Whoa I'm Changing");
                break;

            case R.id.keiBtnSecondCustomizer :
                Toast.makeText(MainActivity.this, "Toast Coming in", Toast.LENGTH_SHORT).show();

                //Fragment fragment = new FragmentMain();
                //FragmentManager fm = getSupportFragmentManager();
                //FragmentTransaction ft = fm.beginTransaction();
                //ft.replace(R.id.keiFragMain, fragment);
                //ft.commit();

                Intent keiIntentSecond = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(keiIntentSecond);

                break;

        }

    }

}
