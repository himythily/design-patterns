package com.mythily.projects.designpatterns.abstractfactory.sender;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;
import com.mythily.projects.designpatterns.abstractfactory.notification.Notification;

public abstract class NotificationSender {
    private Notification notification;
    public NotificationSender(Notification notification) {
        this.notification = notification;
    }
    public Notification getNotification() {
        return notification;
    }
    public abstract NotificationType notificationType();
    public abstract void send();
}
