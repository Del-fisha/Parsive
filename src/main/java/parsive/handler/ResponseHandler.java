package parsive.handler;

import org.telegram.abilitybots.api.sender.SilentSender;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class ResponseHandler {
    private final SilentSender sender;


    public ResponseHandler(SilentSender sender) {
        this.sender = sender;

    }

    public void replyToStart(long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Finally it works");
        sender.execute(message);
    }

}
