import java.util.ArrayList;
/**
 * (New Information): This interface is implemented by the EmailService class, 
 * the SMSService class and the WhatsAppService class.
 * @author Fred Smith
 */
public interface NotificationMedium {
    public void send(ArrayList message);
}
