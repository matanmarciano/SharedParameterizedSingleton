package com.matanmarciano.sharedparameterizedsingleton.views;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.matanmarciano.sharedparameterizedsingleton.R;
import com.matanmarciano.sharedparameterizedsingleton.databinding.ActivityMainBinding;
import com.matanmarciano.sharedparameterizedsingleton.restClient.RestClient;
import com.matanmarciano.sharedparameterizedsingleton.services.ModelService;
import com.matanmarciano.sharedparameterizedsingleton.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new MainViewModel());

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
