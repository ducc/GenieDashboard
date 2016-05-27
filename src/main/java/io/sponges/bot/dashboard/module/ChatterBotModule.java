package io.sponges.bot.dashboard.module;

import io.sponges.bot.dashboard.Model;
import io.sponges.bot.dashboard.Routes;
import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class ChatterBotModule extends Module {

    public ChatterBotModule() {
        super("chatterbot");
    }

    @Override
    public ModelAndView execute(Request request, Response response) {
        Model model = new Model(Routes.getUser(request.session()), "chatterbot_module", "Chatter Bot", "Chatter Bot", "Manage the chatter bot module",
                "myguild1_item", "myguild1_modules_item", "myguild1_chatterbot_module_item");
        return new ModelAndView(model.toMap(), "chatterbot_module.mustache");
    }
}