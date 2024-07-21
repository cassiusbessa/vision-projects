package com.github.cassiusbessa.vision.domain.core.events;

import com.github.cassiusbessa.vision.domain.core.entities.Project;
import com.github.cassiusbessa.vision.domain.service.ports.output.messages.ProjectEventMessagePublisher;

import java.util.Date;

public class ProjectCreatedEvent extends ProjectEvent{

    private final ProjectEventMessagePublisher publisher;

    public ProjectCreatedEvent(Project project, Date occurredOn, ProjectEventMessagePublisher publisher) {
        super(project, occurredOn);
        this.publisher = publisher;
    }

    @Override
    public void fire() {
        publisher.publish(this);
    }
}
