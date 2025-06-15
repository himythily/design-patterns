package com.mythily.projects.designpatterns.abstractfactory.template;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;

public class PushNotificationTemplate extends NotificationTemplate{
    public PushNotificationTemplate(String message){
        super(message);
    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public String applyTemplate() {
        System.out.println("Applying push notification template");
        return getMessage();
    }
}
