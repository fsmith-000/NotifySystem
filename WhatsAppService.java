import java.util.ArrayList;

/**
 * (New Information): AI Usage: Went to google.com and switched to "AI Mode". I typed in the following
 * prompt:
 * Given this class: <Code from EmailService Class> I want you to write a similar 
 * class called WhatsAppService.
 * AI produced the same class I produced. It also suggested ways to improve the 
 * code. I did not use the suggestions because they are outside the required
 * parameters. AI suggested using java generics on the ArrayList to prevent
 * type safety warnings among other things.
 * @author Fred Smith
 * 
 */
public class WhatsAppService implements NotificationMedium {
 /**
  * This method sends the message to the user.
  * @param messages Arraylist that holds the messages.
  */
    @Override
    public void send(ArrayList messages) {
        System.out.println("Whats-App sending message: " + messages);
    }
}
