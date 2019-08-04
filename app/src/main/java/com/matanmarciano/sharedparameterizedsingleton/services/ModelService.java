package com.matanmarciano.sharedparameterizedsingleton.services;

import com.matanmarciano.sharedparameterizedsingleton.models.Model;

import java.util.ArrayList;
import java.util.List;

public class ModelService implements IModelService {
    @Override
    public List<Model> getModels() {
        List<Model> models = new ArrayList<>();
        models.add(new Model("Foo", 1234));
        models.add(new Model("Bar", 4321));

        return models;
    }

    @Override
    public void setModelService(IModelService modelService) {
        // Do nothing
    }
}
