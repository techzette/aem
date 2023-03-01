package com.adobe.aem.guides.wknd.core.services;

import org.apache.sling.event.jobs.JobManager;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.HashMap;
import java.util.Map;

@Component
public class JobProducerService {

    @Reference
    private JobManager jobManager;

    public void triggerJob() {
        Map<String, Object> jobProperties = new HashMap<>();
        jobProperties.put("customParam", "value");
        jobManager.addJob("my/job/topic", jobProperties);
    }

}
