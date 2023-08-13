package notificationSystem;

import notificationSystem.abstractClasses.EmailNotification;
import notificationSystem.abstractClasses.PushNotification;
import notificationSystem.abstractClasses.TextMessageNotification;
import notificationSystem.concreteClasses.EmailNotificationImpl;
import notificationSystem.concreteClasses.PushNotificationImpl;
import notificationSystem.concreteClasses.TextMessageNotificationImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("----------EMAIL----------");
        System.out.println("Enter the email address of the recipient: ");
        String emailRecipient = scanner.nextLine();
        System.out.println("Enter the subject of the email: ");
        String emailSubject = scanner.nextLine();
        System.out.println("Enter the message of the email: ");
        String emailMessage = scanner.nextLine();

        EmailNotification emailNotification = new EmailNotificationImpl(emailRecipient, emailSubject, emailMessage);
        emailNotification.sendNotification();

        System.out.println("----------//----------");

        System.out.println("----------TEXT MESSAGE----------");
        System.out.println("Enter the recipient's mobile phone number: ");
        String textMessageRecipient = scanner.nextLine();
        System.out.println("Enter the message of the text message: ");
        String textMessageMessage = scanner.nextLine();

        TextMessageNotification textMessageNotification = new TextMessageNotificationImpl(textMessageRecipient, textMessageMessage);
        textMessageNotification.sendNotification();

        System.out.println("----------//----------");

        System.out.println("----------PUSH NOTIFICATION----------");
        System.out.println("Enter the recipient of the push notification: ");
        String pushNotificationRecipient = scanner.nextLine();
        System.out.println("Enter the title of the push notification: ");
        String pushNotificationTitle = scanner.nextLine();
        System.out.println("Enter the message of the push notification: ");
        String pushNotificationMessage = scanner.nextLine();

        PushNotification pushNotification = new PushNotificationImpl(pushNotificationRecipient, pushNotificationTitle, pushNotificationMessage);
        pushNotification.sendNotification();

        System.out.println("----------END----------");


    }
}
