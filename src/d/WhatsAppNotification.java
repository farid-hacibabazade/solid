package d;

public class WhatsAppNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }
}
