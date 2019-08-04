package com.matanmarciano.sharedparameterizedsingleton.views;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.matanmarciano.sharedparameterizedsingleton.R;
import com.matanmarciano.sharedparameterizedsingleton.databinding.ActivityMainBinding;
import com.matanmarciano.sharedparameterizedsingleton.databinding.ActivitySecondBinding;
import com.matanmarciano.sharedparameterizedsingleton.viewmodels.MainViewModel;
import com.matanmarciano.sharedparameterizedsingleton.viewmodels.SecondViewModel;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySecondBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        binding.setViewModel(new SecondViewModel());
    }
}
