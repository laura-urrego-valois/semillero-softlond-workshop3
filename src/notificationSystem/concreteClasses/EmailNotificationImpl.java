package notificationSystem.concreteClasses;

import notificationSystem.abstractClasses.EmailNotification;

public class EmailNotificationImpl extends EmailNotification {

    public EmailNotificationImpl(String recipient, String subject, String message) {
        super(recipient, subject, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending email notification to " + getRecipient() + "...");
        System.out.println("Subject: " + getSubject());
        System.out.println("Message: " + getMessage());
        System.out.println("Email notification has been sent!");

    }
}
