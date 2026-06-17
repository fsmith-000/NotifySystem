import java.util.ArrayList;
/**
 * This is the container class. It sets the service type and delegates the
 * the message delivery to the correct service type.
 * AI Usage: I prompted AI to explain: java why declare a variable with an interface type?
 * this allowed me to better understand the given project parameters. It turns out that
 * using the interface as a type allows a variable to be any type that implements the
 * interface.
 * @author Fred Smith
 */
public class AlertSystem {
    NotificationMedium a_medium;
    ArrayList messages = new ArrayList<String>();
    
    /**
     * This method is called my the main method to set a variable that holds either
     * an object of type EmailService or an object of type SMSService.
     * @param p_medium : a parameter that is used to set the service type specified
     * by the user.
     */
    public void setMedium(NotificationMedium p_medium) {
        a_medium = p_medium;
    }
    
    /**
     * This method delegates the message delivery by calling the send method
     * on the email or sms objects. It also uses an Arraylist to store the message and 
     * convey it to the correct send method.
     * @param message : this is the message input by the user who wants to send
     * a message.
     */
    public void notifyUser(String message) {
        messages.add(message);
        a_medium.send(messages);
        messages.clear();
    }  
}
