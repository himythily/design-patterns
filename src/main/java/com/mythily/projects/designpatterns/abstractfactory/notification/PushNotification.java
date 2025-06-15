package com.mythily.projects.designpatterns.abstractfactory.notification;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;
import com.mythily.projects.designpatterns.abstractfactory.template.NotificationTemplate;

public class PushNotification extends Notification {
    public PushNotification(String receiver, NotificationTemplate template) {
        super(receiver, template);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.PUSH;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending Push Notification to device : "+getRecipient());
        System.out.println("Push Notification Message : "+getTemplate().getMessage());
    }

}
