import java.util.ArrayList;
/**
 * This class implements the send method from the NotificationMedium interface.
 * @author Fred Smith
 */
public class SMSService implements NotificationMedium {
    
    /**
     * This method sends the message to the user.
     * @param messages ArrayList that holds the message.
     */
    @Override
    public void send(ArrayList messages) {
        System.out.println("Sending Message: " + messages.get(0) + " to SMS");
    }
}
