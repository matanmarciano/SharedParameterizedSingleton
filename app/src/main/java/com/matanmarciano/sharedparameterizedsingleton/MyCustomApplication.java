package com.matanmarciano.sharedparameterizedsingleton;

import android.app.Application;

import com.matanmarciano.sharedparameterizedsingleton.restClient.RestClient;
import com.matanmarciano.sharedparameterizedsingleton.services.ModelService;

public class MyCustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        RestClient.getInstance().setModelService(new ModelService());
    }
}
