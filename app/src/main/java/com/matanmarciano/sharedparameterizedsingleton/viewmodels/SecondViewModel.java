package com.matanmarciano.sharedparameterizedsingleton.viewmodels;

import android.databinding.BaseObservable;
import android.util.Log;

import com.matanmarciano.sharedparameterizedsingleton.models.Model;
import com.matanmarciano.sharedparameterizedsingleton.restClient.RestClient;

import java.util.Arrays;
import java.util.List;

public class SecondViewModel extends BaseObservable {
    public SecondViewModel() {
        List<Model> models = RestClient.getInstance().getModels();
        if(models != null) {
            Log.i("SHARED_SINGLTONE", "I am SecondViewModel, models: " + Arrays.toString(models.toArray()));
        }
        else {
            Log.i("SHARED_SINGLTONE", "I am SecondViewModel, models is null");
        }
    }
}
