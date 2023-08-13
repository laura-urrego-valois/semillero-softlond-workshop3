package notificationSystem.abstractClasses;

import notificationSystem.interfaces.INotification;

public abstract class EmailNotification implements INotification {

    private String recipient;
    private String subject;
    private String message;

    public EmailNotification(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public abstract void sendNotification();
}
