package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Luis
 * on 13/08/2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "templates/index.html"})
    public String index() {
        return "index";
    }
}
