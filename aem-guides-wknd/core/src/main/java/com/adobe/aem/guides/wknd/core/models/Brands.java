package com.adobe.aem.guides.wknd.core.models;

import java.util.List;

import javax.inject.Inject;
import org.apache.sling.api.resource.Resource;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class Brands {
    @Inject
    private String brandName;

    @Inject
    private List<BrandModel> brandModel;
}
