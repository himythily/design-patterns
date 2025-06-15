package com.mythily.projects.designpatterns.abstractfactory.notification;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;
import com.mythily.projects.designpatterns.abstractfactory.template.NotificationTemplate;

public abstract class Notification {
    private String recipient;
    private NotificationTemplate template;

    public Notification(String recipient, NotificationTemplate template) {
        this.recipient = recipient;
        this.template = template;
    }
    public String getRecipient() {
        return recipient;
    }
    public NotificationTemplate getTemplate() {
        return template;
    }
    public abstract NotificationType notificationType();
    public abstract void sendNotification();
}
