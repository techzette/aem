package com.adobe.aem.guides.wknd.core.slingjobs;

import org.apache.sling.event.jobs.Job;
import org.apache.sling.event.jobs.consumer.JobConsumer;
import org.osgi.service.component.annotations.Component;

@Component(service = JobConsumer.class, immediate = true, property = {
        JobConsumer.PROPERTY_TOPICS + "=" + "my/job/topic"
})
public class FirstJobConsumer implements JobConsumer{

    @Override
    public JobResult process(final Job job) {
        // Logic for processing the job
        String property = (String) job.getProperty("customParam");
        return JobResult.OK;
    }

}
