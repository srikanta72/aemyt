package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.adobe.aem.guides.wknd.core.models.NestedFieldModel;
import com.adobe.aem.guides.wknd.core.models.Brands;

import lombok.Getter;

@Model(adaptables = Resource.class, adapters = NestedFieldModel.class)
public class NestedFieldModelImpl implements NestedFieldModel {

    @Inject
    @Getter
    @Named("brands/.")
    private List<Brands> brands;
}
