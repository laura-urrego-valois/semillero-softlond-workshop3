package notificationSystem.abstractClasses;

import notificationSystem.interfaces.INotification;

public abstract class PushNotification implements INotification {

    private String recipient;
    private String title;
    private String message;

    public PushNotification(String recipient, String title, String message) {
        this.recipient = recipient;
        this.title = title;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public abstract void sendNotification();
}
