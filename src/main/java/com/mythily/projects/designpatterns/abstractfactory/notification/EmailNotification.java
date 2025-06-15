package com.mythily.projects.designpatterns.abstractfactory.notification;

import com.mythily.projects.designpatterns.abstractfactory.NotificationType;
import com.mythily.projects.designpatterns.abstractfactory.template.NotificationTemplate;

public class EmailNotification extends Notification {
    private String sender;
    public EmailNotification(String recipient, String sender, NotificationTemplate template) {
        super(recipient, template);
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }
    @Override
    public NotificationType notificationType() {
        return NotificationType.EMAIL;
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending email to " + getRecipient()+"   from : " + getSender());
        System.out.println("Message : "+ getTemplate().getMessage());
    }
}
