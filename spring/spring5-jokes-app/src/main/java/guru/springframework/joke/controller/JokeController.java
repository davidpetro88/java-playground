package guru.springframework.joke.controller;

import guru.springframework.joke.config.XmlConfigurationExample;
import guru.springframework.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;
    private XmlConfigurationExample xmlConfigurationExample;

//    @Autowired
    public JokeController(JokeService jokeService,
                          XmlConfigurationExample xmlConfigurationExample) {
        this.jokeService = jokeService;
        this.xmlConfigurationExample = xmlConfigurationExample;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("xmlConfigurationExample", xmlConfigurationExample.getMessage());

        return "chucknorris";
    }
}