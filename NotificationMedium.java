import java.util.ArrayList;
/**
 * This interface requires both the EmailService class and the SMSService
 * class to implement the method below.
 * @author Fred Smith
 */
public interface NotificationMedium {
    public void send(ArrayList message);
}
