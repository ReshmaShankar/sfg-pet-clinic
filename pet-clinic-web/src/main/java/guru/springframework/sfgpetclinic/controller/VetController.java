package guru.springframework.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {

    @RequestMapping({"","/","index","index.html"})
    public String getVets(){
        return "vet/index.html";
    }

}

