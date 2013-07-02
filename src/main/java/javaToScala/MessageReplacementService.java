package javaToScala;

import javax.inject.Named;
import java.util.concurrent.atomic.AtomicLong;

/**
 * A simple spring service get and set the default replacement message.
 */
@Named("MessageReplacementService")
public class MessageReplacementService {

    private String replacementMessage = "SUPER JAVA!";

    public String getReplacementMessage() {
        return replacementMessage;
    }

    public void setReplacementMessage(String replacementMessage) {
        this.replacementMessage = replacementMessage;
    }
}
