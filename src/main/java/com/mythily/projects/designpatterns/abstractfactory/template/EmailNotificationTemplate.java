package com.mythily.projects.designpatterns.abstractfactory.template;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;

public class EmailNotificationTemplate extends NotificationTemplate{

    public EmailNotificationTemplate(String message) {
        super(message);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying Email Notification Template");
        return getMessage();
    }
}
