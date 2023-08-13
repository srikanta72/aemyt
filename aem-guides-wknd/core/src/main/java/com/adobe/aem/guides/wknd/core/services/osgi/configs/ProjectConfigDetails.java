package com.adobe.aem.guides.wknd.core.services.osgi.configs;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Project Osgi configuration", description = "Configuration to contain list of Global configurations or inputs")
public @interface ProjectConfigDetails {
    @AttributeDefinition(name = "Google Map API key")
    String gmapApiKey() default "AKMC2345";

    @AttributeDefinition(name = "Concurrent task", description = "Whether or not to schedule this task concurrently")
    String gmapAccessToken() default "A87dhdgsjkffjkvdjvkdufid";

    @AttributeDefinition(name = "A parameter", description = "Can be configured in /system/console/configMgr")
    boolean enabaleGmap() default false;
}
