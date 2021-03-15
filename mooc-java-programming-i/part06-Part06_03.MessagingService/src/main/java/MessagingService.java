
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igor
 */
public class MessagingService {
    private ArrayList<Message> messages;
    // Message significa que a lista é de objetos Message
    
    
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return messages;
    }
    
}
