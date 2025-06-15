package com.mythily.projects.designpatterns.abstractfactory.sender;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;
import com.mythily.projects.designpatterns.abstractfactory.notification.Notification;

public class EmailNotificationSender extends NotificationSender {
    public EmailNotificationSender(Notification notification) {
        super(notification);
    }

    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void send() {
        System.out.println("Sending email notification to "+getNotification().getRecipient());
    }
}
