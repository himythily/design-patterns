package com.mythily.projects.designpatterns.abstractfactory;


import com.mythily.projects.designpatterns.abstractfactory.notification.Notification;
import com.mythily.projects.designpatterns.abstractfactory.sender.NotificationSender;
import com.mythily.projects.designpatterns.abstractfactory.template.NotificationTemplate;

public interface NotificationFactory {
    public NotificationType notificationType();
    public Notification createNotification(String recipient, String sender, NotificationTemplate notificationTemplate);
    public NotificationSender createNotificationSender(Notification notification);
    public NotificationTemplate createNotificationTemplate(String message);
}
