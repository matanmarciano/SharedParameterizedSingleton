package com.matanmarciano.sharedparameterizedsingleton.restClient;

import com.matanmarciano.sharedparameterizedsingleton.models.Model;
import com.matanmarciano.sharedparameterizedsingleton.services.IModelService;

import java.util.List;

public class RestClient implements IModelService {
    private static RestClient instance = new RestClient();
    private IModelService modelService;

    public static RestClient getInstance() {
        return instance;
    }

    @Override
    public List<Model> getModels() {
        return modelService != null ? modelService.getModels() : null;
    }

    @Override
    public void setModelService(IModelService modelService) {
        this.modelService = modelService;
    }
}
