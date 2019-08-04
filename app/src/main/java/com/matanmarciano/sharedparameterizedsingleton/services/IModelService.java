package com.matanmarciano.sharedparameterizedsingleton.services;

import com.matanmarciano.sharedparameterizedsingleton.models.Model;

import java.util.List;

public interface IModelService {
    List<Model> getModels();
    void setModelService(IModelService modelService);
}
