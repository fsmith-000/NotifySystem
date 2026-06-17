/** This program simulates a notification system. It gets a message from the 
 * user and asks whether they want to send the message via email or sms.
 * It uses composition to delegate the message to either email or sms.
 */
import java.util.Scanner;

/**
 * This class contains the main method. It provides a basic driver for the 
 * program. It gets user input, instantiates a service and container object
 * , and uses the container object to complete message delivery. Class 
 * AlertSystem is instantiated here which creates composition. Class NotifySystem
 * has an AlertSystem object. 
 * (New Information): This class was modified for version 1.0.1. It allows the user
 * to use Whats-App as a new notification system. I also corrected the code to allow
 * proper exiting of the program. Version 1.0.0 had a bug that didn't allow you to
 * exit properly.
 * AI Usage: AI was used to plan and implement this class.
 * This query was provided to Google AI:
 * java can I use composition from my main method? This query was used to verify 
 * that I was using composition correctly. It gave me an example of composition.
 * I used that example to model my this class and to avoid issues with calling a
 * non-static method from a static context. The example led me to instantiate
 * AlertSystem in my main method.
 * @author Fred Smith
 * @version version 1.0.1 (newly added)
 */
public class NotifySystem {
    public static void main(String[] args) {
        AlertSystem as = new AlertSystem();
        String p_message;
        String systemType;
        NotificationMedium p_medium;
       
        while(true) {
            System.out.print("Enter a message or 'e' to exit: ");
            Scanner sc = new Scanner(System.in);
            p_message = sc.nextLine();
            if(p_message.equals("e"))
                break;
            System.out.print("Send message over 'email' or 'sms' or 'whats-app' ? ");
            systemType = sc.nextLine();
            if(systemType.equals("email")){
                p_medium = new EmailService();
            } else if(systemType.equals("sms")) {
                p_medium = new SMSService();
            } else
                p_medium = new WhatsAppService();
            as.setMedium(p_medium);
            as.notifyUser(p_message);
        } 
    }
}

