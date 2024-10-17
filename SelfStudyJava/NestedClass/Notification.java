package NestedClass;

public interface Notification {
    public void sendMessage(String message);
}

class NotificationService {
    public void notifyUser(Notification notification, String message) {
        notification.sendMessage(message);
    }
}

class Main {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        // Gửi thông báo qua email
        service.notifyUser(new Notification() {
            @Override
            public void sendMessage(String message) {
                System.out.println("Email Notification: " + message);
            }
        }, "You have a new email!");

        // Gửi thông báo qua SMS
        service.notifyUser(new Notification() {
            @Override
            public void sendMessage(String message) {
                System.out.println("SMS Notification: " + message);
            }
        }, "Your package has been shipped!");
    }
}


