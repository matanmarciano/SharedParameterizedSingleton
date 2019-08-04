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

        // This commented code will fix the issue but what if tomorrow will come another developer that add
        // own activity and declare it to be the first activity? this developer dont know about
        // RestClient and the need to call setModelService at the begin of first activity.

        //RestClient.getInstance().setModelService(new ModelService());

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new MainViewModel());

        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
