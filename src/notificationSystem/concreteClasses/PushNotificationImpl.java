package notificationSystem.concreteClasses;

import notificationSystem.abstractClasses.PushNotification;

public class PushNotificationImpl extends PushNotification {

    public PushNotificationImpl(String recipient, String title, String message) {
        super(recipient, title, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending push notification to " + getRecipient() + "...");
        System.out.println("Title: " + getTitle());
        System.out.println("Message: " + getMessage());
        System.out.println("Push notification has been sent!");

    }
}
