package edu.usj.ads.helloname;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloName {
    
    @PostMapping (value = "/helloname")   
    public ModelAndView postHelloName (@RequestParam String nome) {
        ModelAndView modelAndView = new ModelAndView("helloname");
        modelAndView.addObject("mensagem", nome);
        return modelAndView;
    }
    @GetMapping (value = "/")
    public ModelAndView getHelloName() {
        return new ModelAndView("index");
    }

}
