package com.norman.tutorialdagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.norman.tutorialdagger.feature.help.HelpActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    @Inject
    MainPresenterImpl presenter;

    Button helpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter.loadData();

        helpButton = findViewById(R.id.button_help);

        helpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HelpActivity.class));
            }
        });
    }

    @Override
    public void showResult() {
        Toast.makeText(this, "Huehuehue", Toast.LENGTH_SHORT).show();
    }
}
