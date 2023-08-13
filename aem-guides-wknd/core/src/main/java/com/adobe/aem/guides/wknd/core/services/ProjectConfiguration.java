package com.adobe.aem.guides.wknd.core.services;

import java.util.Map;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.adobe.aem.guides.wknd.core.services.osgi.configs.ProjectConfigDetails;

@Designate(ocd = ProjectConfigDetails.class)
@Component(service = ProjectConfiguration.class, configurationPolicy= ConfigurationPolicy.OPTIONAL, immediate = true)
public class ProjectConfiguration {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private String gmapApiKey;
    Map<String, ?> allProperties;

    @Activate
    protected void activate(final ProjectConfigDetails config, Map<String, ?> allProperties) {
        gmapApiKey = config.gmapApiKey();
        this.allProperties = allProperties;
        logger.debug("Activate is now running, gmapApiKey='{}'", gmapApiKey);
    }

    public String get(String key) {
        return allProperties.get(key).toString();
    }

    public String getGmapApiKey() {
        return gmapApiKey;
    }
}
