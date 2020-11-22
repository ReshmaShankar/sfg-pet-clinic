package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class IndexController {

    @RequestMapping({"","/","index.html","index"})
    public String index(){
        return "index";
    }
}
