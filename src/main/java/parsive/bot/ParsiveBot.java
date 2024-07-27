package parsive.bot;


import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.telegram.abilitybots.api.bot.AbilityBot;
import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Reply;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import parsive.handler.ResponseHandler;

import static org.telegram.abilitybots.api.objects.Locality.ALL;
import static org.telegram.abilitybots.api.objects.Locality.USER;
import static org.telegram.abilitybots.api.objects.Privacy.PUBLIC;

public class ParsiveBot extends AbilityBot {

    public static final String BOT_TOKEN = "6460285241:AAGgEfiMExrGXEzEbnGK1Yer5ts-BRqeZKs";
    public static final String BOT_USERNAME = "JustTestBot";
    private final ResponseHandler responseHandler;

    public ParsiveBot() {
        super(BOT_TOKEN, BOT_USERNAME);
        responseHandler = new ResponseHandler(silent);
    }

    @Override
    public long creatorId() {
        return 1337; // Your ID here
    }

    public Ability startBot() {
        return Ability
                .builder()
                .name("start")
                .info("Says hi")
                .locality(USER)
                .privacy(PUBLIC)
                .action(ctx -> responseHandler.replyToStart(ctx.chatId()))
                .build();
    }

}
