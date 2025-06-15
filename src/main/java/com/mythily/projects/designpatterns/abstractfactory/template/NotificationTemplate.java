package com.mythily.projects.designpatterns.abstractfactory.template;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;

public abstract class NotificationTemplate {
    private String message;

    public NotificationTemplate(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public abstract NotificationType notificationType();
    public abstract String applyTemplate();
}
