package notificationSystem.abstractClasses;

import notificationSystem.interfaces.INotification;

public abstract class TextMessageNotification implements INotification {

    private String recipient;
    private String message;

    public TextMessageNotification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public abstract void sendNotification();
}
