package notificationSystem.concreteClasses;

import notificationSystem.abstractClasses.TextMessageNotification;

public class TextMessageNotificationImpl extends TextMessageNotification {

    public TextMessageNotificationImpl(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Sending text message notification to " + getRecipient() + "...");
        System.out.println("Message: " + getMessage());
        System.out.println("Text message notification has been sent!");
    }
}
